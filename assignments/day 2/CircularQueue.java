public class CircularQueue {
     Node  tail = null;
     int size = 0;
    /**this method return true if queue is empty else returns false.
     * @return , boolean.
     */

    public boolean isEmpty() {
        if (tail == null) {
            return true;
        }
        return false;
    }
    /**this function pushes element into queue.
     * @param a , the item which is to be pushed into queue.
     */
    public void enqueue(int a) {
        System.out.println("enqueue" + " " + a);
        Node temp = new Node(a);
        if (tail == null) {
            tail = temp;
            tail.next = tail;
            size++;
        } else {
        Node x = tail.next;
        tail.next = temp;
        tail = temp;
        tail.next = x;
        size++;
        }

    }
    /**this function deletes item from queue.
     * @return , item which is deleted from queue
     */
    public String dequeue() {
        if (tail == null) {
            return "queue is empty";
        } else if (tail == tail.next) {
            int item = tail.item;
            tail = null;
            size--;
            return "pop item is:" + item;

        } else {
        int item = tail.next.item;
        tail.next = tail.next.next;
        size--;
        return "pop item is:" + item;
        }
    }
    /**this function returns no of items in the queue.
     * @return int,the size of queue.
     */
    public String size() {
        return "no of elements in queue is:" + " " + size;
    }

    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        System.out.println(obj.size());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.size());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
    }
}
