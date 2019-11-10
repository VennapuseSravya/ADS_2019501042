public class Stack {
    static int[] arr;
    static int size;
    public static void push(int a){
        arr[size]=a;
        size++;
        
    }
    public static int  pop(){
        
        int item=arr[size];
        size--;
        return item;
        }
    public static void main(String args[]) {
     int capacity=5;    
     arr=new int[capacity];
     size=0;
     push(1);
     push(2);
     push(3);
     push(4);
     push(5);
     
     
     

      System.out.println(pop());
    }
}