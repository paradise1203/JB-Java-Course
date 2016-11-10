package sorting;

/**
 * @author Aidar Shaifutdinov.
 */
public final class BubbleSort<T extends Comparable<? super T>> implements Sorting<T> {

    @Override
    public T[] sort(T[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) >= 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
