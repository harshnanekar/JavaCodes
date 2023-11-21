import java.util.Scanner;

abstract class Shape{

    abstract void display(int length,int breadth);

}
abstract class Rectangle extends Shape{

    int area=0;


    @Override
    void display(int length, int breadth) {
        area=length*breadth;
        System.out.println(area);
    }
    abstract void cuboid(int length,int breadth,int height);
}
 class Cuboid extends Rectangle{

     int volume=0;
     @Override
     void cuboid(int length, int breadth, int height) {
         volume=length*breadth*height;
         System.out.println(volume);
     }



 }



public class Oops {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    Rectangle r=new Cuboid();
        System.out.println("Enter the length for rectangle");
        int length=sc.nextInt();
        System.out.println("Enter the breadth for rectangle");
        int breadth=sc.nextInt();

    r.display(length,breadth);
        System.out.println("Enter the length for cuboid");
       length=sc.nextInt();
        System.out.println("Enter the breadth for cuboid");
      breadth=sc.nextInt();
        System.out.println("Enter the height for cuboid");
        int height=sc.nextInt();
      r.cuboid(length,breadth,height);
    }
}
