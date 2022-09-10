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

    public static void humanDestiny (int age) {
        if ( age > 0 && age < 123) {
            if (age < 7) {
                print("Идти в детсад");
            } else if (age < 18) {
                print("Идти в школу");
            } else if (age < 20) {
                print("Идти в колледж");
            } else if (age < 25) {
                print("Идти в университет");
            } else if (age < 65) {
                print("Идти работать");
            } else print("Идти в поликлинику");
        } else print("Уйди, нелюдь");
    }

    public static void print (Object o) {
        System.out.println(o);
    }
}
