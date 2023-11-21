import java.util.Scanner;

public class Profile {

    public Profile(String email) throws EmailException{
        if(!email.contains(""+'@')){
            throw new EmailException("Invalid email id");
        }else{
            System.out.println("Valid email-id");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email id");
        String email=sc.next();
        try {
            Profile p = new Profile(email);
        }catch(EmailException e){
            e.printStackTrace();
        }
    }
}
