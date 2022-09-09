package lesson11.task5;

public class HumanAge {

    public static void main(String[] args) {
        checkAge(0);
        checkAge(-10);
        checkAge(18);
        checkAge(100);
    }

    public static void checkAge (int a) {
        //Проверка верхней границы возраста по википедии: 122 года
        if (a > 0 && a < 123) {
            System.out.println("Ваш возраст " + a);
        } else System.out.println("Вы бот");
    }
}
