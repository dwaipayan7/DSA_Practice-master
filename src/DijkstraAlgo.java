import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.ArrayList;

class Graph<T> {
    private List<Edge<T>> allEdges;
    private Map<Long, Vertex<T>> allVertex;
    boolean isDirected = false;

    public Graph(boolean isDirected) {
        allEdges = new ArrayList<Edge<T>>();
        allVertex = new HashMap<Long, Vertex<T>>();
        this.isDirected = isDirected;
    }

    public void addEdge(long id1, long id2, int weight) {
        Vertex<T> vertex1 = null;
        if (allVertex.containsKey(id1)) {
            vertex1 = allVertex.get(id1);
        } else {
            vertex1 = new Vertex<T>(id1);
            allVertex.put(id1, vertex1);
        }
        Vertex<T> vertex2 = null;
        if (allVertex.containsKey(id2)) {
            vertex2 = allVertex.get(id2);
        } else {
            vertex2 = new Vertex<T>(id2);
            allVertex.put(id2, vertex2);
        }

        Edge<T> edge = new Edge<T>(vertex1, vertex2, weight, isDirected);
        allEdges.add(edge);
        vertex1.addAdjacentVertex(edge, vertex2);
        if (!isDirected) {
            vertex2.addAdjacentVertex(edge, vertex1);
        }
    }

    public List<Edge<T>> getAllEdges() {
        return allEdges;
    }

    public List<Vertex<T>> getAllVertex() {
        return new ArrayList<Vertex<T>>(allVertex.values());
    }

    public Vertex<T> getVertex(long id) {
        return allVertex.get(id);
    }

    public void setDataForVertex(long id, T data) {
        if (allVertex.containsKey(id)) {
            Vertex<T> vertex = allVertex.get(id);
            vertex.setData(data);
        }
    }
}

class Vertex<T> {
    long id;
    private T data;
    private List<Edge<T>> edges = new ArrayList<>();
    private List<Vertex<T>> adjacentVertex = new ArrayList<>();

    Vertex(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void addAdjacentVertex(Edge<T> e, Vertex<T> v) {
        edges.add(e);
        adjacentVertex.add(v);
    }

    public List<Vertex<T>> getAdjacentVertexes() {
        return adjacentVertex;
    }

    public List<Edge<T>> getEdges() {
        return edges;
    }

    @Override
    public int hashCode() {
        return (int) id;
    }

    @Override
    public boolean equals(Object obj) {
        Vertex<T> other = (Vertex<T>) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}

class Edge<T> {
    private boolean isDirected = false;
    private Vertex<T> vertex1;
    private Vertex<T> vertex2;
    private int weight;

    Edge(Vertex<T> vertex1, Vertex<T> vertex2, int weight, boolean isDirected) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
        this.isDirected = isDirected;
    }

    Edge(Vertex<T> vertex1, Vertex<T> vertex2, int weight) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }

    Vertex<T> getVertex1() {
        return vertex1;
    }

    Vertex<T> getVertex2() {
        return vertex2;
    }

    int getWeight() {
        return weight;
    }

    public boolean isDirected() {
        return isDirected;
    }

    @Override
    public String toString() {
        return "Edge [isDirected=" + isDirected + ", vertex1=" + vertex1 + ", vertex2=" + vertex2 + ", weight=" + weight
                + "]";
    }
}

class BinaryMinHeap<T> {
    private List<Node> allNodes = new ArrayList<>();
    private Map<T, Integer> nodePosition = new HashMap<>();

    public class Node {
        int weight;
        T key;
    }

    public void add(int weight, T key) {
        Node node = new Node();
        node.weight = weight;
        node.key = key;
        allNodes.add(node);
        int size = allNodes.size();
        int current = size - 1;
        int parentIndex = (current - 1) / 2;
        nodePosition.put(node.key, current);

        while (parentIndex >= 0) {
            Node parentNode = allNodes.get(parentIndex);
            Node currentNode = allNodes.get(current);
            if (parentNode.weight > currentNode.weight) {
                swap(parentNode, currentNode);
                updatePositionMap(parentNode.key, currentNode.key, parentIndex, current);
                current = parentIndex;
                parentIndex = (parentIndex - 1) / 2;
            } else {
                break;
            }
        }
    }

    public void decrease(T data, int newWeight) {
        Integer position = nodePosition.get(data);
        allNodes.get(position).weight = newWeight;
        int parent = (position - 1) / 2;
        while (parent >= 0) {
            if (allNodes.get(parent).weight > allNodes.get(position).weight) {
                swap(allNodes.get(parent), allNodes.get(position));
                updatePositionMap(allNodes.get(parent).key, allNodes.get(position).key, parent, position);
                position = parent;
                parent = (parent - 1) / 2;
            } else {
                break;
            }
        }
    }

