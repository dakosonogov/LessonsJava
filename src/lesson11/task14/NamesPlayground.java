package lesson11.task14;

public class NamesPlayground {
    private static final String NAME = "Иван";
    private static final String SURNAME = "Иванов";
    public static void main(String[] args) {
        checkName("Иван", "Иванов");
        checkName("Иван", "Петров");
        checkName("Петр", "Иванов");
        checkName("Дмитрий", "Косоногов");
    }

    public static void checkName(String firstName, String lastName) {
        if(NAME.equalsIgnoreCase(firstName)  || SURNAME.equalsIgnoreCase(lastName)) {
            if (NAME.equalsIgnoreCase(firstName) && SURNAME.equalsIgnoreCase(lastName)) {
                print("КОМБО!");
            } else print ("Отказ");
        } else print ("Здравствуйте, " + firstName + " " + lastName);
    }

    public static void print (Object o) {
        System.out.println(o);
    }
}
