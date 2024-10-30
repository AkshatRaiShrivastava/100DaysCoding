public class middleOfLinkedList {
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
        a.next.next.next.next.next = new Node(30);  //10->20->30->40->50->30
        int result = findMiddleNode2(a).data;
        System.out.println("Middle element of linked list is " + result);
    }

    public static int findMiddleNode1(Node head) {
        Node curr = head;
        int size = 0;
        int middle= 0;
        Node middNode = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        if (size % 2 == 0) {
            // for even number of nodes
            middle = (size / 2) + 1;
        }else{
            // for odd number of nodes
            middle = (size + 1) / 2;
        }
        
        for (int i = 0; i < middle-1; i++) {
            middNode = middNode.next;
        }
        return middNode.data;
    }

    public static Node findMiddleNode2(Node head){
        //finding length of the linked list
        int len = 0;
        Node temp = head;
        while (temp!=null) {
            len++;
            temp = temp.next;
        }    
        // len = 6
        Node curr = head;
        int middle = len/2;
        while (middle> 0) {
            curr = curr.next;
            middle--;  
        }
        return curr;
    }
}
