import java.util.ArrayList;
import java.util.Scanner;

public class RotateArray
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.next();
        char[] ch=s.toCharArray();
        String k="";
        for(int i=0;i<ch.length;i++){

            for(int j=i+1;j<ch.length;j++){
                if(!k.contains(""+ch[i])){
                    k=k+ch[i];
                }
            }
        }
        System.out.println("the length of longest substring is " + k.length());

    }
}
