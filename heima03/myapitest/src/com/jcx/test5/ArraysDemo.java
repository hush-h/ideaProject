package com.jcx.test5;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int []arr  = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(arr,3);
        System.out.println(index);
        int []arr1 = {5,4,3,2,1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