    public Node extractMinNode() {
        int size = allNodes.size() - 1;
        Node minNode = new Node();
        minNode.key = allNodes.get(0).key;
        minNode.weight = allNodes.get(0).weight;

        int lastNodeWeight = allNodes.get(size).weight;
        allNodes.get(0).weight = lastNodeWeight;
        allNodes.get(0).key = allNodes.get(size).key;
        nodePosition.remove(minNode.key);
        nodePosition.remove(allNodes.get(0).key);
        nodePosition.put(allNodes.get(0).key, 0);
        allNodes.remove(size);

        int currentIndex = 0;
        size--;
        while (true) {
            int left = 2 * currentIndex + 1;
            int right = 2 * currentIndex + 2;
            if (left > size) {
                break;
            }
            if (right > size) {
                right = left;
            }
            int smallerIndex = allNodes.get(left).weight <= allNodes.get(right).weight ? left : right;
            if (allNodes.get(currentIndex).weight > allNodes.get(smallerIndex).weight) {
                swap(allNodes.get(currentIndex), allNodes.get(smallerIndex));
                updatePositionMap(allNodes.get(currentIndex).key, allNodes.get(smallerIndex).key, currentIndex,
                        smallerIndex);
                currentIndex = smallerIndex;
            } else {
                break;
            }
        }
        return minNode;
    }

    public boolean containsData(T key) {
        return nodePosition.containsKey(key);
    }

    public T min() {
        return allNodes.get(0).key;
    }

    public boolean empty() {
        return allNodes.size() == 0;
    }

    private void swap(Node node1, Node node2) {
        int weight = node1.weight;
        T data = node1.key;

        node1.key = node2.key;
        node1.weight = node2.weight;

        node2.key = data;
        node2.weight = weight;
    }

    private void updatePositionMap(T data1, T data2, int pos1, int pos2) {
        nodePosition.remove(data1);
        nodePosition.remove(data2);
        nodePosition.put(data1, pos1);
        nodePosition.put(data2, pos2);
    }

    public Integer getWeight(T key) {
        Integer position = nodePosition.get(key);
        if (position == null) {
            return null;
        } else {
            return allNodes.get(position).weight;
        }
    }
}

public class DijkstraAlgo {

    public static class DijkstraShortestPath {

        public Map<Vertex<Integer>, Integer> shortestPath(Graph<Integer> graph, Vertex<Integer> sourceVertex) {

            // heap + map data structure
            BinaryMinHeap<Vertex<Integer>> minHeap = new BinaryMinHeap<>();

            // stores shortest distance from root to every vertex
            Map<Vertex<Integer>, Integer> distance = new HashMap<>();

            // stores parent of every vertex in shortest distance
            Map<Vertex<Integer>, Vertex<Integer>> parent = new HashMap<>();

            // initialize all vertex with infinite distance from source vertex
            for (Vertex<Integer> vertex : graph.getAllVertex()) {
                minHeap.add(Integer.MAX_VALUE, vertex);
            }

            // set distance of source vertex to 0
            minHeap.decrease(sourceVertex, 0);

            // put it in map
            distance.put(sourceVertex, 0);

            // source vertex parent is null
            parent.put(sourceVertex, null);

            // iterate till heap is not empty
            while (!minHeap.empty()) {
                // get the min value from heap node which has vertex and distance of that vertex from
                // source vertex.
                BinaryMinHeap<Vertex<Integer>>.Node heapNode = minHeap.extractMinNode();
                Vertex<Integer> current = heapNode.key;

                // update shortest distance of current vertex from source vertex
                distance.put(current, heapNode.weight);

                // iterate through all edges of current vertex
                for (Edge<Integer> edge : current.getEdges()) {

                    // get the adjacent vertex
                    Vertex<Integer> adjacent = getVertexForEdge(current, edge);

                    // if heap does not contain adjacent vertex means adjacent vertex already has
                    // shortest distance from source vertex
                    if (!minHeap.containsData(adjacent)) {
                        continue;
                    }

                    // add distance of current vertex to edge weight to get distance of adjacent vertex
                    // from source vertex
                    // when it goes through current vertex
                    int newDistance = distance.get(current) + edge.getWeight();

                    // see if this above calculated distance is less than current distance stored for
                    // adjacent vertex from source vertex
                    if (minHeap.getWeight(adjacent) > newDistance) {
                        minHeap.decrease(adjacent, newDistance);
                        parent.put(adjacent, current);
                    }
                }
            }
            return distance;
        }

        private Vertex<Integer> getVertexForEdge(Vertex<Integer> v, Edge<Integer> e) {
            return e.getVertex1().equals(v) ? e.getVertex2() : e.getVertex1();
        }

        public static void main(String args[]) {
            Graph<Integer> graph = new Graph<>(false);

            graph.addEdge(1, 2, 5);
            graph.addEdge(2, 3, 2);
            graph.addEdge(1, 4, 9);
            graph.addEdge(1, 5, 3);
            graph.addEdge(5, 6, 2);
            graph.addEdge(6, 4, 2);
            graph.addEdge(3, 4, 3);

            DijkstraShortestPath dsp = new DijkstraShortestPath();
            Vertex<Integer> sourceVertex = graph.getVertex(1);
            Map<Vertex<Integer>, Integer> distance = dsp.shortestPath(graph, sourceVertex);
            System.out.print(distance);
        }
    }
}
