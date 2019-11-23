import java.util.Random;

class Hash<Key,Value> {
    Key[]  keys;
    Value[] values;
    int capacity;
    int size = 0;
    Hash(int n) {
        capacity = n;
        keys = (Key[]) new Object[n];
        values =( Value[]) new Object[n];
    }
    /** this hash function returns  value between 0 and M-1
     * @return integer values between o and M-1.
     */
    int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }
    /**this function inserts values at the index computed by hashing key.
     * @param key , key 
     * @param val , value 
     */
    void put(Key key , Value val) {
        
        int i = hash(key);
        for(i = hash(key);keys[i] != null;i = (i + 1)%capacity) {
            if(keys[i].equals(key)) {
                values[i] =val;
                return;
            }
        }

        keys[i] = key;
        values[i] =val;
        size++;
    }
    /**this function returns count of the keys which are not null at the indices divided by 100.
     * @return count.
     */

    int count() {
        int c = 0;
        for(int i = 100;i < 1000000; i = i + 100) {
            if(keys[i]!=null) {
                    c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Hash<Integer,Integer> obj = new Hash<Integer,Integer>(1000000);
        for(int i = 0; i < 500000; i++) {
            Random random = new Random();
            int randomInteger = random.nextInt(500000);
            obj.put(randomInteger,i);
        }
        double n = obj.count()/10000.0;
        System.out.print(n);

    }

    

    


    
}