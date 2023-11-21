import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    long accountnumber;
    String username;
    long call;
    String eid;
    String password;


    static {
        System.out.println("Welcome to the Indian Bank!!");
    }

    private void options(Scanner sc,Bank b) {
        System.out.println("1. Register " + " 2. Login ");
        System.out.println("3. Debit  " + " 4. Credit ");
        System.out.println("5. Check Balance ");
        System.out.println("Enter the option to select");
        int select = sc.nextInt();
        if (select == 1) {
            b.register(sc,b);
        } else if (select == 2) {
            b.login(sc,b);
        } else if (select == 3) {

        } else if (select == 4) {

        } else if (select == 5) {

        }else{
            System.out.println("Invalid");
        }
    }
    void register(Scanner sc,Bank b) {
        System.out.println("Enter the Full name");
        String name = sc.nextLine();
        sc.nextLine();
        username=name;

        System.out.println("Enter the Gender");
        String gender = sc.nextLine();

        System.out.println("Enter the phone number");
        long phone = sc.nextLong();
        if(phone<10000000000l) {
            call = phone;
        }else{
            System.out.println("Phone number should be of limited size retype the number");
            phone=sc.nextLong();
            call=phone;
        }
        System.out.println("Enter the Email-Id");
        String email = sc.nextLine();
        sc.nextLine();
      this.eid=email;

        System.out.println("Enter the Account Number");
        long accnum = sc.nextLong();
        accountnumber=accnum;

        System.out.println("Enter the password");
        String pass = sc.next();
      sc.nextLine();

        System.out.println("Confirm the password");
        String passcon = sc.next();


        if (pass.equals(passcon)) {
            System.out.println("Thank you! Registered Successfully ,Please Login for further services");
           this.password=passcon;
        } else {
            System.out.println("Wrong password! please confirm your password");
            passcon = sc.nextLine();
            sc.nextLine();
           this.password=passcon;
            System.out.println("Thank you! Registerd Successfully , Please Login for further services");
        }
        sc.nextLine();
     //  System.out.println();
options(sc,b);
    }



        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            Bank b=new Bank();
          b.options(sc,b);
        }




    void login(Scanner sc,Bank b) {
        System.out.println("Enter the Email-Id ");
       String opt=sc.next();
  //     sc.nextLine();
        System.out.println("Enter the password ");
        String passcheck=sc.next();
     //  sc.nextLine();
      b.checklogin(opt,passcheck,sc ,b);

      if(!opt.equals(eid) && passcheck.equals(password) ){
               System.out.println("Wrong Email-Id re-enter the EmailId");
               opt=sc.nextLine();
               sc.nextLine();
            //   checklogin(opt,passcheck,sc,b);
               options(sc,b);
           }else if(opt.equals(eid) && !passcheck.equals(password)) {
               System.out.println("Wrong  re-enter the EmailId");
               passcheck=sc.nextLine();
               sc.nextLine();
              // checklogin(opt,passcheck,sc,b);
               options(sc,b);
           }else{
            System.out.println("Invalid");
        }

       }


    private void checklogin(String opt, String passcheck,Scanner sc,Bank b) {

        if(opt.equals(eid) && passcheck.equals(password)){
            System.out.println("Login successfully");
            options(sc,b);
        } else if(!opt.equals(eid) && passcheck.equals(password)){
            System.out.println("Wrong Email-Id re-enter the EmailId");
            opt=sc.nextLine();
            sc.nextLine();
            checklogin(opt,passcheck,sc,b);
            options(sc,b);
        }else if(opt.equals(eid) && !passcheck.equals(password)) {
            System.out.println("Wrong  re-enter the EmailId");
            passcheck=sc.nextLine();
            sc.nextLine();
            checklogin(opt,passcheck,sc,b);
            options(sc,b);
        }else{
            System.out.println("Invalid input");
        }
    }

}
