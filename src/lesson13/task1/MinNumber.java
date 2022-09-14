package lesson13.task1;

public class MinNumber {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{-5,23,234,1,4,-10}));
    }

    public static int findMin (int[] array) {
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (min > j) min = j;
        }
        return min;
    }
}
