package lesson11.task7;

public class FavoriteNames {
    private static final String NAME_1= "Антон";
    private static final String NAME_2= "Денис";
    public static void main(String[] args) {
        checkName("Антон");
        checkName("Денис");
        checkName("Вася");
    }

    public static void checkName (String name) {
        if (name.equals(NAME_1) || name.equals(NAME_2)) {
            System.out.println("Добро пожаловать отсюда");
        } else System.out.println("Добро пожаловать!");

    }
}
