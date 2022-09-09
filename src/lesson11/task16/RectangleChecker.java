package lesson11.task16;

public class RectangleChecker {
    public static void main(String[] args) {
        checkRectangle(1,1,1,1);
        checkRectangle(1,2,1,2);
        checkRectangle(1,2,2,4);
        checkRectangle(0,1,-1,5);
    }

    public static void checkRectangle (int side1, int side2, int side3, int side4) {
        if (side1 > 0 && side2 > 0 && side3 > 0 && side4 > 0 ) {
            if (side1 == side2 && side2 == side3 && side3 == side4) {
                //может быть ромб
                print("квадрат");

            } else if (side1 == side3 && side2 == side4) {
                //верно только если мы уверены в порядке сторон, что вводят следуя по часовой стрелке или против
                print("прямоугольник");
            } else print("четырехугольник");
        } else print("Это не четырехугольник");
    }
    public static void print (Object o) {
        System.out.println(o);
    }
}
