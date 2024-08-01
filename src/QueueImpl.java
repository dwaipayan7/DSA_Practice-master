public class QueueImpl {

    static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        // Constructor to initialize the queue
        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
            front = 0;
        }

        // Method to insert an element into the queue
        public void insert(int item) {
            if (rear == size - 1) {
                System.out.println("Overflow");
            } else {
                rear = rear + 1;
                arr[rear] = item;
            }
        }

        // Method to delete an element from the queue
        public int deleteItem() {
            if (front > rear) {
                System.out.println("Underflow");
                return -1; // or throw an exception
            } else {
                int item = arr[front];
                front = front + 1;
                return item;
            }
        }

        // Method to display elements of the queue
        public void display() {
            if (rear == -1) {
                System.out.println("Queue is empty");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);

        q.display(); // Should print: 10 20 30

        System.out.println("Deleted item: " + q.deleteItem()); // Should delete and print 10
        q.display(); // Should print: 20 30

        System.out.println("Deleted item: " + q.deleteItem()); // Should delete and print 20
        q.display(); // Should print: 30

        q.insert(40);
        q.display(); // Should print: 30 40
    }
}
