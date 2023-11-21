import java.util.Scanner;

public class Strontio {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        String check=sc.next();
        int num=Integer.parseInt(check);

        int count=0;
        int temp=num;
        while(temp>0){
            count++;
            temp/=10;

        }
        System.out.println();
        int total=0;
        int min=0,max=0;
     if(count==check.length()){
int store=0;
        total=num*2 ;
        min=total/100;
        max=total%100;
        while(min>0){
            int q=min%10;
            store=(store*10)+q;
            min/=10;
        }
        if(store==max){
            System.out.println("It is a strontio no.");
        }else{
            System.out.println("It is not a strontio no.");
        }

     }else{
         System.out.println("Number is not 4 digit");
     }
    }
}
