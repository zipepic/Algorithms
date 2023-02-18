import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.example.sorts.QuickSort.quickSort;

public class QuickSortTest {
    @Test
    public void sortingIsCorrect(){
        int[] a =new int[]{43,1,5,3,90};
        quickSort(a);
        Assert.assertEquals(Arrays.toString(new int[]{1,3,5,43,90}),Arrays.toString(a));
    }
}
