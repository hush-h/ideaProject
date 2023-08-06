package com.jcx.test4;

public class MyBubbleSortDemo {
    public static void main(String[] args) {
        int arr[] = {3,5,1,7,9,10,1,6};
        int getArr[] = myBubbleSort(arr);
        for (int i = 0; i < getArr.length; i++) {
            System.out.println(getArr[i]);
        }
    }

    private static int[] myBubbleSort(int[] arr) {
        //int newArr[] = new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            for (int j = 0; j < i ; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
