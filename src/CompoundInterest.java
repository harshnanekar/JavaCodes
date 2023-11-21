import java.util.Scanner;

public class CompoundInterest {


    public static void main(String[] args){

      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double principal= sc.nextDouble();

        System.out.println("Enter the Interest rate");
        double rate=sc.nextDouble();

        System.out.println("Enter the time");
        double time=sc.nextInt();
         double compound;

         compound=principal* (Math.pow((1+rate/100),time));
        System.out.println("The compound interest is " + compound);
    }

}
