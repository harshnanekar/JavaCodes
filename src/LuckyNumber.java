import java.util.Scanner;

public class LuckyNumber {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
int n=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                n=i;
                for (int j=n ;j<=100;j++){
                    if(n%3!=0){
                        System.out.println(n);
                    }
                }
            }
        }
    }
}
