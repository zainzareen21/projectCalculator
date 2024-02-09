import java.util.Scanner;

public class ExtendedArithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the extended arithmetic program!");
        System.out.println("Please enter two numbers:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Please choose an operation:");
        System.out.println("1. Square");
        System.out.println("2. Cube");
        System.out.println("3. Modulus");
        System.out.println("4. Power");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The square of " + x + " is " + square(x));
                break;
            case 2:
                System.out.println("The cube of " + x + " is " + cube(x));
                break;
            case 3:
                System.out.println("The modulus of " + x + " and " + y + " is " + modulus(x, y));
                break;
            case 4:
                System.out.println("The power of " + x + " and " + y + " is " + power(x, y));
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
    public static double square(double x) {
        return Math.pow(x, 2);
    }
    public static double cube(double x) {
        return Math.pow(x, 3);
    }
    public static double modulus(double x, double y) {
        return x % y;
    }
    public static double power(double x, double y) {
        return Math.pow(x, y);
    }
}
