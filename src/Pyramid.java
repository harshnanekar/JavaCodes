import java.util.Arrays;
import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");*/

       /* for (int i = 1; i <= n; i++) {
            if (i <= (n / 2 + 1)) {

                for (int j = 1; j <= n; j++) {
                    if (j >= 2) {

                        if (j == i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print("*");
                    }

                }

            } else {
                for (int j = i; j <= n; j++) {
                    if (j > i) {
                        if (j < n) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    } else {
                        System.out.print("*");
                    }

                }

            }
            System.out.println(" ");
        }*/

        int n = 4;
        int b = 7;
      for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j==i || i==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            for ( int k=4; k <= b; k++) {

                    if (k > 4 ) {
                        if (k == (i + 3) || i==n) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
            }
            System.out.println(" ");
        }
    }
}































