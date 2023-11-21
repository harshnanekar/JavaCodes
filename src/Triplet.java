import java.util.Scanner;

public class Triplet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter the String");
        String str=sc.next();
        char[] ch=str.toCharArray();
        String k="";

        for(int i=0;i< ch.length;i++){
            int counter=0;
            if(!k.contains(""+ch[i])){
                for(int j=i+1;j< ch.length;j++){
                    if(ch[i]==ch[j]){
                        counter++;
                        k=k+ch[i];
                    }
                }
                if(counter==0){
                    System.out.print(ch[i] + " ");
                }
            }
        }*/

        //prime
      /*  System.out.println("Enter the first Number");
        int n1=sc.nextInt();
        System.out.println("Enter the second number");
        int n2=sc.nextInt();
        System.out.println("prime number between " + n1 + " and " + n2 + "  are :- ");
        for(int i=n1;i<=n2;i++){
            int prime=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    prime++;
                    break;
                }
            }
            if(prime==0){
                System.out.println(i);
            }
        }
*/
        //Sentence
       /* System.out.println("Enter the sentence ");
        String str=sc.nextLine();
        String rev="";
        String[] s=str.split(" ");
        for(int i=s.length-1;i>=0;i--){
            rev=rev + s[i] + " ";
        }
        System.out.print(rev);
        */


    }
}
