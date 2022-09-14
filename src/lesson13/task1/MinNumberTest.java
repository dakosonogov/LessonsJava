package lesson13.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinNumberTest {

    @Test
    public void testMin1() {
        int actual = MinNumber.findMin(new int[]{-5,23,234,1,4,-10});
        assertEquals(-10, actual);
    }
    @Test
    public void testMin2() {
        int actual = MinNumber.findMin(new int[]{0});
        assertEquals(0, actual);
    }
}