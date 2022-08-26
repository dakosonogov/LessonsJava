package lesson11;

public class IfElse {

    public static void main(String[] args) {

    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }

    public static int minNumber(int a, int b, int c, int d) {
        int num = a;
        if (b <= num) {
            num = b;
        } if (c <= num) {
            num = c;
        } if (d <= num) {
            num = d;
        }
        return num;
    }

    public static void ringTheBell(boolean isDayOff, boolean isHoliday) {
        if (!isHoliday) {
            if (isDayOff) {
                System.out.println("11-00 AM - Brrrr");
            } else System.out.println("6-00 AM - Brrrr");
        }
    }
}
