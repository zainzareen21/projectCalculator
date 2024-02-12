/**
 * The calculator class provides methods for performing basic arithmetic operations on floating-point
 * numbers.
 */
public class calculator {
    /**
     * The function "add" takes two float numbers as input and returns their sum.
     * 
     * @param num1 The first number to be added.
     * @param num2 The second number to be added.
     * @return The sum of num1 and num2.
     */
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    /**
     * The function subtracts two float numbers and returns the result.
     * 
     * @param num1 The first number to be subtracted.
     * @param num2 The second number to be subtracted from the first number.
     * @return The difference between num1 and num2 is being returned.
     */
    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    /**
     * The function takes two float numbers as input and returns their product.
     * 
     * @param num1 The first number to be multiplied.
     * @param num2 The second number to be multiplied.
     * @return The product of num1 and num2 is being returned.
     */
    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    /**
     * The function divides two floating-point numbers and returns the result.
     * 
     * @param num1 The first number to be divided.
     * @param num2 The second number to be divided by.
     * @return The division of num1 by num2.
     */
    public float divide(float num1, float num2) {
        return num1 / num2;
    }

    public float square(float num1) {
        return (float) Math.pow(num1, 2);
    }
    
    public float cube(float num1) {
        return (float) Math.pow(num1, 3);
    }
    

    public static void main(String[] args) {
        // The line `calculator calculator = new calculator();` is creating a new instance of the
        // `calculator` class and assigning it to the variable `calculator`. This allows us to access
        // the methods and variables of the `calculator` class using the `calculator` object.
        calculator calculator = new calculator();

        // The lines `float num1 = 22.0f;` and `float num2 = 0f;` are declaring and initializing two
        // float variables named `num1` and `num2`.
        float num1 = 22.0f;
        float num2 = 2f;

        // The lines `System.out.println("Addition: " + calculator.add(num1, num2));`,
        // `System.out.println("Subtraction: " + calculator.subtract(num1, num2));`,
        // `System.out.println("Multiplication: " + calculator.multiply(num1, num2));`, and
        // `System.out.println("Division: " + calculator.divide(num1, num2));` are printing the results
        // of the calculator operations to the console.
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
        System.out.println("Square: " + calculator.square(num1));
        System.out.println("Cube: " + calculator.cube(num1));

    }
}
