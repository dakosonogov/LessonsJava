package lesson11.task8;

public class Counter {
    public static int count = 1;
    public static void main(String[] args) {
        System.out.println(counter());
        System.out.println(counter());
        System.out.println(counter());
        System.out.println(counter());
    }

    public static int counter () {
        return count++;
    }
}
