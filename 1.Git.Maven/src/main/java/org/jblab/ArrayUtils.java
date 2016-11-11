package org.jblab;

import org.jblab.enums.SortType;
import org.jblab.exception.SortingFailedException;
import org.jblab.sorting.BubbleSort;
import org.jblab.sorting.LoserSort;
import org.jblab.sorting.MergeSort;
import org.jblab.sorting.Sorting;

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
        T[] sortedArr = sorting.sort(arr);
        if (org.apache.commons.lang3.ArrayUtils.isSorted(sortedArr, T::compareTo)) {
            return sortedArr;
        } else {
            throw new SortingFailedException(sorting.getClass().getSimpleName() + " failed");
        }
    }

}
