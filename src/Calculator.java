import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Calculator c=new Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Select what do you want to calculate");
        System.out.println("1.Addition(+)");
        System.out.println("2.Subtraction(-)");
        System.out.println("3.Multiplication(*)");
        System.out.println("4.Division(/)");

        String name=sc.nextLine();
         if(name.equalsIgnoreCase("Addition")){
             System.out.println("Enter the first number");
            double i=sc.nextDouble();
             System.out.println("Enter the second number");
             double j=sc.nextDouble();
             c.add(i,j);
         } else if (name.equalsIgnoreCase("Subtraction")) {
             System.out.println("Enter the first number");
             double i=sc.nextDouble();
             System.out.println("Enter the second number");
             double j=sc.nextDouble();
             c.sub(i,j);
         }else if (name.equalsIgnoreCase("Multiplication")) {
             System.out.println("Enter the first number");
             double i=sc.nextDouble();
             System.out.println("Enter the second number");
             double j=sc.nextDouble();
             c.mul(i,j);
         }else if (name.equalsIgnoreCase("Division")) {
             System.out.println("Enter the first number");
             double i=sc.nextDouble();
             System.out.println("Enter the second number");
             double j=sc.nextDouble();
             c.div(i,j);
         }else{
             System.out.println("Invalid Input");
         }



    }

   public void div(double i, double j) {
        double c= i/j;
        System.out.println("The division of two numbers is" + c);
    }

    public void mul(double i, double j) {
        double c= i*j;
        System.out.println("The multiplication of two numbers is" + c);
    }

   public void sub(double i, double j) {
        double c= i-j;
        System.out.println("The subtraction of two numbers is" + c);
    }

    public void add(double i, double j) {
       double c= i+j;
        System.out.println("The addition of two numbers is" + c);
    }


}

