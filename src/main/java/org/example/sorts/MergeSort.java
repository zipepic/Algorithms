package org.example.sorts;

import java.util.stream.IntStream;

public class MergeSort {
    public static void mergeSort(int[] array){
        if(array.length == 1)
            return ;
        int mid = array.length/2;
        int[] left = new int[mid];
        int[] right = new int[array.length-mid];
        IntStream.range(0,mid).forEach(j -> left[j] = array[j]);
        IntStream.range(mid, array.length).forEach(i -> right[i - mid] = array[i]);

        mergeSort(left);
        mergeSort(right);

        merge(array,left,right);
    }
    public static void merge(int[] array,int[] left, int[] right){
        int leftIndex = 0;
        int rightIndex =0;
        int resIndex =0;
        while (leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] < right[rightIndex]){
                array[resIndex] = left[leftIndex];
                leftIndex++;
            }
            else {
                array[resIndex] = right[rightIndex];
                rightIndex++;
            }
            resIndex++;
        }
        for(int i = leftIndex; i<left.length; i++){
            array[resIndex++] = left[i];
        }
        for(int i = rightIndex; i<right.length; i++){
            array[resIndex++] = right[i];
        }
    }
}
