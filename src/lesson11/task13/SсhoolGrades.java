package lesson11.task13;

public class SсhoolGrades {
    public static void main(String[] args) {
        checkGrades(3, 4, 5,5,5);
        checkGrades(3, 3, 3,5,5);
        checkGrades(2, 2, 2,3,3);
        checkGrades(5, 5, 5,5,5);
    }

    public static void checkGrades (int a, int b, int c, int d, int e) {
        double average = ( a + b + c + d + e)/ 5.0;
        if (average == 5) {
            print ("Отличник");
        } else if (average >= 4 ) {
            print("Хорошист");
        } else if (average >=3) {
            print("Троечник");
        } else print("Двоечник");
    }

    public static void print (Object o) {
        System.out.println(o);
    }
}
