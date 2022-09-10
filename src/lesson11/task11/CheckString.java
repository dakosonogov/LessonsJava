package lesson11.task11;

public class CheckString {
    public static void main(String[] args) {
        System.out.println(stringCheck("ааа", "ddd"));
        System.out.println(stringCheck("",""));
        System.out.println(stringCheck("", "ss"));
        System.out.println(stringCheck("dd", ""));
        System.out.println(stringCheck("aa", "aa"));
    }

    public static boolean stringCheck (String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return false;
        } else {
            return a.equals(b);
        }
    }
}
