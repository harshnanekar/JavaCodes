import java.util.Scanner;

public interface NumberCalculation {
    void get(int select,int num);
}
class Calcu implements NumberCalculation{
    Armstrong a=new Armstrong();
    Fibonacci f=new Fibonacci();
    MagicNo m=new MagicNo();
    Buzz b=new Buzz();
    @Override
    public void get(int select, int num) {
        if (select==1){
           a.armstrong(num);
        } else if (select==2) {
           f.Fibonacci(num);
        }else if (select==3) {
            m.magic(num);
        }else if (select==4) {
           b.buzz(num);
        }
    }
}
class Number{

    public static void main(String[] args) {
        Calcu i=new Calcu();
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the operations to perform ");
        System.out.println("1.Armstrong ");
        System.out.println("2.Fibonacci ");
        System.out.println("3.MagicNo.");
        System.out.println("4.BuzzNo. ");
        int select=sc.nextInt();
        System.out.println("Enter the number");
        int num=sc.nextInt();
        i.get(select,num);


    }
}