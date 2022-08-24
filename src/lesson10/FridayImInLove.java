package lesson10;

public class FridayImInLove {
    public static void main(String[] args) {

    }

    public static String fridayCheck(boolean isTodayFriday, boolean aLotOfMoney) {
        String message;
        if (isTodayFriday && aLotOfMoney) {
            message = "Выпить пивка в баре";
        } else if (isTodayFriday) {
            message = "Попросить в долг у друга и выпить пива";
        } else message = "Идти домой и есть гречку";
        return (message);
    }

    public static String barTrip(int beerPrice, int whiskeyPrice, int amount) {
        String message;
        if (amount >= (beerPrice + whiskeyPrice)) {
            message = "Бармен, пива и виски!";
        } else if (amount >= whiskeyPrice) {
            message = "Бармен, виски!";
        } else if (amount >= beerPrice) {
            message = "Бармен, пива!";
        } else message = "Покинуть бар";
        return message;
    }
}
