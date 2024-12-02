

    public class stackUsingArrray {
    public static class MyStack {
        int size;
        int[] arr ;
        int top;

        public MyStack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }


        boolean isEmpty() {
            if (top == -1) {
                return true;
            }
            return false;
        }

        void push(int data) {
            if (top == size) {
                System.out.println("Stack is full !");
                return;
            }
            top++;
            arr[top] = data;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty !");
                return -1;
            }
            return arr[top];
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty !");
                return -1;
            }
            top--;
            return arr[top + 1];
        }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack(6);
        st.push(12);
        st.push(52);
        st.push(36);
        st.push(78);
        st.push(20);
        st.push(81);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
