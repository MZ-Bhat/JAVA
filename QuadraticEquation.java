import java.util.Scanner;

class QuadraticEquation {
    public static void main( String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a,b,c: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        double r1 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        double r2 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        


        System.out.println("Roots are: r1= " +r1+ " and r2= " +r2 );
        
    }    
}
