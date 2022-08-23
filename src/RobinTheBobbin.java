public class RobinTheBobbin {
    public static void main(String[] args) {
        final String eaterName = "Robin the Bobbin";
        String food = "meat";
        eat(eaterName, food);
        food = "bread";
        eat(eaterName, food);
        food = "eggs";
        eat(eaterName, food);
        food = "chicken";
        eat(eaterName, food);
        food = "pie";
        eat(eaterName, food);
        food = "pizza";
        eat(eaterName, food);
    }

    private static void eat(String eater, String food) {
        System.out.println(eater + " eat " + food + " and feels happy!");
    }
}
