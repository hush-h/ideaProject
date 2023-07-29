package com.stringbuilder;

public class Demo {
    public static void main(String[] args) {
        int arr[] = {1,2,8,4,5};
        System.out.println(method(arr));
    }
    public static String method(int arr[]){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]).append("]");
            }else sb.append(arr[i]).append(",");
        }
        return sb.toString();
    }
}
