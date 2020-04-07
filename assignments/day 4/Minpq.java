import java.util.Scanner; 
class Minpq < key extends Comparable < key >> {
    key[] pq;
    int n = 0;
    Minpq(int capacity) {
        pq = (key[]) new Comparable[capacity + 1];
    }
    /**this function compares two keys 
     * @param k1 index of a key
     * @param k2 index of other key
     * @return ,boolean 
     */
    boolean greater(int k1,int k2) {
        return pq[k1].compareTo(pq[k2]) > 0;
    }
    /**this function put element into pq array
     * @param k the element which is to be inserted.
    */
    void insert(key k) {
        pq[++n] = k;
        swim(n);
    }
    /**this function keeps the key which is inserted at its correct position.
     * @param k the insex of the key
     */
    void swim(int k) {
        while(k > 1 && greater(k/2, k)) {
            key temp = pq[k/2];
            pq[k/2] = pq[k];
            pq[k] = temp;
            k = k/2;
        }
    }
    /**this function deleted min element from the array.
     * @return the deleted key.
     */
    key delete() {
        key temp = pq[1];
        pq[1] = pq[n];
        pq[n] = temp;
        pq[n] = null;
        n--;
        sink(1);
        return temp;
    }
    /**this function sinks the element at the first index to its correct position.
     * @param k, the index of the key.
     */
    void sink(int k) {
        while (2*k <= n) {
        int j = 2*k;
        if (j < n && greater(j,j + 1)) {
            j++;
        }
        if (!greater(k,j)) {
            break;
        }
        key temp = pq[k];
        pq[k] = pq[j];
        pq[j] = temp;
        k = j;
        }
    }
    /**this function prints array elements.
     * @param k,the min pq array.
     */
    void toString(key[] k) {
        for (int i = 1; i < k.length; i++) {
            if (k[i] != null) {
            System.out.println(k[i]);
            }
        }
    }

    public static void main(String[] args) {
        Minpq obj = new Minpq(20); // create Minpq object.
        Scanner scan = new Scanner(System.in); // create scanner object.
        System.out.println("no of elements");
        int num = scan.nextInt(); // read user input
        for (int i = 1; i <= num; i++) {
            System.out.println("enter element");
            int ele =  scan.nextInt(); // read user input
            obj.insert(ele);
        }
        System.out.println("no of elements to be deleted");
        int k = scan.nextInt(); // read user input
        scan.close();
        System.out.println("deleted items");
        for (int i = 0; i<num-k; i++){
                System.out.println(obj.delete());
        }
        System.out.println("remainning elements in the array");
        obj.toString(obj.pq);
    }   
}