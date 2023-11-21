import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal amount");
        double principal=sc.nextDouble();

        System.out.println("Enter the Interest rate");
        double rate=sc.nextDouble();

        System.out.println("Enter the time");
        double time=sc.nextDouble();
        double simple;

        simple=(principal*rate*time)/100;
        System.out.println("The principal amount is " + principal);
        System.out.println("The Interest rate is " + rate);
        System.out.println("The time period is " + time);
        System.out.println("The simple interest is " + simple);


    }


}
