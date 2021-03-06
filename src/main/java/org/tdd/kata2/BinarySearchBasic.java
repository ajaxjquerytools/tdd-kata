package org.tdd.kata2;

/**
 * Created by vx00418 on 9/25/14.
 */
public class BinarySearchBasic implements BinarySearch {
    @Override
    public int chop(int value, int[] array) {
        int firstIndx = 0;
        int lastIndx = array.length - 1;
        int midleIndx;

        while (lastIndx >= firstIndx) {
            midleIndx = (firstIndx + lastIndx) / 2;
            if (value == array[midleIndx]) {
                return midleIndx;
            }
            if (value < array[midleIndx]) {
                lastIndx = midleIndx - 1;
            } else {
                firstIndx = midleIndx + 1;
            }
        }

        return -1;
    }
}
