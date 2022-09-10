package lesson11.task7;

public class FavoriteNames {
    private static final String NAME_1 = "Антон";
    private static final String NAME_2 = "Денис";

    private static final String WELCOME = "Добро пожаловать";
    public static void main(String[] args) {
        checkName("Антон");
        checkName("Денис");
        checkName("Вася");
    }

    public static void checkName(String name) {
        if (NAME_1.equals(name) || NAME_2.equals(name)) {
            print(WELCOME + " отсюда");
        } else print(WELCOME + "!");

    }

    public static void print (Object o) {
        System.out.println(o);
    }
}
