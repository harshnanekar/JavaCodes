import java.util.Scanner;

public class Fascinating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
            int a, b;
            a = num * 2;
            b = num * 3;
            String nums = String.valueOf(a);
            String num2 = String.valueOf(b);
            String num3 = String.valueOf(num);
            String con = nums.concat(num2).concat(num3);
            char[] chs = con.toCharArray();
            String k = "";
            String ch = "0123456789";
            int count = 0;
            for (int i = 0; i < chs.length; i++) {
                if (!k.contains("" + chs[i])) {
                    if (ch.contains("" + chs[i])) {
                        k = k + chs[i];
                        count++;
                    }
                }
            }
            if (count > 8) {
                System.out.println("Fascinating");
            }else{
                System.out.println("Not Fascinating");
            }

            //Amicable Number

      /*  System.out.println("Enter the First Number");
            int f1=sc.nextInt();
        System.out.println("Enter the second number");
        int f2=sc.nextInt();
        int sum = 0,sum1=0;
        for(int i=1;i<f1 & i<f2 ;i++){
            if(f1%i==0){
                sum=sum+i;
            }
            if(f2%i==0){
                sum1=sum1+i;
            }
        }

     if(f2==sum && f1==sum1){
         System.out.println("Amicable");
     }else{
         System.out.println("Not Amicable");
     }*/
        }
    }


