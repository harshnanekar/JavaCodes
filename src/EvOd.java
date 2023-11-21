import java.util.Scanner;

public class EvOd {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        EvOd e=new EvOd();
        System.out.println("Enter the number");
        int n=sc.nextInt();
        e.even(n);


     }

   public void even(int n) {
        if(n/2*2==n){
            System.out.println("Even no.");
        }else{
            System.out.println("Odd no.");
        }
    }


}
