import java.util.Scanner;

class Cuboid {
    public static void main( String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length, Breadth and Height Of Cuboid: ");
        float length = sc.nextFloat();
        float breadth= sc.nextFloat();
        float height= sc.nextFloat();

        //Front or Back Side Area
        float frontArea = length*height;
        System.out.println("Area Of Front/back Face Of Cuoid is : "+frontArea);

        // Left or Right Side Area
        float leftArea = breadth*height;
        System.out.println("Area Of left/right Face Of Cuoid is : "+leftArea);

        //Bottom or Upper Side Area
        float bottomArea = length*breadth;
        System.out.println("Area Of bottom/upper Face Of Cuoid is : "+bottomArea);

        //Volume 
        float volume = length*breadth*height;
        System.out.println("Volume Of Cuboid is : "+volume);

        //Perimeter
        float perimeter = 2*(length+breadth+height);
        System.out.println("Perimeter Of Cuboid is : "+perimeter);

        //Total Area
        float Totalarea= 2*( (length*breadth)+(breadth+height)+(height*length) );
        System.out.println("Total Area Of Cuboid is : " +Totalarea);
    }
    
}
