import java.util.Scanner;

public interface Demoing {

    void m1(String user,String password);
}
class M1 implements  Demoing{


    @Override
    public void m1(String user, String password) {
        if(user.equals("harsh") && password.equals("harsh25")){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        M1 m=new M1();
        System.out.println("Enter the username");
        String user=scanner.next();
        System.out.println("Enter the password");
        String pass=scanner.next();
        m.m1(user,pass);
    }


}
