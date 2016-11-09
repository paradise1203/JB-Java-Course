import enums.SortType;
import sorting.BubbleSort;
import sorting.LoserSort;
import sorting.MergeSort;
import sorting.Sorting;

/**
 * @author Aidar Shaifutdinov.
 */
public final class ArrayUtils {

    public static <T extends Comparable<? super T>> T[] sort(T[] arr, SortType sortType) {
        Sorting<T> sorting;
        switch (sortType) {
            case MERGE_SORT:
                sorting = new MergeSort<>();
                break;
            case BUBBLE_SORT:
                sorting = new BubbleSort<>();
                break;
            default:
                sorting = new LoserSort<>();
        }
        return sorting.sort(arr);
    }

}
