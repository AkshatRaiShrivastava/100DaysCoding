public class queueUsingArray {
    public static class MyQueue {
        int size;
        int start, end;
        int[] arr;

        public MyQueue(int size) {
            this.size = size;
            start = -1;
            end = -1;
            arr = new int[size];
        }

        boolean isEmpty() {
            if (start == -1 || end == -1) {
                System.out.println("Queue is empty !");
                return true;
            }
            return false;
        }

        void enqueue(int data) {
            if (end == size - 1) {
                System.out.println("Queue is full !");
                return;
            }
            if (end == -1) {
                start++;
                end++;
                arr[end] = data;
            } else {
                end++;
                arr[end] = data;
            }
        }

        int dequeue() {
            if (end == -1) {
                System.out.println("Queue is empty !");
                System.exit(0);
            }
            int front = arr[start];
            if (start == end) {
                start = -1;
                end = -1;
            } else {
                start++;

            }
            return front;
        }
    }

    public static void main(String[] args) {
        MyQueue mq = new MyQueue(5);
        mq.enqueue(2);
        mq.enqueue(5);
        mq.enqueue(3);
        mq.enqueue(85);
        mq.enqueue(74);
        while (!mq.isEmpty()) {
            System.out.println(mq.dequeue());
        }
    }
}
