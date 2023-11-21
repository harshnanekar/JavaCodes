import java.io.ObjectStreamException;
import java.util.Scanner;

public class oddeven {


    private void odd(int num) throws OddEvenException {
        if(num%2==0){
            System.out.println("Even No.");
        }else{
            throw new OddEvenException("Odd No.");
            }
        }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        oddeven e=new oddeven();
         System.out.println("Enter the number");
         int num=sc.nextInt();
         try{
             e.odd(num);
         }catch (OddEvenException evenException){
             evenException.printStackTrace();
         }
   /*    int gets= e.fact(numm);
        System.out.println("The factorial of a number " + gets);*/




        /*int first=0;
        int second=1;
     numm=numm-2;
        System.out.println(first);
        System.out.println(second);
        e.recur(numm,first,second);*/
    }



    //EvenOdd
    /*private void even(int numm) {
        int count=1;
        if(numm>0){
           if(numm%2==0){
               System.out.println(numm);
           }
            even(numm-1);
        }
    }*/

    /*private int fact(int numm) {
        if(numm>0){

            return numm*fact(numm-1);
        }else {

            return 1;
        }
    }
*/
   /* private void recur( int numm,int first,int second) {
        if(numm>0){

            int next=first+second;
            System.out.println(next);
           first=second;
           second=next;
            recur(numm-1,first,second);
        }*/
    }

