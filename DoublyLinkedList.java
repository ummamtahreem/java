class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    Node head;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void delete(int data) {
        Node temp = head;
        while (temp != null && temp.data != data)
            temp = temp.next;
        if (temp == null) return;

        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;

        if (temp.next != null) temp.next.prev = temp.prev;
    }
    void display() {
        Node temp = head;
        System.out.print("Doubly List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.display(); 
        dll.delete(20);
        dll.display();  
    }
}


