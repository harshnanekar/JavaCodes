import java.util.Scanner;

public class Prime {

    public void prime1(int n) {
        int prime = 0;
        for (int i = 2; i<n; i++) {


                if(n%i==0){
                    prime++;
                    break;
                }
            }
            if(prime==0){
                System.out.println("Prime no.");

            }else {
                System.out.println("Not a prime");
            }
        }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Prime p=new Prime();
        System.out.println("Enter the number");
        int n = sc.nextInt();
      //  int k = 1;
        p.prime1(n);

       /* for (int i = 2; k <= n * 2; i++) {
            int prime = 0;
            for (int j = 2; j <= i / 2; j++) {
                if(i%j==0){
                    prime++;
                    break;
                }
            }
            if(prime==0){
                k++;
                if(k%2==0){
                    System.out.println(i);
                }
            }
        }*/

        //Alternate Even No.
  /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int k=1;
        for(int i=1;k<=n*2;i++){
            if(i%2==0){
                k++;
                if(k%2==0) {
                    System.out.println(i);
                }
            }
        }*/

//Print alternate characters of a string
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        char[] ch=s.toCharArray();
        String sum=" ";
        for (int i=0;i<ch.length;i++){
            if(i%2==0){
                sum=sum+ch[i];
            }
        }
        System.out.println("Alternate characters of a string are" + sum);*/



    }


}

