import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the celsius");
        int celsius=sc.nextInt();
        int fahren= (int)((celsius * 1.8) + 32);
        System.out.println("Fahrenheit of celsius " + celsius + "* C"+ " is " + fahren+"* F");



        System.out.println("Enter the Fahrenheit");
        fahren=sc.nextInt();
      double  celsius1= ((fahren-32)/1.8);
        System.out.println("Fahrenheit of celsius " + celsius1 + "* C"+ " is " + fahren+"* F");

    }

}
