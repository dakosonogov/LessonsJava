package lesson11.task9;

public class WaterChecker {

    public static void main(String[] args) {
        waterTemperature(-434353);
        waterTemperature(0);
        waterTemperature(30);
        waterTemperature(451);
        waterTemperature(1000000);
    }

    public static void waterTemperature (int t) {
        if (t < -273) {
            System.out.println("Не может быть температуры ниже абсолютного ноля");
        } else {
            if (t <= 0) {
                System.out.println("При атмосферном давлении равном давлению на уровне моря это должен быть лед");
            } else if (t < 100) {
                System.out.println("При атмосферном давлении равном давлению на уровне моря это должна быть жидкость");
            } else if ( t < 10000) {
                System.out.println("При атмосферном давлении равном давлению на уровне моря это должен быть газ");
            } else System.out.println("Это плазма");
        }
    }
}
