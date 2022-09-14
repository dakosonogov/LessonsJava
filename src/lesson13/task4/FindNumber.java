package lesson13.task4;

public class FindNumber {
    public static void main(String[] args) {

    }

    public static int findNumber (int num, int[] array) {
        int counter = 0;
        for (int j : array) {
            if (num == j) counter++;
        }
        return counter;
    }
}
