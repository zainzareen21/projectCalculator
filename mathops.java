import java.lang.Math;
public class mathlib{

    double x = 10.0;
    double y = 5.0;
    int n = 3;

    public void squareRoot() {
        double result = Math.sqrt(x);
        System.out.println("The square root of " + x + " is " + result);
    }

    public void power() {
        double result = Math.pow(x, n);
        System.out.println(x + " raised to the power of " + n + " is " + result);
    }

    public void logarithm() {
        double result = Math.log(x);
        System.out.println("The natural logarithm of " + x + " is " + result);
    }

    public void absoluteValue() {
        double result = Math.abs(x);
        System.out.println("The absolute value of " + x + " is " + result);
    }

    public void maximum() {
        double result = Math.max(x, y);
        System.out.println("The maximum of " + x + " and " + y + " is " + result);
    }

    public void minimum() {
        double result = Math.min(x, y);
        System.out.println("The minimum of " + x + " and " + y + " is " + result);
    }
    public static void main(String[] args) {
        mathlib mb = new mathlib();
        mb.squareRoot();
        mb.power();
        mb.logarithm();
        mb.absoluteValue();
        mb.maximum();
        mb.minimum();
    }
}
