package lesson13.task2;

public class Multiply {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(multiply(new int[]{213,32,54,5, 0}));
    }

    public static int multiply(int[] array) {
        int result = 1;
        for (int j : array) {
            if (j ==0) {
                return 0;
            } else result *= j;
        }
        return result;
    }
}
