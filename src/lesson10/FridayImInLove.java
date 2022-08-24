package lesson10;

public class FridayImInLove {
    public static void main(String[] args) {
        barTrip(10, 20, 5);
        fridayCheck(true, false);
    }

    private static void fridayCheck(boolean isTodayFriday, boolean aLotOfMoney) {
        if (isTodayFriday && aLotOfMoney) {
            System.out.println("Выпить пивка в баре");
        } else if (isTodayFriday) {
            System.out.println("Попросить в долг у друга и выпить пива");
        } else System.out.println("Идти домой и есть гречку");

    }

    private static void barTrip(int beerPrice, int whiskeyPrice, int amount) {
        if (amount >= (beerPrice + whiskeyPrice)) {
            System.out.println("Бармен, пива и виски!");
        } else if (amount >= whiskeyPrice) {
            System.out.println("Бармен, виски!");
        } else if (amount >= beerPrice) {
            System.out.println("Бармен, пива");
        } else System.out.println("Покинуть бар");
    }
}
