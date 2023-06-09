package org.example.sorting;

public class SortingUtility {

    private static int upperBound;

    public static <T extends Comparable<T>> void gnomeSort(T[] data) {
        int pos = 0;
        while (pos < data.length) {
            if (pos == 0 || data[pos].compareTo(data[pos - 1]) >= 0) {
                pos = pos + 1;
            }else{
                int temp;
                swap(data, pos, pos - 1);
                pos--;
            }
        }
    }
    public static <T extends Comparable<T>> void gnomierSort(T[] data) {
        int pos = 0;
        while (pos < data.length) {
            if (pos == 0 || data[pos].compareTo(data[pos - 1]) >= 0) {
                pos++;
            } else {
                swap(data, pos, pos - 1);
                pos--;
            }
        }
    }
    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {
        int pos = upperBound;
        while (pos > 0 && data[pos - 1].compareTo(data[pos]) > 0) {
            swap(data, pos - 1, pos);
            pos = pos - 1;
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}
