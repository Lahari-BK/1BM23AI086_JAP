import java.util.Arrays;
public class GQueue&lt;T&gt; {
T[] que;
static int size;
public GQueue() {
    que = (T[]) new Object[2];
    size = 0;
}
public void enqueue(T element) {
    if (size == que.length) {
        int newCapacity = que.length * 2;
        que = Arrays.copyOf(que, newCapacity);
    }
    que[size++] = element;
}
public T dequeue() {
    if (size==0) {
        System.out.println(&quot;Queue is empty&quot;);
    }
    T del_element = que[0];
    System.arraycopy(que, 1, que, 0, size - 1);
    que[--size] = null;
    import java.util.Arrays;
    public class GQueue&lt;T&gt; {
        T[] que;
        static int size;
public GQueue() {
            que = (T[]) new Object[2];
            size = 0;
        }
        public void enqueue(T element) {
            if (size == que.length) {
                int newCapacity = que.length * 2;
                que = Arrays.copyOf(que, newCapacity);
            }
            que[size++] = element;
        }
        public T dequeue() {
            if (size==0) {
                System.out.println(&quot;Queue is empty&quot;);
            }
            T del_element = que[0];
            System.arraycopy(que, 1, que, 0, size - 1);
            que[--size] = null;