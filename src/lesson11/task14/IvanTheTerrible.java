package lesson11.task14;

public class IvanTheTerrible {
    public static void main(String[] args) {
        checkIvan("Иван", "Иванов");
        checkIvan("Иван", "Петров");
        checkIvan("Петр", "Иванов");
        checkIvan("Дмитрий", "Косоногов");
    }

    public static void checkIvan(String firstName, String lastName) {
        if(firstName.equals("Иван")  || lastName.equals("Иванов")) {
            if (firstName.equals("Иван") && lastName.equals("Иванов")) {
                print("КОМБО!");
            } else print ("Отказ");
        } else print ("Здравствуйте, " + firstName + " " + lastName);
    }

    public static void print (Object o) {
        System.out.println(o);
    }
}
