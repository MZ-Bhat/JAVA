import java.util.Scanner;

class TriangleAreaCalculator {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Using Base and Height
        System.out.println("Enter Value of Base: ");
        double b = sc.nextDouble();

        System.out.println("Enter Value of Height: ");
        double h = sc.nextDouble();

        double a=1f/2f*(b*h);
        System.out.println("Area of triangle with base " +b+ " And Height " +h+ " is "+a);

        // Using sum of sides

        System.out.println("Enter Value Of side1,side2,side3 :");
        float side1=sc.nextFloat();
        float side2=sc.nextFloat();
        float side3=sc.nextFloat();

        float sum = 1/2f*(side1+side2+side3);
        double area = Math.sqrt( sum*(sum-side1)*(sum-side2)*(sum-side3) );
        System.out.println(area);
    }

}
