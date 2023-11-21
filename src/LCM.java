import java.util.Scanner;

public class LCM {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int first=sc.nextInt();

        System.out.println("Enter the second number");
        int second=sc.nextInt();
        int gcd=0;
        for(int i=1;i<=first && i<=second;i++){
          if(first%i==0 && second%i==0){
              gcd=i;
          }
           }

   int lcm=((first*second)/gcd);
        System.out.println("The lcm is " + lcm);
        }


    }

