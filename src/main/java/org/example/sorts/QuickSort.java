package org.example.sorts;

public class QuickSort{
    public static void quickSort(int[] array){
        sorting(array,0,array.length-1);
    }
    private static void sorting(int[] array,int low,int high){
        if(array.length==0||low>=high)
            return;

        int mid = (low+high)/2;
        int border = array[mid];

        int i = low,
                j = high;
        while (i<=j){
            while (array[i] < border) i++;
            while (array[j] > border) j--;
            if(i<=j){
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;

                i++;
                j--;
            }
        }

        if(low<i) sorting(array,low,j);
        if(high>j) sorting(array,i,high);
    }
}
