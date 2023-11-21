import java.util.Scanner;

public class Emirp {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        int prime=0;
        for(int i =2;i<=n/2;i++){
            if(n%i==0){
                prime++;
                break;
            }
        }
        if(prime==0){
            while(temp>0){
                int q=temp%10;
                rev=(rev*10)+q;
                temp/=10;
            }
            int pri=0;
            for(int i =2;i<=rev/2;i++){
                if(rev%i==0){
                    pri++;
                    break;
                }
            }
            if(pri==0){
                System.out.println("It is a emirp number ");
            }else{
                System.out.println("It is not a emirp number");
            }
        }else{
            System.out.println("It is not a emirp number");
        }
















     /*
        System.out.println(rev);*/
    }
}
