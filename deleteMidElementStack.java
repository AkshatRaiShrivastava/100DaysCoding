import java.util.Stack;

public class deleteMidElementStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(22);
        st.push(58);
        st.push(61);
        st.push(20);
        st.push(69);
        st.push(73);
        st.push(45);
        removeMid(st, st.size(),0);
        while (!st.isEmpty()) {
            System.out.print(st.pop()+" ");
        }
    }
    public static void removeMid(Stack<Integer> st, int n, int curr){
        if (st.empty() || curr == n) {
            return;
        }
        int popped = st.pop();
        removeMid(st, n, curr+1);
        if(curr != n/2){
            st.push(popped);
        }
    }
}
