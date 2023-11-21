import java.util.Scanner;

public class Buzz {

    public static void main(String[] args){
        Buzz b=new Buzz();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        b.buzz(n);

    }

    public void buzz(int n) {
        if(n%7==0){
            if(n%10==7){
                System.out.println("It is a buzz number");
            }else {
                System.out.println("It is not a buzz number");
            }
        }
    }
}
