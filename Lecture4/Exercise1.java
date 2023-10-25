public class MathOperations {
    public static void main(String[] args) {
        // Declare and assign a decimal variable
        double decimalValue = 7.5; // You can change this value

        // Trigonometric functions
        double sine = Math.sin(decimalValue);
        double cosine = Math.cos(decimalValue);
        double tangent = Math.tan(decimalValue);
        double cotangent = 1 / tangent;

        // Square root, square, and cube
        double squareRoot = Math.sqrt(decimalValue);
        double square = Math.pow(decimalValue, 2);
        double cube = Math.pow(decimalValue, 3);

        // Smallest/largest integer
        int smallestInteger = (int) Math.floor(decimalValue);
        int largestInteger = (int) Math.ceil(decimalValue);

        // Area of a circle
        double radius = decimalValue;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        // Output results
        System.out.println("Sine: " + sine);
        System.out.println("Cosine: " + cosine);
        System.out.println("Tangent: " + tangent);
        System.out.println("Cotangent: " + cotangent);
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Smallest Integer: " + smallestInteger);
        System.out.println("Largest Integer: " + largestInteger);
        System.out.println("Area of Circle with radius " + radius + ": " + areaOfCircle);
        System.out.println("Value of Pi (π): " + Math.PI);
        System.out.println("Value of E (e): " + Math.E);
    }
}
