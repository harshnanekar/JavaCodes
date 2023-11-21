import java.util.Scanner;

public class GCD {

  public void gcd(int i, int j) {
      int gc=0;
      for(int n=1;n<i && n<j;n++){
          if(i %n==0 && j % n==0){
              gc=n;
          }
      }
      System.out.println("The GCD of both numbers " + i + " and " + j + " is " + gc );


  }

    public static void main(String[] args){
        GCD g=new GCD();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int i=sc.nextInt();
        System.out.println("Enter the second number");
        int j=sc.nextInt();

        g.gcd(i,j);

    }


}
