import java.util.Scanner;

abstract  class  Addition{
    int c;
    abstract void calculate(int a,int b);

}
   abstract  class  Subtraction extends Addition{
       abstract void calculate(int a,int b);
   }
   abstract  class Multiplication extends  Subtraction{
       abstract void calculate(int a,int b);
   }
   abstract class Division extends Multiplication {
    abstract void calculate(int a,int b);
   }
   class  Calculating extends Division {
        void calculate(int a,int b){
            c=a+b;
            System.out.println(" The addition of two numbers is " + c);
            c=a-b;
            System.out.println(" The subtraction of two numbers is " + c);
            c=a*b;
            System.out.println(" The multiplication of two numbers is " + c);
            c=a/b;
            System.out.println(" The division of two numbers is " + c);
        }


   }



    class Abstraction{

        public static void main(String[] args) {
            Division d=new Calculating();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first number");
            int a= sc.nextInt();
            System.out.println("Enter the second number");
            int b= sc.nextInt();
             d.calculate(a,b);

        }


    }



