import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      /*  String str="Harshal Naresh Nanekar";
        String str1="";
        String[] ch=str.split(" ");
        for(int i=0;i< ch.length;i++){
            str1=str1+ch[i].charAt(0);
        }
        System.out.print(str1);*/


        //Longest substring with distinct characters
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String k="";
        char[] ch=str.toCharArray();
        int counter=0;
        for(int i=0;i< ch.length;i++){
            if(!k.contains(""+ch[i])){
                counter++;
                k=k + ch[i];
            }
        }
        System.out.println("The longest substring is " + counter + " and substring is " + k);


    }

}
