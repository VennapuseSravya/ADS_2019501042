class Solution{
	public static int[] quickSort(int[] arr){
		// fill you code Here
		
		if(lo < hi){
			int pi=partition(arr,lo,hi);
			sort(arr)



		}
		


		return arr;
	}
	public int partition(int[] arr, int lo, int hi){
		if(lo <= hi){
			if(arr[lo]>arr[lo+1]){
				lo++;

			}else{
				if(arr[hi]>arr[lo]){
					hi--;
				}else{
					int temp = arr[hi];
					arr[hi]=arr[lo];
					arr[lo]=temp;
				}
			}


		}
	}
	
}