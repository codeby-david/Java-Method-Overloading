public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        double c = 24.56;
        double d = 30.58;

        // Calling overloaded methods
        System.out.println("Sum of integers: " + sum(a, b));
        System.out.println("Sum of doubles: " + sum(c, d));
        System.out.println("Product of integers: " + product(a, b));
        System.out.println("Product of doubles: " + product(c, d));
    }

    // Overloaded sum method for integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Overloaded sum method for doubles
    public static double sum(double a, double b) {
        return a + b;
    }

    // Overloaded product method for integers
    public static int product(int a, int b) {
        return a * b;
    }

    // Overloaded product method for doubles
    public static double product(double a, double b) {
        return a * b;
    }
}
