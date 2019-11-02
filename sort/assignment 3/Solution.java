final class Solution {
	public int[] sortInsertion(final int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j - 1];
			        arr[j - 1] = arr[j];
			        arr[j] = temp;
				} else {
				break;
				}
			}
		}
		return arr;
	}
	public int[] sortSelection(final int[] arr) {
		// fill you code Here
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
