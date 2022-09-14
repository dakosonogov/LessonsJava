package lesson13.task5;

public class EmptyString {
    public static void main(String[] args) {

    }

    public static int findEmptyString (String[] array) {
        int counter = 0;
        for (String s : array) {
            if (s.isEmpty()) counter++;
        }
        return counter;
    }
}
