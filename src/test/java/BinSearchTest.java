import org.example.searchalgorithms.BinSearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BinSearchTest{
    private BinSearch<Integer> sortArray;
    @Before
    public void createSortArray(){
        this.sortArray = new BinSearch(new Integer[]{1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15});
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void excpeptionGetId(){
        sortArray.get(-1);
    }
    @Test
    public void correctGetId(){
        Assert.assertEquals(11, (int)sortArray.get(10));
    }
    @Test
    public void searchIdIsRight(){
        Assert.assertEquals(5,sortArray.search(6));
    }
}
