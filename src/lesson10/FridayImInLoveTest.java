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
    public void testFridayCheck() {
        String actual = FridayImInLove.fridayCheck(true, true);
        assertEquals(FC_RESULT_1, actual);
    }

    @Test
    public void testBarTrip() {
        String actual = FridayImInLove.barTrip(10,20, 50);
        assertEquals(BT_RESULT_1, actual);
    }
}