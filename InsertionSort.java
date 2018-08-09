public class InsertionSort {

    public static void sort(Comparable[] a) {

        for(int i = 0; i < a.length; i++) {
            for(int j = i; j > 0; j--) {
                if(less(a[j], a[j - 1])) exch(a, j - 1, j);
                else break;
            }
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
