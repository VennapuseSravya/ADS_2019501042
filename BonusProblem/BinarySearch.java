import java.util.*;


class BinarySearch{
    static  void binarysearch(int[] a,int b){
        Arrays.sort(a);
        int lo=0;
        int hi=a.length-1;
        int mid;
        while(lo<hi){
            mid=lo+hi/2;
            if(b<a[mid]){
                hi=a[mid-1];
            }else if(b>a[mid]){
                lo=a[mid+1];
            }else if(b==a[mid]){
                System.out.println(mid);
                break;
                
                    
            }
        }
    }

    
    public static void main(String[] args){
        int a[]={1,2,3,1,6,2};
        binarysearch(a,1);
    }


        
        

}

