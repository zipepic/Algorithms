import org.example.sorts.HeapSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class HeapSortTest {
    private int[] array;
    private int[] sortArray;
    @Before
    public void createUnSortedArray(){
        array = new int[]{4,12,43,1,65,3};
        sortArray = new int[]{1,3,4,12,43,65};
    }
    @Test
    public void sortIsCorrect(){
        HeapSort.heapSort(array);
        Assert.assertEquals(Arrays.toString(sortArray),Arrays.toString(array));
    }
}
