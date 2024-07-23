package com.company;

public class CircularQueue {
    private int front, rear, size;
    private final int MAX;
    private final int[] a;

    public CircularQueue(int maxSize) {
        MAX = maxSize;
        a = new int[MAX];
        front = -1;
        rear = -1;
        size = 0;
    }

    void Enqueue(int data) {
        if ((rear == MAX - 1 && front == 0) || (rear + 1 == front)) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == MAX - 1) {
            rear = 0;
        } else {
            rear++;
        }
        a[rear] = data;
        if (front == -1) {
            front = 0;
        }
        size++;
    }

    int Dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = a[front];
        if (front == rear) {
            front = rear = -1;
        } else if (front == MAX - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return data;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);

        System.out.println("Dequeued: " + queue.Dequeue());
        System.out.println("Dequeued: " + queue.Dequeue());
        System.out.println("Dequeued: " + queue.Dequeue());

        queue.Enqueue(60);
        queue.Enqueue(70);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.Dequeue());
        }
    }
}
