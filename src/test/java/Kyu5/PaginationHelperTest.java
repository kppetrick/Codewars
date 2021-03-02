package Kyu5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


public class PaginationHelperTest {
    @Test
    public void testSomething() {
        //given
        List<String> givenList = new ArrayList<String>();
        givenList.add("a");
        givenList.add("a");
        givenList.add("a");
        givenList.add("a");
        int givenItemsPerPage = 3;
        PaginationHelper helper = new PaginationHelper<>(givenList, givenItemsPerPage);

        int expectedItemCount = 4;
        int expectedPageCount = 2;
        int expectedPageItemCount = 1;
        int expectedPageIndex = 1;
        //when
        int actualItemCount = helper.itemCount();
        int actualPageCount = helper.pageCount();
        int actualPageItemCount = helper.pageItemCount(1);
        int actualPageIndex = helper.pageIndex(3);
        //then
        assertEquals(expectedItemCount, actualItemCount);
        assertEquals(expectedPageCount, actualPageCount);
        assertEquals(expectedPageItemCount, actualPageItemCount);
        assertEquals(expectedPageIndex, actualPageIndex);
        // assertEquals("expected", "actual");
    }
}
