package Queue;

public class Queue1 {
    int front, rear;
    int capacity;
    int arr[];

    Queue1(int cap) {
        capacity = cap;
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }

    boolean isFull() {
        if (rear == capacity - 1)
            System.out.println("OverFlow, can't enqueue.");
        return (rear == capacity - 1);
    }

    boolean isEmpty() {
        if (front == -1)
            System.out.println("UnderFlow, can't dequeue");
        return (front == -1);
    }

    void enqueue(int item) {
        if (isFull())
            return;
        if (front == -1)
            front = 0;
        rear++;
        arr[rear] = item;
        System.out.println(item + " enqueued to Queue.");
    }

    int dequeue() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        int item = arr[front];
        front++;
        if (front > rear)
            front = rear = -1;
        System.out.println(item + " dequeued from the Queue.");
        return item;
    }

    int front() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        return arr[front];
    }

    int rear() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        return arr[rear];
    }
}

    class Temp {
        public static void main(String[] args) {
            Queue1 queue1 = new Queue1(5);
            queue1.enqueue(10);
            queue1.enqueue(20);
            queue1.enqueue(30);
            queue1.enqueue(40);

            queue1.dequeue();
            queue1.dequeue();

            System.out.println("Front: "+queue1.front());
            System.out.println("Rear: "+queue1.rear());
        }

    }