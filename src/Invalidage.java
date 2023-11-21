import java.util.InputMismatchException;
import java.util.Scanner;

public class  Invalidage {
    private void check(int a) throws InputMismatchException{
        if((a%2==0)){
            System.out.println("Even no.");
        }else{
          throw new InputMismatchException("Odd no");
        }
    }

    public static  void main(String []args){
        Invalidage i=new Invalidage();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=0;
        try{
            a= sc.nextInt();
            i.check(a);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }finally {
            if((int)a%2==0){
                System.out.println("Even no.");
            }else{
                System.out.println("Odd no.");
            }
        }

    }



}
