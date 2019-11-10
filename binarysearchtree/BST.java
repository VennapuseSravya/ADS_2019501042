// @ author Sravya

public class BST<Key extends Comparable<Key>, Value> {

    Key[] keys;
    Value[] values;
    int[] leftIndices;
    int[] rightIndices;
    int[] sizes;


    public BST() {
        this.keys = (Key[]) new Comparable[20];
        this.values = (Value[]) new Object[20];
        this.leftIndices = new int[20];
        this.rightIndices = new int[20];
        this.sizes = new int[20];

        for (int i = 0; i < 20; i++) {
            leftIndices[i] = -1;
            rightIndices[i] = -1;
        }

    }

    // return size of the node
    public int size(int keyIndex) {
        if (keyIndex == -1) {
            return 0;
        } else {
            return sizes[keyIndex];
        }
    }
    public int size() {
        return sizes[0];
    }



    // isEmpty()
    public boolean isEmpty() {
        return keys[0] == null;
    }

    public boolean contains(Key key) {
        for (Key eachKey : keys) {
            if(eachKey.compareTo(key) == 0) {
                return true;
            }
        }
        return false;
    }


    public Value get(Key key) {
        return get(0, key);
    }

    public Value get(int keyIndex, Key keyToCompare) {

        if (keyIndex < 0) {
            return null;
        }

        int cmp = keyToCompare.compareTo(keys[keyIndex]);

        if (cmp < 0) {
            
            return get(leftIndices[keyIndex], keyToCompare); // goes left

        } else if (cmp > 0) {
            
            return get(rightIndices[keyIndex], keyToCompare); // goes right

        } else {
            return values[keyIndex];
        }
    }


    public void put(Key key, Value val) {
        put(0, key, val);
    }


    public int put(int keyIndex, Key keyToCompare, Value val) {
        if (keyIndex  == -1 || keys[keyIndex] == null) {
            // if the root itself is null
            // the new one becomes the root

            keyIndex = size();
            
            keys[keyIndex] = keyToCompare;
            values[keyIndex] = val;
            sizes[keyIndex] = 1;
            // System.out.println(keyIndex + "---------" + (String)keyToCompare + "--- On an empty BST");

            return keyIndex;
        }

        int cmp = keyToCompare.compareTo(keys[keyIndex]);

        // if less than root, goes to its left indices
        // RECURSIVE
        if(cmp < 0) {
            leftIndices[keyIndex] = put(leftIndices[keyIndex],  keyToCompare, val);

        // if greater than root, goes to its right indices
        // RECURSIVE        
        } else if (cmp > 0) {

            rightIndices[keyIndex] = put(rightIndices[keyIndex], keyToCompare, val);

        // Equals says, key already existing
        // Just updates its value.
        } else {
            values[keyIndex] = val;
        }

        // At this stage, with all recursions
        // recursion increaments size to every key's size in the path.
        // size() method returns 0 on an unoccupied index(i.e., -1).
        sizes[keyIndex] = size(leftIndices[keyIndex]) + size(rightIndices[keyIndex]) + 1; 

        return keyIndex;
    }


    public static void main(String[] args) {
        BST<String, Integer> bst = new BST<String, Integer>();

        bst.put("H",0);
        bst.put("A",1);
        bst.put("R",2);
        bst.put("I",3);
        bst.put("K",4);
        bst.put("A",5);
        bst.put("R",6);
        bst.put("E",7);
        bst.put("D",8);
        bst.put("D",9);
        bst.put("Y",10);
        bst.put("G",11);
        bst.put("R",12);

        System.out.println(bst.get("Y"));
    }
}