import java.util.Scanner;

public class Sunny{

    public static void main(String[] args) {
      int n=81;
      int square=0;
      int temp=n+1;
      for(int i=0;i<temp;i++){
          if(i*i==temp){
              square=i*i;
          }
      }
      if(square==temp){
          System.out.println("It is a sunny number");
      }else {
          System.out.println("It is not a sunny number");
      }

        //Duck number
     /* int m=250;
      if(m%10==0){
          System.out.println("Duck number");
      }else {
          System.out.println("Not Duck");
      }*/
    }
}
