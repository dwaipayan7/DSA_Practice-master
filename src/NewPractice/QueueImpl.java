package NewPractice;

public class QueueImpl {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

   static Node front, rear;

    void enqueue(int data){
        Node node = new Node(data);
        if (front == null){
            rear = front = node;
        }
        rear.next = node;
        rear = node;
    }

    int dequeue() throws Exception {
        if (front == null){
            throw new Exception("No data found");
        }

        int result = front.data;
        front = front.next;

       return result;
    }

    void printQueue(){
        if (front == null){
            System.out.print("Queue is empty");
            return;
        }

        Node curr = front;

        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();

    }

    public static void main(String[] args) throws Exception {

        QueueImpl queue = new QueueImpl();

        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        // Enqueue more elements
        queue.enqueue(40);
        queue.enqueue(50);

        // Dequeue remaining elements
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.printQueue();

    }

}
