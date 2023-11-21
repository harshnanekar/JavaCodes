import java.util.Scanner;

public class Peterson {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        int temp=n;
        int total=0;
       while(temp>0){
           int fact=1;
            int q=temp%10;

            for (int i=q;i>0;i--) {
                 fact *= i;

            }
           total=total+fact;

            temp=temp/10;
        }
        if (total == n) {
            System.out.println("It is a peterson number");
        }else{
            System.out.println("It is not a peterson number");
        }
    }
}
