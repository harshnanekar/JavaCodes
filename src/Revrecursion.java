import java.util.Scanner;

public class Revrecursion {

    public static void main(String[] args) {
        Revrecursion r=new Revrecursion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
       int h=sc.nextInt();
        int num=h/2;
        int prime=0;
       int vgets= r.prime(h,num,prime);
       if(vgets==0){
           System.out.println("It is a prime no.");
       }else{
           System.out.println("It is not a prime no.");
       }
       // r.rec(h);

      /*  String h="harshal";
        char[]ch= h.toCharArray();
        int num=ch.length-1;
        r.recur(ch,num);*/
    }

    private int prime(int h, int num,int prime) {

        if(num>0){
            if(h%num==0){
                prime++;
            }
          prime(h,num-1,prime);
        }
return prime;

    }

    //Reverse String Using Recursion
/*    private void recur(char[] ch, int num) {
        String rev="";
        if(num>=0){
            rev=rev+ch[num];
            System.out.print(rev);
            recur(ch,num-1);
        }
    }*/

    //Reverse no. Using Recursion
    /*private void rec(int h) {
 int rev=0;
 int q=0;
        if(h>0) {
           q=h%10;
           rev=(rev*10)+q;
            System.out.print(rev);
            rec(h/10);
        }*/
    }

