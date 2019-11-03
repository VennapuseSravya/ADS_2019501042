class Solution {
    public static String Josephus(int a, int b) {
        Queue<Integer> queue = new Queue<Integer>(a); 
        String result = "";
        for(int i = 0; i < a; i++)
        {
            queue.enqueue(i);
        }
        while(!queue.isEmpty()) {
        for(int i = 1; i < b; i++){
            if(queue.size() == 1) {
                break;
            }
            queue.enqueue(queue.dequeue());
        }
        result = result + queue.dequeue() + " ";
    }
    return result.trim();
}
}
class Queue<Item> {
    private Item[] queue;
    private int N = 0;

    public Queue(int capacity){
        queue = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        return N == 0;
    }

    public int size(){
        return N;
    }
    public void enqueue(Item item) {
        queue[N] = item;
        N++;
     }

    public Item dequeue() {
        Item obj = queue[0];

         if(isEmpty()) {
             return null;
         }else {
            for(int i=0; i < N-1; i++) {
                queue[i] = queue[i + 1];
            }
        N--;
        }
        return obj;
     }
}
