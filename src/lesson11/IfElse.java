package lesson11;

public class IfElse {

    public static void main(String[] args) {

    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }

    public static int largestNumber(int a, int b, int c, int d) {
        int num;
        if (a >= b && a >= c && a >= d) {
            num = a;
        } else if (b >= c && b >= d) {
            num = b;
        } else if (c >= d) {
            num = c;
        } else num = d;
        return num;
    }
}
