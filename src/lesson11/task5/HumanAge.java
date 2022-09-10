package lesson11.task5;

public class HumanAge {

    public static void main(String[] args) {
        checkAge(0);
        checkAge(-10);
        checkAge(18);
        checkAge(100);
    }

    public static void checkAge (int age) {
        //Проверка верхней границы возраста по википедии: 122 года
        if (age > 0 && age < 123) {
            print("Ваш возраст " + age);
        } else print("Вы бот");
    }

    public static void print (Object o) {
        System.out.println(o);
    }
}
