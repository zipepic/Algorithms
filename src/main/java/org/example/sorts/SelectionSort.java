package org.example.sorts;

public class SelectionSort {
    public static void sort(int[] arr){
        for(int i =0 ;i<arr.length;i++){
            int pos =i;
            int min = arr[i];
            for(int j =i+1;j<arr.length;j++){
                if(min > arr[j]){
                    min = arr[j];
                    pos=j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }
    }
}
