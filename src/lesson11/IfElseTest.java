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
    public void minNumberTestFirst() {
        int num = IfElse.minNumber(1,2,3,4);
        assertEquals(1, num);
    }

    @Test
    public void minNumberTestSecond() {
        int num = IfElse.minNumber(1,6,3,4);
        assertEquals(1, num);
    }

    @Test
    public void minNumberTestThird() {
        int num = IfElse.minNumber(7,6,3,4);
        assertEquals(3, num);
    }
}