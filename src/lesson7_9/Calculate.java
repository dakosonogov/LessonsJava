package lesson7_9;

public class Calculate {
    private static final String WARNING_MESSAGE = "На ноль делить нельзя!";

    public static void main(String[] args) {

    print(divide(1.0f, 0));
    }

    private static void print(String message) {
        System.out.println(message);
    }

    private static void print (int num) {
        System.out.println(num);
    }

    private static void print (float num) {
        System.out.println(num);
    }

    private static void print (double num) {
        System.out.println(num);
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

    private static float sum(float num1, float num2) {
        return num1 + num2;
    }

    private static double sum(double num1, double num2) {
        return num1 + num2;
    }

    private static int diff(int num1, int num2) {
        return num1 - num2;
    }

    private static float diff(float num1, float num2) {
        return num1 - num2;
    }

    private static double diff(double num1, double num2) {
        return num1 - num2;
    }

    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private static int divide(int num1, int num2) {
        int result = 0;
        if (num2 == 0) {
            print(WARNING_MESSAGE);
            return result;
        }
        return result;
    }

    private static float divide(float num1, float num2) {
        float result = 0;
        if (num2 == 0) {
            print(WARNING_MESSAGE);
            return result;
        }
        return result;
    }

    private static double divide(double num1, double num2) {
        double result = 0;
        if (num2 == 0) {
            print(WARNING_MESSAGE);
            return result;
        }
        return result;
    }


}
