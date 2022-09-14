package lesson13.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    @Test
    public void multiplyTest1() {
        int actual = Multiply.multiply(new int[]{213,32,54,5});
        assertEquals(1_840_320, actual);
    }

    @Test
    public void multiplyTest2() {
        int actual = Multiply.multiply(new int[]{0,32,54,5});
        assertEquals(0, actual);
    }
}