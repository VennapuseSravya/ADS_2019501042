class Bsst {
    int[] keys;
    int[] values;
    int size = 0;
    Bsst(int a) {
        keys= new int[a];
        values = new int[a];
    }
    /**this method adds key and value pair to key and value arrays,if the given key already 
     * exits in the key array, its corresponding value in the value array will be  overrided with
     * new value.
     * @param key , given key
     * @param value , given value
     */
    void put(int key, int value) {
        if (size == 0) { 
        keys[size] = key;
        values[size] = value;
        size++;
        } else if (key > keys[size - 1]) {
            keys[size] = key;
            values[size] = value;
            size++;
        } else {
            int i = rank(key);
            if(keys[i] == key) {
                values[i] = value;
            }
            else {
                for (int j = i; j < size; j++) {
                    keys[j + 1] = keys[j];
                    values[j + 1] = values[j];
                }
                keys[i] = key;
                values[i] = value;
                size++;
            }
        }
    }
    /**this method returns index of the key if key is present in the array else returns 
     * the index of the key whose value is less than the key
     * @param key , the given key
     * @return , index of the key in the array.
     */
     int rank(int key) {
            int lo = 0;
            int hi = size - 1;
            int mid=lo + (hi - lo) / 2;
            while(lo < hi) {
                if(keys[mid] > key) {
                   hi = mid - 1; 
                }
                else if(keys[mid] < key) {
                    lo = mid + 1;
                } else {
                    return mid;
                }
            }
            return lo;
     }
    /**this function prints key and value pairs.
     * @param a , key array
     * @param b , value array.
     */

    public void  toString(int[] a,int[] b) {
        for(int i = 0; i < size; i++) {
        System.out.println(a[i] + " " + b[i]);
        }
    }
    public static void main(String[] args) {
        Bsst obj = new Bsst(20);
        obj.put(1,2);
        obj.put(3,6);
        obj.put(2,5);
        obj.put(2,9);
        obj.put(0,9);
        obj.toString(obj.keys,obj.values);
        

    }
}