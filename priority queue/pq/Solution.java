class Solution{
    public static boolean isMinHeap(double[] arr){
    
        int k=0;
        if(arr.length==0){
            return false;
        }
        if(k==arr.length-1){
            return true;
        }
        while(2*k+1<=arr.length-1){
            if(2*k+1!=arr.length-1){
        if(!(arr[k]<=arr[2*k+1] && arr[k]<=arr[2*k+2] )){
            return false;

          

            
            
            
        }
    }else{
        if((arr[k]<=arr[2*k+1])){
            return true;
        }
    }
        k=2*k+1;
        }
        return true;
    }
}