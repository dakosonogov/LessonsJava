package lesson11.task4;

public class Triangle {
    public static void main(String[] args) {
        checkTriangleAngles(100,40,40);
    }

    public static void checkTriangleAngles (int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0 && (a + b +c) == 180) {
            if (a == 90 || b == 90 || c == 90) {
                checkTriangleSides(a, b, c);
                System.out.println("Это прямоугольный треугольник");
            } else if ( a > 90 || b > 90 || c > 90) {
                System.out.println("Это тупоугольный треугольник");
                checkTriangleSides(a, b, c);
            } else  {
                System.out.println("Это остроугольный треугольник");
                checkTriangleSides(a, b, c);
                /*Были мысли о том, что проверка на равносторонний треугольник
                имеет смысл только когда он остроугольный и как-то на эту тему оптимизировать код, но пока хз
                 */

            }
        } else System.out.println("Это не треугольник");
    }

    public static void checkTriangleSides (int a, int b, int c) {
        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Это равносторонний трегольник");
        } else if (a == b || a == c || b ==c ) {
            System.out.println("Это равнобедренный трегоульник");
        }
    }
}
