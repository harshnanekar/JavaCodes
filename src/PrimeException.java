import java.util.Scanner;

public class PrimeException{
int prime=0;
    public void prime(int input) throws PrimeNotFound {

        for(int i=2;i<=input;i++){
            if(input%i==0){
                prime++;
                break;
            }
            if (prime == 0) {
                System.out.println("Prime");
            }else {
                throw new PrimeNotFound("not a prime");
            }

        }

        }


    public static void main(String[]args){
        PrimeException p=new PrimeException();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int input=sc.nextInt();

        try{
            p.prime(input);
        } catch (PrimeNotFound e) {
            e.printStackTrace();
            System.out.println("Prime Exception");
        }
    }

}
