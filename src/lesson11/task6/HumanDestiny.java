package lesson11.task6;

public class HumanDestiny {
    public static void main(String[] args) {
        humanDestiny(5);
        humanDestiny(12);
        humanDestiny(99);
        humanDestiny(23);
        humanDestiny(19);
        humanDestiny(-1);
        humanDestiny(900);
    }

    public static void humanDestiny (int a) {
        if ( a > 0 && a < 123) {
            if (a < 7) {
                System.out.println("Идти в детсад");
            } else if (a < 18) {
                System.out.println("Идти в школу");
            } else if (a < 20) {
                System.out.println("Идти в колледж");
            } else if (a < 25) {
                System.out.println("Идти в университет");
            } else if (a < 65) {
                System.out.println("Идти работать");
            } else System.out.println("Идти в поликлинику");
        } else System.out.println("Уйди, нелюдь");
    }
}
