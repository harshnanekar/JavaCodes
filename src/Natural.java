import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Natural {

    public static void main(String args[]) {

     Natural n=new Natural();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int nat=n.natural(num);
        System.out.println("The natural numbers are" + nat);

    }

    private int natural(int num) {
        if(num>=0){
            return num+natural(num - 1);
        }else{
          return 0;
        }









    }

}



