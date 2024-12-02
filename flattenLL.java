import java.util.ArrayList;
import java.util.Collections;

public class flattenLL {
    static class Node{
        int data;
        Node next;
        Node child;
        Node(int data){
            this.data = data;
            next = null;
            child = null;
        }
    }
    static Node flatLL(Node head){
        ArrayList<Integer> ls = new ArrayList<>();
        while (head != null) {
            Node temp = head;
            while (temp != null) {
                ls.add(temp.data);
                temp = temp.child;
            }
            head = head.next;
        }
        //sorting the array
        Collections.sort(ls);
        return convertToLL(ls);
    }
    static Node convertToLL(ArrayList<Integer> ls){
        Node dummy = new Node(-1);
        Node temp = dummy;
        for (int i = 0; i < ls.size(); ++i) {
            temp.next = new Node(ls.get(i));
            temp = temp.next;
        }
        return dummy.next;
    }
    public static void printOriginal(Node head){
        while (head != null) {
            System.out.print(head.data);
            if (head.child != null) {
                System.out.print("->");
                printOriginal(head.child);
            }
            if (head.next != null) {
                System.out.println();
            }
            head = head.next;

        }
    }
    static void printLL(Node head){
        while (head != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.child = new Node(1);
        head.next = new Node(5);
        head.next.child = new Node(12);
        head.next.child.child = new Node(15);
        head.next.next = new Node(13);
        head.next.next.next = new Node(20);
        head.next.next.next.child = new Node(23);
        // printing original linked list
        System.out.println("Original Linked List");
        printOriginal(head);
        Node flattenLL = flatLL(head);
        System.out.println();
        printLL(flattenLL);
    }
}
