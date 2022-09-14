package lesson13.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NegativeNumberTest {
    @Test
    public void testCountPositiveNumbers1() {
        int actual = NegativeNumber.countNegativeNumbers(new int[]{1,-1,2,-3,-4});
        assertEquals(3, actual);
    }

    @Test
    public void testCountPositiveNumbers2() {
        int actual = NegativeNumber.countNegativeNumbers(new int[]{0,0,0,0,0});
        assertEquals(0, actual);
    }
}