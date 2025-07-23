package linkedlist;

public class LinkedListInsert {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.display();
        System.out.println("\nBefore Delete.....");
        linkedList.delete(1);
        linkedList.display();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(data);
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked is Null");
            return;
        }
        System.out.print(head.data);
        Node cur = head.next;
        while (cur != null) {
            System.out.print("->" + cur.data);
            cur = cur.next;
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("LinkedList is Null");
            return;
        }
        if (head.data == data) {
            if (head.next != null) {
                head = head.next;
                return;
            }
            head = null;
            return;
        }
        Node cur = head.next;
        Node prev = head;
        while (cur != null) {
            if (cur.data == data) {
                prev.next = cur.next;
                return;
            }
            prev = cur;
            cur = cur.next;

        }

    }
}