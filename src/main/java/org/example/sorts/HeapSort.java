package org.example.sorts;


public class HeapSort {
    private static int LEFT(int id){
        return (2 * id) + 1;
    }
    private static int RIGHT(int id){
        return (2 * id) + 2;
    }

    private static void swap(int[] array,int id1,int id2){
        int buff = array[id1];
        array[id1] = array[id2];
        array[id2] = buff;
    }

    private static void heapify(int[] array,int i, int size){
        int largest = i;
        int left = LEFT(i);
        int right = RIGHT(i);

        if(left < size && array[left] > array[largest] ) largest = left;
        if(right < size && array[right] > array[largest] ) largest = right;

        if(largest != i){
            swap(array,i , largest);
            heapify(array,largest,size);
        }
    }
    private static int pop(int[] array, int size){
        if (size <= 0) {
            return -1;
        }
        int top = array[0];
        array[0] = array[size-1];

        heapify(array,0,size-1);
        return top;
    }
    public static void heapSort(int[] array){
        int n = array.length;
        int i = (n-2) / 2;
        while (i >=0){
            heapify(array,i--,n);
        }

        while (n >0){
            array[n-1] = pop(array,n);
            n--;
        }
    }
}
