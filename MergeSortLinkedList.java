class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
class MergeSortLinkedList {
    Node head;
    Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.data <= b.data) {
            a.next = sortedMerge(a.next, b);
            return a;
        } else {
            b.next = sortedMerge(a, b.next);
            return b;
        }
    }
    Node getMiddle(Node h) {
        if (h == null) return h;
        Node slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    Node mergeSort(Node h) {
        if (h == null || h.next == null)
            return h;
        Node middle = getMiddle(h);
        Node nextOfMiddle = middle.next;
        middle.next = null;
        Node left = mergeSort(h);
        Node right = mergeSort(nextOfMiddle);
        return sortedMerge(left, right);
    }
    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        MergeSortLinkedList li = new MergeSortLinkedList();
        li.push(15);
        li.push(10);
        li.push(5);
        li.push(20);
        li.push(3);
        li.push (2);
        System.out.println("Original Linked List:");
        li.printList(li.head);
        li.head = li.mergeSort(li.head);
        System.out.println("\nSorted Linked List:");
        li.printList(li.head);
    }
}
