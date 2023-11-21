import java.util.Scanner;

public class Neon {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       /* System.out.println("Enter the number");
        int n=sc.nextInt();
       int square=0;
       square=n*n;
       int total=0;

       while(square>0){
           int q=square%10;
           total=total+q;
           square=square/10;
       }
        if(total==n){
            System.out.println("It is a neon number");
        }else{
            System.out.println("It is not a neon number");
        }*/

        //Counting the frequency of two characters in a string

        System.out.println("Enter the first String ");
        String s1=sc.nextLine();
        System.out.println("Enter the second String ");
        String s2=sc.nextLine();
        char[] ch=s1.toCharArray();
        char[] ch1=s2.toCharArray();


        if(s1.length()==s2.length()){
            for(int i=0;i< ch.length;i++){
                int counter=1;
                for(int j=0;j< ch1.length;j++) {
                    if (ch[i]==ch1[j]) {
                        counter++;
                    }
                }
                System.out.println(ch[i] + " ----> " + counter);
            }

        }else {
            System.out.println("Length not same");
        }


    }
}
