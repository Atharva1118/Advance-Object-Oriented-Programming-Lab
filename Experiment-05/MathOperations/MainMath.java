package MathOperations;
public class MainMath {
    public static void main(String[] args) {
        double number = 12.75;

        FloorOperation f = new FloorOperation();
        CeilOperation c = new CeilOperation();
        RoundOperation r = new RoundOperation();

        System.out.println("Original Number: " + number);
        System.out.println("Floor Value: " + f.getFloor(number));
        System.out.println("Ceil Value: " + c.getCeil(number));
        System.out.println("Round Value: " + r.getRound(number));
    }
}