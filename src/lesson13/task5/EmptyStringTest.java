package lesson13.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmptyStringTest {

    @Test
    public void testEmptyString1() {
        int actual = EmptyString.findEmptyString(new String[]{"", "", "11","    "});
        assertEquals(2, actual);
    }
}