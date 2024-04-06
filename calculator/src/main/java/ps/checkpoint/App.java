package ps.checkpoint;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.add(1, 2));
        System.out.println("Subs: " + calculator.subtract(1, 2));
        System.out.println("Mult: " + calculator.multiply(1, 2));
        System.out.println("Div: " + calculator.divide(1, 2));
        System.out.println("Mod: " + calculator.mod(1, 2));

    }
}
