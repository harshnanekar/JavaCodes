import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class recursion {
   public void factorial(int n) {
       int fact=1;
       for(int i=n;i>=1;i--){
           fact=fact*i;

       }
       System.out.println("The factorial of number is " + fact);

    }
    public static void main (String args[]){





        recursion r=new recursion();
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
       r.factorial(n);
      System.out.println("The factorial of a number is" );
    }



}
