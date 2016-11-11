package org.jblab.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aidar Shaifutdinov.
 */
public final class MergeSort<T extends Comparable<? super T>> implements Sorting<T> {

    public T[] sort(T[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private void sort(T[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(T[] arr, int l, int m, int r) {
        int l1 = l;
        int l2 = m + 1;
        List<T> temp = new ArrayList<>();
        while (l1 <= m && l2 <= r) {
            if (arr[l1].compareTo(arr[l2]) <= 0) {
                temp.add(arr[l1++]);
            } else {
                temp.add(arr[l2++]);
            }
        }
        while (l1 <= m) {
            temp.add(arr[l1++]);
        }
        while (l2 <= r) {
            temp.add(arr[l2++]);
        }
        for (int i = l, j = 0; i <= r; i++, j++) {
            arr[i] = temp.get(j);
        }
    }

}
