package com.jcx.test3;

import java.util.Random;
import java.util.Scanner;

public class MyBinarySearchDemo {
    public static void main(String[] args) {
       // Random random =new Random();
        Scanner sc =new Scanner(System.in);
      int[] arr = {1,2,3,4,5,6,7,8,9,10};
      //int a = random.nextInt(10)+1;
        System.out.println("请输入你要查找的数：");
        int a = sc.nextInt();
        myBinarySearch(arr,a);
    }
    public static void myBinarySearch(int arr[], int a){
        int min = 0;
        int max =arr.length-1;    //一定要注意长度从1开始！！！！
        int index = -1;
        while (min<=max){
            int mid = (min+max)/2;
            if(a>arr[mid]){
                min=mid+1;
            }else if(a<arr[mid]){
                max = mid - 1;
            }else {
                index = mid;
                break;
            }
        }
        if(index==-1){
            System.out.println("你输入的数字不存在");
        }else System.out.println(index);
    }
}
