package org.example.searchalgorithms;

public class BinSearch<E extends Integer>{
    private E[] sortedArray;

    public BinSearch(E[] sortedArray) {
        this.sortedArray = sortedArray;
    }
    public E get(int index){
        if(index >= sortedArray.length || index<0)
            throw new ArrayIndexOutOfBoundsException("error");
        return sortedArray[index];
    }
    public int search(E e){
        int left = 0;
        int right = sortedArray.length;
        while (left<=right){
            int mid = (left+right)/2;
            if(sortedArray[mid].compareTo(e) == -1){
                left = mid+1;
            }else if(sortedArray[mid].compareTo(e) == 1){
                right = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
