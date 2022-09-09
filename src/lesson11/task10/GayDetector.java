package lesson11.task10;

public class GayDetector {
    public static void main(String[] args) {
        checkGays(true, true);
        checkGays(false, false);
        checkGays(true, false);
        checkGays(false, true);
    }

    public static void checkGays (boolean a, boolean b) {
        if (a == b) {
            System.out.println("Валите в США");
        } else System.out.println("Совет, да любовь");
    }
}
