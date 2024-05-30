import java.util.Scanner;
class EvenOddChecker
{
    public static void main(String arg[])
    {
        int a =1;
        int b =0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();

        if(num1%2 == 0)
        System.out.println(a);
        else
        System.out.println(b);
       
    }
}