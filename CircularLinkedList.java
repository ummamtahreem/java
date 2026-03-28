class CircularLinkedList {
    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
    Node head;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }
    void delete(int data) {
        if (head == null) return;
      Node curr = head, prev = null;
                if (head.data == data) {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;

            if (head.next == head) {
              head = null;
                return;
            }
            temp.next = head.next;
            head = head.next;
            return;
        }
        do {
            prev = curr;
            curr = curr.next;
        } while (curr != head && curr.data != data);

        if (curr.data == data) prev.next = curr.next;
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.display();  
        cll.delete(20);
        cll.display();  
    }
}
