package org.example.sorts;

public class InsertionSort {
    public static void sort(int[] array){
        for(int i =1;i<array.length;i++){
            for(int j = i;j>0;j--){
                if(array[j] < array[j-1]){
                    swap(array,j-1,j);
                }
            }
        }
    }
    private static void swap(int[] arr,int idL,int idR){
        int buff = arr[idL];
        arr[idL] = arr[idR];
        arr[idR] = buff;
    }
}
