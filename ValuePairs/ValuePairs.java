import java.util.Arrays;

final class ValuePairs {
    private ValuePairs() {

    }
    public static void method(final int[] a) {
        Arrays.sort(a);
        int i = 0;
        int count = 0;
        while (i < a.length) {
            int j = i + 1;
            if (a[i] == a[j]) {
                count++;
                i++;
            }
            i++;

        }
        System.out.println(count);

    }
    public static void main(final String[] args) {
        final int[] a = {1, 3, 2, 4, 3, 4};
        method(a);
    }
}
