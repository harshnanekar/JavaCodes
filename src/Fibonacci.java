import java.util.Scanner;

public class Fibonacci {

    int first = 0;
    int second = 1;
    int next;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci f = new Fibonacci();
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        int next;

      /*  for(int i=1;i<=num;i++){
            System.out.println(first);
            next=first+second;
            first=second;
            second=next;

        }*/
        f.Fibonacci(num);


/*
        System.out.println(f.first);
        System.out.println(f.second);
        f.Fibonacci(num - 2);
*/

    }

    public void Fibonacci(int num) {
       /* if (num>0) {
            next = first + second;
            System.out.println(next);
            first=second;
            second=next;
            Fibonacci(num-1);
        }*/

        int first = 0;
        int second = 1;
        int next;
        for (int i = 1; i <= num; i++) {
            System.out.println(first);
            next = first + second;
            first = second;
            second = next;
        }


    }
}


