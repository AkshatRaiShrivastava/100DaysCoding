import java.util.ArrayList;
import java.util.Collections;

public class mergeTwoSortedLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        a.next = new Node(20);
        a.next.next = new Node(30);
        a.next.next.next = new Node(40);
        a.next.next.next.next = new Node(50);
        a.next.next.next.next.next = new Node(90); // 10->20->30->40->50->30

        Node b = new Node(6);
        b.next = new Node(90);
        b.next.next = new Node(100);
        Node result = mergeListOptimized(a, b);
        while (result != null) {
            System.out.print(result.data + " -> ");
            result = result.next;
        }
        System.out.println("Null");
    }

    // brute force approach
    public static Node mergeListBruteForce(Node a, Node b) {
        // create linked list
        ArrayList<Integer> ls = new ArrayList<>();
        while (a != null) {
            ls.add(a.data);
            a = a.next;
        }
        while (b != null) {
            ls.add(b.data);
            b = b.next;
        }
        Collections.sort(ls);
        Node temp = new Node(-1);
        Node head = temp;
        for (int val : ls) {
            temp.next = new Node(val);
            temp = temp.next;
        }
        head = head.next;
        return head;
    }

    // recursion approach
    public static Node mergeListRecur(Node a, Node b) {
        Node result = null;
        // base cases
        if (a == null)
            return b;
        else if (b == null)
            return a;

        if (a.data <= b.data) {
            result = a;
            result.next = mergeListRecur(a.next, b);
        } else {
            result = b;
            result.next = mergeListRecur(a, b.next);
        }

        return result;
    }

    // optimized solution
    public static Node mergeListOptimized(Node a, Node b) {
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }
        Node head = null;
        Node tail = null;
        // initialise head and tail pointer
        if (a.data <= b.data) {
            head = tail = a;
            a = a.next;
        } else {
            head = tail = b;
            b = b.next;
        }
        //merging the linked list elements
        while (a!=null && b!=null) {
            if (a.data<=b.data) {
                tail.next = a;
                tail = a;
                a= a.next;
            }else{
                tail.next = b;
                tail = b;
                b= b.next;
            }
        }
        tail.next = a!=null?a:b;
        return head;
    }
}