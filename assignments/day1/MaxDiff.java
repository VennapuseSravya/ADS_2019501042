import java.util.Scanner; // import scanner class
class MaxDiff {
    /**  differenceFunction returns a pair of doubles whose difference is greater than the difference of other pairs.
     * @param ,arr contains elements of type double
     * @return , String of min and max pair.
     */
    public String differenceFunction(double[] arr) {
        double max = arr[0];
        double min = arr[0];
        int i = 1;
        // To find min and max element in an array.
        while ( i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        return max + "," + min;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // create scanner object.
        System.out.println("No of elements in array");
        int n = scan.nextInt(); // read user input
        double[] a = new double[n]; // creating a double array with capacity n.
        System.out.println("enter the elements of array");
        for(int i = 0; i < n; i++){
            a[i] = scan.nextDouble();
        }
        scan.close();
        MaxDiff obj = new MaxDiff();
        System.out.println(" farthest pair is:");
        System.out.println(obj.differenceFunction(a));
    }
}