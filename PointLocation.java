import java.util.Scanner;

public class PointLocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the x-coordinate: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter the y-coordinate: ");
        int y = scanner.nextInt();
        
        if (x == 0 && y == 0) {
            System.out.println("The point is at the origin.");
        } else if (x == 0) {
            System.out.println("The point lies on the y-axis.");
        } else if (y == 0) {
            System.out.println("The point lies on the x-axis.");
        } else {
            String quadrant = (x > 0 && y > 0) ? "first" : (x < 0 && y > 0) ? "second" : (x < 0 && y < 0) ? "third" : "fourth";
            System.out.println("The point is in the " + quadrant + " quadrant.");
        }
        
        scanner.close();
    }
}
