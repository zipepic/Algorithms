package org.example.sorts;

public class BubbleSort {
    public static int[] sortReverse(int[] array){
        for(int i =0;i<array.length;i++){
            for (int j = array.length-1; j>i;j--){
                if(array[j] > array[j-1]){
                    int buff = array[j];
                    array[j] = array[j-1];
                    array[j-1] = buff;
                }
            }
        }
        return array;
    }
    public static int[] sortStray(int[] array){
        for(int i =0;i < array.length; i++){
            for (int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int buff = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buff;
                }
            }
        }
        return array;
    }
}
