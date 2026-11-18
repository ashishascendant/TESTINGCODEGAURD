public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        System.out.println("Addition: " + add(20, 10));
        System.out.println("Subtraction: " + subtract(20, 10));
        System.out.println("Multiplication: " + multiply(20, 10));
        System.out.println("Division: " + divide(20, 10));
    }
}