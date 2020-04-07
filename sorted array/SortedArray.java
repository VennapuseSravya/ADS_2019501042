final class SortedArray {
    private SortedArray() {

    }
    public static int[] method(final int[] arr1, final int[] arr2) {
      int i = 0;
      int j = 0;
      int[] arr = new int[arr1.length + arr2.length];
      int k = 0;
      int n = arr1.length;
      int m = arr2.length;

      while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
          arr[k] = arr1[i];
          k++;
          i++;

        }  else if (arr1[i] >= arr2[j]) {
          arr[k] = arr2[j];
          k++;
          j++;

        }

      }
      if (arr1[n - 1] < arr2[m - 1]) {
      arr[arr.length - 1] = arr2[m - 1];
      } else {
      arr[arr.length - 1] = arr1[n - 1];
      }
      return arr;
    }

    public static void display(final int[] arr) {

        String result = "[";
        int i = 0;
        while (i < arr.length - 1) {
            result = result + arr[i] + ",";
            i++;
        }
        result = result + arr[arr.length - 1] + "]";
        System.out.println(result);
    }


    public static void main(final String[] args) {
         final int[] arr1 = {1, 2, 4, 5};
         final int[] arr2 = {2, 3, 5, 7};

        display(method(arr1, arr2));

    }
}
