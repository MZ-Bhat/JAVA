import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.println("Circle:");
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Perimeter of the circle: " + circlePerimeter);

        // Rectangle
        System.out.println("\nRectangle:");
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);

        sc.close();
    }
}
