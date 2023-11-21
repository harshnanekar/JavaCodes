import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DSA1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Profit
       /* int[] prices={7,1,5,3,6,4};
        System.out.println("Enter the day to buy");
        int day=sc.nextInt();
        System.out.println("Enter the day to sell");
        int sell=sc.nextInt();
        int day1 = 0,sell1=0;
        int total=0;
        for(int i=0;i<prices.length;i++){
            if(i==day ){
                day1=prices[i];
            }else if(i==sell ){
                sell1=prices[i];
            }
        }
        if(sell1>day1){
        total=sell1-day1;
        }else{
            total=day1-sell1;
        }
        System.out.println("Profit is " + total);*/

        System.out.println("Enter the number");
        int num = sc.nextInt();
     int temp=num;
     int total=0;
     while(temp>0){
         int q=temp%10;
         total=total+q*q*q;
         temp=temp/10;
     }
        if (total == num) {
            System.out.println("Armstrong");
        }else{
            System.out.println("it is not a armstrong");
        }
       /* int product = num * num;
       String tem="";
       int count=0;
       String nums=String.valueOf(num);
        char[] ch=String.valueOf(product).toCharArray();
        for(int i=ch.length-1;i>=0;i--){
         tem=tem+ch[i];
            System.out.println(tem);
         if(nums.contains(tem)){
             count++;
         }
        }
        if(count>0){
            System.out.println("Automorphic");
        }else{
            System.out.println("Not an automorphic");
        }*/
    }
}
