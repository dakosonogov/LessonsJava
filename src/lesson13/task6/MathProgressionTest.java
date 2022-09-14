package lesson13.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathProgressionTest {

    @Test
    public void testIsProgression1() {
        boolean actual = MathProgression.isProgression(new int[] {1,2,3,4});
        assertEquals(true,actual);
    }

    @Test
    public void testIsProgression2() {
        boolean actual = MathProgression.isProgression(new int[] {1,3,5,7});
        assertEquals(true,actual);
    }

    @Test
    public void testIsProgression3() {
        boolean actual = MathProgression.isProgression(new int[] {1,3,5,8});
        assertEquals(false, actual);
    }
}