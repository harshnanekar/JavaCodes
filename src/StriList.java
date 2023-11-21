import java.util.Scanner;

public class StriList {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s2=sc.nextLine();
        System.out.println("Enter the word");
        String s1=sc.next();

       char[]ch=s1.toCharArray();
       String[] chs=s2.split(" ");


       for(int i=0;i<chs.length;i++){
           int count=0;
           for(int j=0;j<ch.length;j++){
               if(chs[i].contains(""+ch[j])){
                   count++;

               }
               System.out.println(count);
           }
           if(count>s1.length()-1){
               System.out.println(chs[i]);
           }
       }
    }
}
