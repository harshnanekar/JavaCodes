import java.util.Scanner;

public class NumberCode {
Armstrong a=new Armstrong();
Fibonacci f=new Fibonacci();
MagicNo m=new MagicNo();
Buzz b=new Buzz();

    public static void main(String[] args) {
        NumberCode n=new NumberCode();
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the operations");
        System.out.println("1.Armstrong");
        System.out.println("2.Fibonacci");
        System.out.println("3.Magic No");
        System.out.println("4.Buzz No.");
        int select= sc.nextInt();

        System.out.println("Enter the number");
        int num=sc.nextInt();
        n.call(select,num);
        System.out.println("Check the other operations also");
        System.out.println("1.Yes");
        System.out.println("2.No");
        String s2=sc.next();
      boolean yesorno = n.check(s2,select,num);
        if(yesorno) {
            System.out.println("1.Armstrong");
            System.out.println("2.Fibonacci");
            System.out.println("3.Magic No");
            System.out.println("4.Buzz No.");
            System.out.println("Enter the operation to perform");
            select = sc.nextInt();
            System.out.println("Enter the number");
            num = sc.nextInt();
            n.checks(select,num);
        }

    }

    private void checks(int select, int num) {
        if(select==1){
            a.armstrong(num);
        }else if (select==2) {
            f.Fibonacci(num);
        } else if (select==3) {
            m.magic(num);
        } else if (select==4) {
            b.buzz(num);
        }else {
            System.out.println("Operation not found");
        }
    }

    private boolean check(String s2, int select, int num) {
       boolean yesorno=false;
        if(s2.equalsIgnoreCase("yes")){
           yesorno=true;

        }else {
            System.out.println("Ok");
        }

        return yesorno;
    }

    private void call(int select, int num) {
        if(select==1){
            a.armstrong(num);
        } else if (select==2) {
            f.Fibonacci(num);
        } else if (select==3) {
            m.magic(num);
        } else if (select==4) {
          b.buzz(num);
        }else {
            System.out.println("Operation not found");
        }
    }
}
