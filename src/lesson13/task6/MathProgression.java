package lesson13.task6;

public class MathProgression {
    public static void main(String[] args) {
        System.out.println(isProgression(new int[]{1,2,3,4,8}));
    }

    public static boolean isProgression (int[] array) {
        if (array.length < 2) return false;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i + 1] - array[i] != array[1] - array[0])
                return false;
        }
        return true;
    }
}
