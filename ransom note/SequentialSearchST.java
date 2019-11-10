// @author Sravya


public class SequentialSearchST<Key, Value> {
    private int n;           // size of key value pairs in ST
    private Node first;      
// node class
    private class Node {
        private Key key;
        private Value val;
        private Node next;

        public Node(Key key, Value val, Node next)  {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public SequentialSearchST() {
    }

    /**
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return n;
    }

    /**
     * checks if the ST is empty or not.
     * @return  true if empty else false.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * @param key the key
     * @return  true if key is present else returns false.
     */
    public boolean contains(Key key) {
        return get(key) != null;
    }

    /**
     * @param key the key
     * @return the value associated with the key if key is present else returns null.
     */
    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key))
                return x.val;
        }
        return null;
    }

    /**
     * insert the key and value pair into the ST, if key is not present before
     * else updates the value of the already existing key.
     * @param key the key
     * @param val the value
     */
    public void put(Key key, Value val) {
        if (val == null) {
            delete(key);
            return;
        }

        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        first = new Node(key, val, first);
        n++;
    }

    /**
     * Removes the key and associated value from the ST.
     * @param key the key
     */
    public void delete(Key key) {
        first = delete(first, key);
    }

    // deletes key in linked list beginning at Node x

    private Node delete(Node x, Key key) {
        if (x == null) return null;
        if (key.equals(x.key)) {
            n--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }


    /**
     * Returns all keys in the symbol table as an {@code Iterable}.
     * To iterate over all of the keys in the symbol table named {@code st},
     * use the foreach notation: {@code for (Key key : st.keys())}.
     * @return all keys in the symbol table as an {@code Iterable}
     */
    public Iterable<Key> keys()  {
        Queue<Key> queue = new Queue<Key>();
        for (Node x = first; x != null; x = x.next)
            queue.enqueue(x.key);
        return queue;
    }
}