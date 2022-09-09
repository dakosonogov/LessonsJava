package lesson11.task17;

public class RichTeacher {
    public static void main(String[] args) {
        print(unlockLessons(1, false));
        print(unlockLessons(2, false));
        print(unlockLessons(2, true));
        print(unlockLessons(101, true));
    }

    public static boolean unlockLessons (int num, boolean isUserPremium) {
        if (num < 1 || num > 100) {
            print("Номер невалидный");
            return false;
        } else return isUserPremium || num == 1;
    }
    public static void print (Object o) {
        System.out.println(o);
    }
}
