
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
    String balance="";
  /*  private void valid(long phone,String name) throws InvalidPhoneNumber {
      if(phone>10000000000l){
          throw new InvalidPhoneNumber("Invalid phone  number");
      }else{
          System.out.println("Information is correct");
      }
    }
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test1 t = new Test1();
        int num=sc.nextInt();
       String ret= t.method(num);
       if(!ret.equals("")){
           System.out.println(ret);
       }
      /*  System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the phone number");
        long phone=sc.nextLong();
        try{
            t.valid(phone,name);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Wrong phone number");
        }
*/


    }

    private String method(int num) {
        if(num==1){
            balance="harsh";
        }else  if(num==2){
            balance="nanekar";
        }else{
            System.out.println("Invalid");
        }
        return balance ;
    }


}