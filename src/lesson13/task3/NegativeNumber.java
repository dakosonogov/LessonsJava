package lesson13.task3;

public class NegativeNumber {
    public static void main(String[] args) {

    }

    public static int countNegativeNumbers(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j < 0) {
                counter++;
            }
        }
        return counter;
    }
}
