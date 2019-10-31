import java.util.Arrays;

final class ThreeSumProblem {
    private ThreeSumProblem() {

    }

    static int method(final int[] arr) {
        Arrays.sort(arr);
        int count = 0;

        for (int i1 = 0; i1 < arr.length - 1; i1++) {
            int i2 = i1 + 1;
            int i3 = arr.length - 1;

            while (i2 < i3) {
            if (arr[i1] + arr[i2] + arr[i3] == 0) {
                count++;
                i3--;
                i2++;
            } else if (arr[i1] + arr[i2] + arr[i3] < 0) {
                i2++;
            } else {
                i3--;
            }
            }
        }
        return count;
    }
    public static void main(final String[] args) {
        final int[] arr = {30, -40, -20, -10, 40, 0, 10, 5};
        System.out.println(method(arr));
    }

}
