import java.util.Scanner;

public interface Plus {

    void calculate(int a,int b);
}
interface Minus extends Plus{
    void calculate(int a,int b);
}
interface Multiply extends Minus{
    void calculate(int a,int b);
}
interface Divide extends Multiply{
    void calculate(int a,int b);
}
class Implementing implements Plus,Minus,Multiply,Divide{
int c;
     @Override
    public void calculate(int a, int b) {
        c=a+b;
         System.out.println("Addition of two numbers is " + c);
         c=a-b;
         System.out.println("Subtraction of two numbers is " + c);
         c=a*b;
         System.out.println("Multiplication of two numbers is " + c);
         c=a/b;
         System.out.println("Division of two numbers is " + c);

    }
}
class Cal{
    public static void main(String[] args){
        Implementing i=new Implementing();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        i.calculate(a,b);

    }
}
