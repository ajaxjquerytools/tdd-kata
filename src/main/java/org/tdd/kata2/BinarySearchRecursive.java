package org.tdd.kata2;

/**
 * Created by vx00418 on 9/25/14.
 */
public class BinarySearchRecursive implements BinarySearch {
    @Override
    public int chop(int value, int[] array) {
        int firstIndx = 0;
        int lastIndx = array.length - 1;
        return chop(value, firstIndx, lastIndx, array);
    }

    private int chop(int value, int firstIx, int lastIx, int[] array) {
        int midleIndx;
        if (lastIx >= firstIx) {
            midleIndx = (firstIx + lastIx) / 2;
            if (value == array[midleIndx]) return midleIndx;
            if (value < array[midleIndx]) return chop(value, firstIx, --midleIndx , array);
            if (value > array[midleIndx]) return chop(value, ++midleIndx, lastIx, array);
        }
        return -1;
    }
}
