public class RobinTheBobbin {
    private static final String EATER_NAME = "Robin the Bobbin";
    public static void main(String[] args) {

        String food = "meat";
        eat(food);
        food = "bread";
        eat(food);
        food = "eggs";
        eat(food);
        food = "chicken";
        eat(food);
        food = "pie";
        eat(food);
        food = "pizza";
        eat(food);
    }

    private static void eat( String food) {
        System.out.println(EATER_NAME + " eat " + food + " and feels happy!");
    }
}
