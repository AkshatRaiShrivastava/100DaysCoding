public class removeNodeFromEnd {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        a.next = new Node(4);
        a.next.next = new Node(7);
        a.next.next.next = new Node(9);   // 2->4->7->9->null
        Node result = removeNodeEnd(a,1);
        printNode(result);
    }
    public static Node removeNodeEnd(Node head, int n){
        Node temp = head;
        int counter =0;
        while (temp!=null) {
            counter++;
            temp = temp.next;
        }
        //how to remove from the last
        int len = counter-n;
        Node curr = head;
        for(int i=0;i<len-1;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
    public static void printNode(Node head){
        Node curr = head;
        while (curr!=null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("Null");
    }
}