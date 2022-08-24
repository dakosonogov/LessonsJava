package lesson10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FridayImInLoveTest {
    public static final String FC_RESULT_1 = "Выпить пивка в баре";
    public static final String FC_RESULT_2 = "Попросить в долг у друга и выпить пива";
    public static final String FC_RESULT_3 = "Идти домой и есть гречку";

    public static final String BT_RESULT_1 = "Бармен, пива и виски!";
    public static final String BT_RESULT_2 = "Бармен, виски!";
    public static final String BT_RESULT_3 = "Бармен, пива!";
    public static final String BT_RESULT_4 = "Покинуть бар";

    @Test
    public void testFridayCheckFirst() {
        String actual = FridayImInLove.fridayCheck(true, true);
        assertEquals(FC_RESULT_1, actual);
    }

    @Test
    public void testFridayCheckSecond() {
        String actual = FridayImInLove.fridayCheck(true, false);
        assertEquals(FC_RESULT_2, actual);
    }

    @Test
    public void testFridayCheckThird() {
        String actual = FridayImInLove.fridayCheck(false, true);
        assertEquals(FC_RESULT_3, actual);
    }

    @Test
    public void testFridayCheckFourth() {
        String actual = FridayImInLove.fridayCheck(false, false);
        assertEquals(FC_RESULT_3, actual);
    }

    @Test
    public void testBarTripFirst() {
        String actual = FridayImInLove.barTrip(10,20, 50);
        assertEquals(BT_RESULT_1, actual);
    }

    @Test
    public void testBarTripSecond() {
        String actual = FridayImInLove.barTrip(10,20, 25);
        assertEquals(BT_RESULT_2, actual);
    }

    @Test
    public void testBarTripThird() {
        String actual = FridayImInLove.barTrip(10,20, 15);
        assertEquals(BT_RESULT_3, actual);
    }

    @Test
    public void testBarTripFourth() {
        String actual = FridayImInLove.barTrip(10,20, 5);
        assertEquals(BT_RESULT_4, actual);
    }
}