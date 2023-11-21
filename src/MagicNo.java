import java.util.Scanner;

public class MagicNo {
    public void magic(int n) {

        if(n%9==1){
            System.out.println("It is a magic no.");
        }else{
            System.out.println("It is not a magic no.");
        }

    }

    public static void main(String[]args){
        MagicNo m=new MagicNo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        m.magic(n);
        /*int temp=n;
        int total=0;
        int a,b,result=0;
*/
/*
        if(n%9==1){
            System.out.println("It is a magic no.");
        }else{
            System.out.println("It is not a magic no.");
        }*/

        /*while (temp > 0) {
          int c=temp%10;
         total=total+c;
         temp=temp/10;
        }
        a=total/10;
        b=total%10;
        result=a+b;

        if(result==1){
            System.out.println("It is a Magic no.");
        }else {
            System.out.println("It is not a Magic no.");
        }*/



        //Printing magic numbers between 1 to n
        /*for(int i=1;i<=n;i++){
            temp=i;
            total=0;
            while(temp>0){
                int c=temp%10;
                total=total+c;
                temp=temp/10;
            }
            a=total/10;
            b=total%10;
            result=a+b;
            if(result==1){
                System.out.println(i);
            }
        }*/
    }


}
