package lesson11.task10;

public class GD {
    public static void main(String[] args) {
        checkGays(true, true);
        checkGays(false, false);
        checkGays(true, false);
        checkGays(false, true);
    }

    public static void checkGays (boolean male, boolean female) {
        if (male == female) {
            print("Валите в США");
        } else print("Совет, да любовь");
    }

    public static void print (Object o) {
        System.out.println(o);
    }
}
