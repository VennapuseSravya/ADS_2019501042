class Solution{
    public static boolean isMinHeap(double[] arr){
        if(arr.length==0){
            return false;
        }
        if(arr.length==1){
            return true;
        }



        for(int i=0;i<=arr.length/2;i++){
            if(arr[i/2]>arr[i]){
              return false;
            }
        }
        
        return true;
    }
}