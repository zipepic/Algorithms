import org.example.sorts.BubbleSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {
    private int[] arrReverse;
    private int[] arr;
    private int[] arrStray;
    @Before
    public void createArray(){
         arrReverse = new int[]{6,5,4,3,2,1};
         arrStray = new int[]{1,2,3,4,5,6};
        arr = new int[]{5,3,2,4,1,6};
    }
    @Test
    public void sortReverseIsRight(){
        Assert.assertEquals(Arrays.toString(BubbleSort.sortReverse(arr)),Arrays.toString(arrReverse));
    }
    @Test
    public void sortStryaIsRight(){
        Assert.assertEquals(Arrays.toString(BubbleSort.sortStray(arr)),Arrays.toString(arrStray));
    }
}
