public class QueueUsingArray {
    int front, rear, size;
    int capacity;
    int[] queue;
    QueueUsingArray(int capacity) {
        this.capacity = capacity;
        front = 0;
        size = 0;
        rear = -1;
        queue = new int[capacity];
    }
    void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println(item + " added to queue");
    }
    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(queue[front] + " removed from queue");
        front = (front + 1) % capacity;
        size--;
    }
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
