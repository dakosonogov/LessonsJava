package lesson11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfElseTest {

    @Test
    public void isTriangleTestFirst() {
        boolean actual = IfElse.isTriangle(1,2,3);
        assertEquals(false, actual);
    }

    @Test
    public void isTriangleTestSecond() {
        boolean actual = IfElse.isTriangle(4,2,1);
        assertEquals(false, actual);
    }

    @Test
    public void isTriangleTestThird() {
        boolean actual = IfElse.isTriangle(1,4,2);
        assertEquals(false, actual);
    }

    @Test
    public void isTriangleTestFourth() {
        boolean actual = IfElse.isTriangle(2,4,3);
        assertEquals(true, actual);
    }

    @Test
    public void largestNumberTestFirst() {
        int num = IfElse.largestNumber(1,2,3,4);
        assertEquals(4, num);
    }

    @Test
    public void largestNumberTestSecond() {
        int num = IfElse.largestNumber(1,6,3,4);
        assertEquals(6, num);
    }

    @Test
    public void largestNumberTestThird() {
        int num = IfElse.largestNumber(7,6,3,4);
        assertEquals(7, num);
    }
}