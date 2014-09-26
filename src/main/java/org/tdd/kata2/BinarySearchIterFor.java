package org.tdd.kata2;

/**
 * Created by vx00418 on 9/25/14.
 */
public class BinarySearchIterFor implements BinarySearch {
    @Override
    public int chop(int value, int[] array) {
        int firstIndx = 0;
        int lastIndx = array.length - 1;
        int midleIndx;
        for(;lastIndx > firstIndx;){
            midleIndx = (firstIndx + lastIndx) >> 1;
            if (value < array[midleIndx]) lastIndx = --midleIndx;
            if (value > array[midleIndx]) firstIndx = ++midleIndx;
            if (value == array[midleIndx]) return midleIndx;
        }
        return -1;
    }
}
