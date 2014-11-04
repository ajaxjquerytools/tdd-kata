package org.tdd.kata2;

/**
 * Created by vx00418 on 9/25/14.
 */
public class BinarySearchShortCode implements BinarySearch {
    @Override
    public int chop(int v, int[] arr) {
        int fI = 0, lX = arr.length - 1, mI;
        while (lX >= fI) {
            mI = fI + (lX - fI) / 2;
            if (v == arr[mI]) return mI;
            if (v < arr[mI]) lX = --mI;
            else fI = ++mI;
        }
        return -1;
    }
}
