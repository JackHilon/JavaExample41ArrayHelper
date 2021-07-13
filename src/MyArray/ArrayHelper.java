package MyArray;

import java.util.Arrays;

public class ArrayHelper {

    public static boolean AreTheyEqual(int[] a, int[] b) {
        try {
            boolean res = Arrays.equals(a, b);
            return res;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public static void Sorting(int[] a) {
        Arrays.sort(a);
    }

    public static int BinarySearching(int[] array, int item) {
        Sorting(array); // first array must be sorted for beginning with binary-search.
        int res = Arrays.binarySearch(array, item);
        return res;
    }

    public static void FillWithItem(int[] array, int item) {
        if (array == null) {
            return;
        } else {
            Arrays.fill(array, item);
        }

    }

    public static String Array2String(int[] array) {
        String str = Arrays.toString(array);
        return str;
    }

    public static int[] Copy2NewArray(int[] array) {
        if (array == null) {
            return null;
        }

        int[] res = new int[array.length];

        try {
            for (int i = 0; i < res.length; i++) {
                res[i] = array[i];
            }
            return res;
        } catch (Exception e) {
            System.out.println(e.toString());
            return res;
        }
    }
}
