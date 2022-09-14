package lesson13.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumberTest {

    @Test
    public void testFindNumber1() {
        int actual = FindNumber.findNumber(5,new int[] {5,5,5,5,});
        assertEquals(4,actual);
    }

    @Test
    public void testFindNumber2() {
        int actual = FindNumber.findNumber(4,new int[] {5,5,5,5,});
        assertEquals(0,actual);
    }
}