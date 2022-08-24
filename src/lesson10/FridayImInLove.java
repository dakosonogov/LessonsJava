package lesson10;

public class FridayImInLove {
    public static void main(String[] args) {
        barTrip(10, 20, 5);
        barTrip(10, 20, 20);
        barTrip(10, 20, 10);
        barTrip(10, 20, 10000);
        fridayCheck(true, false);
        fridayCheck(true, true);
        fridayCheck(false, true);
        fridayCheck(false, false);
    }

    private static void fridayCheck(boolean isTodayFriday, boolean aLotOfMoney) {
        String message;
        if (isTodayFriday && aLotOfMoney) {
            message = "Выпить пивка в баре";
        } else if (isTodayFriday) {
            message = "Попросить в долг у друга и выпить пива";
        } else message = "Идти домой и есть гречку";
        System.out.println(message);
    }

    private static void barTrip(int beerPrice, int whiskeyPrice, int amount) {
        String message;
        if (amount >= (beerPrice + whiskeyPrice)) {
            message = "Бармен, пива и виски!";
        } else if (amount >= whiskeyPrice) {
            message = "Бармен, виски!";
        } else if (amount >= beerPrice) {
            message = "Бармен, пива";
        } else message = "Покинуть бар";
        System.out.println(message);
    }
}
