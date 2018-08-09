import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void sort() {
        Integer[] a = {3, 5, 2, 9, 4, 11};
        Integer[] sorted = {2, 3, 4, 5, 9, 11};
        InsertionSort.sort(a);
        assertEquals(a, sorted);
    }

}