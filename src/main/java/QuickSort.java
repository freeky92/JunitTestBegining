public class QuickSort {

    public static void quickSort(int[] array, int from, int to) {

        if (array.length == 0) {
            return;
        }
        if (from >= to) {
            return;
        }

        /* PIVOT - опорный элемент */
        int pivot = array[from + (to - from) / 2];

        int i = from, j = to;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        if (from < j) {
            quickSort(array, from, j);
        }
        if (to > i) {
            quickSort(array, i, to);
        }

    }
}
