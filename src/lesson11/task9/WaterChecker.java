package lesson11.task9;

public class WaterChecker {
    private static final int WATER_FREEZING_DEGREE_CELSIUS = 0;
    private static final int ABSOLUTE_NULL_CELSIUS = -273;
    private static final int WATER_BOILING_DEGREE_CELSIUS = 100;

    private static final int PLASMA_DEGREE_CELSIUS = 10000;
    public static void main(String[] args) {
        waterTemperature(-434353);
        waterTemperature(0);
        waterTemperature(30);
        waterTemperature(451);
        waterTemperature(1000000);
    }

    public static void waterTemperature(int t) {
        if (t < ABSOLUTE_NULL_CELSIUS) {
            print("Не может быть температуры ниже абсолютного ноля");
        } else {
            if (t <= WATER_FREEZING_DEGREE_CELSIUS) {
                print("При атмосферном давлении равном давлению на уровне моря это должен быть лед");
            } else if (t < WATER_BOILING_DEGREE_CELSIUS) {
                print("При атмосферном давлении равном давлению на уровне моря это должна быть жидкость");
            } else if (t < PLASMA_DEGREE_CELSIUS) {
                print("При атмосферном давлении равном давлению на уровне моря это должен быть газ");
            } else print("Это плазма");
        }
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}
