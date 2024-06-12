import java.util.Scanner;

class arrays {
    public static void main(String args[]) {

        //Forward printing using for loop: First Method 
        int A[] = new int[5];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
       
        //Forward printing using for loop: Second Method
       int B[]={10,20,30,40,50};
       for (int j=0;j<B.length;j++){
        System.out.println(B[j]);
       }

       //Backward printing using for loop
       for(int i=A.length-1;i>=0;i--)
       {
        System.out.println(A[i]);
       }

       //Forward printing using for each loop
       for (int x:B)
       {
        System.out.println(x);
       }






    }
}
