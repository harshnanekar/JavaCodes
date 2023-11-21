import java.util.Scanner;

public class Captcha {

   private void valid(String capt) throws CaptchaException {
        if(!capt.equals("Td4eVa")){
            throw new CaptchaException("Invalid captcha");
        }else {
            System.out.println("valid captcha");
        }
    }

    public static void main(String[] args) {
        Captcha c=new Captcha();
        Scanner sc=new Scanner(System.in);
        System.out.println("Type the mentioned captcha: Td4eVa");
        System.out.println("Enter the captcha");
        String capt= sc.next();
        try {
            c.valid(capt);
        }catch (CaptchaException e){
            e.printStackTrace();
            System.out.println("Captcha Exception found");
        }

    }


}