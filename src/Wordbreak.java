import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wordbreak {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s= sc.next();
        String ks="";
        List<String> wordict=new ArrayList<>();
        wordict.add("apple");
        wordict.add("pens");
        wordict.add("orange");
        wordict.add("glass");
        wordict.add("banana");
        List<String> wordict1=new ArrayList<>();
        int count=0;

        for(int i=0;i<wordict.size();i++) {

               if(s.contains(wordict.get(i))){
                       ks=ks + wordict.get(i);
                       wordict1.add(wordict.get(i));
                      if(ks.equals(s)) {
                          count++;
                          System.out.println(wordict1);
                          break;
                      }

               }

        }
        if(count>0) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //reverse new
       /* System.out.println("Enter the number");
        int num=sc.nextInt();
        String s=String.valueOf(num);
        char[] ch=s.toCharArray();
        String name="";
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]!='0'){
                name=name + ch[i];
            }
        }
        String min="-";
        if(s.contains(""+'-')){
            min=min.concat(name);
            System.out.println(min);

        }else{

            System.out.println(name);
        }
*/
        System.out.println(Math.ceilDiv(7,-3));
    }
}
