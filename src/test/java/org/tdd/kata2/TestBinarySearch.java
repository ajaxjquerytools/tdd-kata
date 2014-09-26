package org.tdd.kata2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vx00418 on 9/25/14.
 */
public class TestBinarySearch {
    @Test
    public void shouldTestImpl1(){
       abstractTest(new BinarySearchBasic());
    }

    @Test
    public void shouldTestImpl2(){
        abstractTest(new BinarySearchPostWhile());
    }
    @Test
    public void shouldTestImpl3(){
        abstractTest(new BinarySearchRecursive());
    }
    @Test
    public void shouldTestImpl4(){
        abstractTest(new BinarySeachShortCode());
    }
    @Test
    public void shouldTestImpl5(){
        abstractTest(new BinarySearchIterFor());
    }
    
    public void abstractTest(BinarySearch finder){
//        Assert.assertEquals("assert1",-1, finder.chop(3, new int []{}));
//        Assert.assertEquals("assert2", -1, finder.chop(3, new int[]{1}));
//        Assert.assertEquals("assert3",0,  finder.chop(1, new int []{1}));

        Assert.assertEquals("assert4",0,  finder.chop(1, new int []{1, 3, 5}));
        Assert.assertEquals("assert5",1,  finder.chop(3, new int []{1, 3, 5}));
        Assert.assertEquals("assert6",2,  finder.chop(5, new int []{1, 3, 5}));
        Assert.assertEquals("assert7",-1, finder.chop(0, new int []{1, 3, 5}));
        Assert.assertEquals("assert8",-1, finder.chop(2, new int []{1, 3, 5}));
        Assert.assertEquals("assert9",-1, finder.chop(4, new int []{1, 3, 5}));
        Assert.assertEquals("assert10",-1, finder.chop(6, new int []{1, 3, 5}));

        Assert.assertEquals("assert11",0,  finder.chop(1, new int []{1, 3, 5, 7}));
        Assert.assertEquals("assert12",1,  finder.chop(3, new int []{1, 3, 5, 7}));
        Assert.assertEquals("assert13",2,  finder.chop(5, new int []{1, 3, 5, 7}));
        Assert.assertEquals("assert14",3,  finder.chop(7, new int []{1, 3, 5, 7}));
        Assert.assertEquals("assert15",-1, finder.chop(0, new int []{1, 3, 5, 7}));
        Assert.assertEquals("assert16",-1, finder.chop(2, new int []{1, 3, 5, 7}));
        Assert.assertEquals("assert17",-1, finder.chop(4, new int []{1, 3, 5, 7}));
        Assert.assertEquals("assert18",-1, finder.chop(6, new int []{1, 3, 5, 7}));
        Assert.assertEquals("assert19",-1, finder.chop(8, new int []{1, 3, 5, 7}));
    }
}
