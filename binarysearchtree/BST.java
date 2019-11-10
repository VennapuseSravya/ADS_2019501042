import java.util.Arrays;

class BST<Key extends Comparable<Key>, Value> {
    Key[] key;
    Value[] val;
    int[] leftIndex;
    int[] rightIndex;
    int[] size;

    public BST() {
        this.key = (Key[]) new Comparable[20];
        this.val = (Value[]) new Comparable[20];
        this.leftIndex = new int[20];
        this.rightIndex = new int[20];
        this.size = new int[20];
       
        for (int i = 0; i < 10; i++) {
            leftIndex[i] = -1;
            rightIndex[i] = -1;
        }
    }

    public int size(int index) {
        if (index == -1) {
            return 0;
        } else {
            return size[index];
        }
    }

    public int size() {
        return size[0];
    }

    public Value get(Key key) {
        return get(0, key);
    }

    public Value get(int index, Key k) {
        if (index < 0) {
            return null;
        }
        int cmp = k.compareTo(key[index]);
        if (cmp < 0) {
            return get(leftIndex[index], k);
        } else if (cmp > 0) {
            return get(rightIndex[index], k);
        } else {
            return val[index];
        }
    }

    public void put(Key k, Value v) {
        put(0, k, v);
    }

    public int put(int index, Key k, Value v) {
        if (index == -1 || key[index] == null) {
            index = size();
            key[index] = k;
            val[index] = v;
            size[index] = 1;
            return index;
        }
        int cmp = k.compareTo(key[index]);
        if (cmp < 0) {
            leftIndex[index] = put(leftIndex[index], k, v);
        } else if (cmp > 0) {
            rightIndex[index] = put(rightIndex[index], k, v);
        } else {
            val[index] = v;
        }
        size[index] = size(leftIndex[index]) + size(rightIndex[index]) + 1;
        return index;
    }

    public static void main(String[] args) {
        BST<String, Integer> b = new BST<String, Integer>();
        b.put("b", 0);
        b.put("s", 1);
        b.put("t", 2);
        b.put("a", 3);
        b.put("r", 4);
        b.put("r", 5);
        b.put("a", 6);
        b.put("y", 7);
        System.out.println(b.get("y"));
        b.toString();
    }
}
