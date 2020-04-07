public class MyClass {
    static int[] vals=new int[5];
   static  int[] keys=new int[5];
   static  int size=0;
    static  void put(int key,int val){
        int i=rank(key);
        if(keys[i]==key){
            vals[i]=val;
            return;
            
        }
        for(int j=size;j>i;j--){
            vals[j]=vals[j-1];
            keys[j]=keys[j-1];
        }
        vals[i]=val;
        keys[i]=key;
        
        size++;
        
    }
    static int  rank(int key){
        int lo=0;
        int hi=size-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(keys[mid]>key){
                hi=mid-1;
            }
            else if(keys[mid]<key){
                lo=mid+1;
                
            }else{
                return mid;
            }
        }
        return lo;
    }
    static int get(int key){
        int i=rank(key);
        if(keys[i]==key){
            return vals[i];
        }else{
            return -1;
        }
    }
    static boolean contains(int key){
        if(get(key)!=-1){
            return true;
        }else{
            return false;
        }
    }
    static int size(){
        return size;

    }
    static int min(){
        return keys[0];
    }
    static int max(){
        return keys[size-1];
    }
    static int select(int a){
        return keys[a];
    }
    static int floor(int key){
        int i=rank(key);
        if(keys[i]==key){
            return keys[i];
        }else{
            return keys[i-1];
        }
    }
    static int ceil(int key){
        int i=rank(key);
        if(keys[i]==key){
            return keys[i];
        }else{
            return keys[i];
        }
    }
    static void iterable(int a,int b){
        int i=rank(a);
        int j=rank(b);
        for(int k=i;k<=j;k++){
            System.out.println(keys[k]);
        }

    }
    
    public static void main(String args[]) {
        put(1,2);
        System.out.println(rank(1));
        System.out.println(size());
        System.out.println("-----");
        put(3,5);
        System.out.println(size());

        put(5,9);
        System.out.println(size());
        put(3,6);
        System.out.println(size());
        System.out.println(rank(2));
        System.out.println(rank(3));
        System.out.println(get(3));
        System.out.println(contains(3));
        System.out.println(size());
        System.out.println(min());
        System.out.println(max());
        System.out.println(select(2));
       
        System.out.println(floor(3));
        System.out.println(ceil(4));
        iterable(1,3);

      
    }
}

