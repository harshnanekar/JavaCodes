import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //To remove duplicate characters
       /* System.out.println("Enter the string");
        String text= sc.next();
String k="";

        char []ch=text.toCharArray();
for(int i=0;i<ch.length;i++){

    if(!k.contains(""+ch[i])){
        for (int j=i+1;j<ch.length;j++){

            if(ch[i]==ch[j]){
                k=k+ch[i];
            }
        }
        System.out.print(ch[i]);
    }
}
*/

        //Pyramid program
        System.out.println("Enter the number to print length of pyramid");
        int num=sc.nextInt();
        int k=5;
        for(int i=1;i<=num;i++) {
            for (int j = 1; j <= i; j++) {
               if(j>i){
                   System.out.print(" ");
               }else{
                   System.out.print(k);
               }

            }
            --k;
            System.out.println(" ");
        }

    }
}
