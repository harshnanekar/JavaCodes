import java.util.Scanner;

public interface Test2 {
    void register(Scanner sc);
    void login(Scanner sc);

}
class Valid implements Test2{
String password,email;

    public void register(Scanner sc) {
        System.out.println("Enter the First name");
        String name=sc.next();
        System.out.println("Enter the Last name");
        String name1=sc.next();
        System.out.println("Enter the email id");
        String email=sc.next();
        this.email=email;
        System.out.println("Enter the password");
        String pass=sc.next();
        this.password=pass;
        String s3=name.concat(name1);
        System.out.println("Welcome " + s3 + " Registered successfully ");
    }

    public void login(Scanner sc) {
        System.out.println("Enter the emailid");
        String mail=sc.next();
        System.out.println("Enter the password");
        String check=sc.next();
        if(mail.equals(email) && check.equals(password)){
            System.out.println("Login Successfully");
        }else{
            System.out.println("Login Failed!");
        }
    }
}
class Foo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Valid v=new Valid();
      v.register(sc);
      v.login(sc);

    }
}