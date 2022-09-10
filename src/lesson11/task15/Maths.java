package lesson11.task15;

public class Maths {
    public static void main(String[] args) {
        print(findModule(-5));
        print(findModule(0));
        print(findModule(32432));
    }

    public static int findModule (int a) {
        return a >= 0 ? a : a * -1;
    }

    public static void print (Object o) {
        System.out.println(o);
    }
}
