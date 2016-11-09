package sorting;

/**
 * @author Aidar Shaifutdinov.
 */
public interface Sorting<T extends Comparable<? super T>> {

    T[] sort(T[] arr);

}
