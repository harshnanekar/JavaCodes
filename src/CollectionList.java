import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionList {

    public static void main(String[] args) {
       /* LoopVowel l=new LoopVowel();
        List<LoopVowel> li=new ArrayList<LoopVowel>();
        l.setName("harshal");
        l.setAge(21);

        li.add(l);

        for(int i=0;i< li.size();i++){
            System.out.println(l.getName());
            System.out.println(l.getAge());
        }*/

        //Find Missing Letter
   /*  char[]ch={'p','q','r','s','t'};
     char[]a={'p','r','s','t'};
     String s=String.valueOf(a);
        System.out.println(s);
     char ar=0;
     for(int i=0;i<ch.length;i++){
         if(!s.contains("" + ch[i])){
             ar=ch[i];
         }
     }
        System.out.println(ar);
    }*/


    //Check first string contains letters from the second string
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String");
        String s=sc.next();

        System.out.println("Enter the second String");
        String s1=sc.next();
        int counter=0;
        char[]ch=s1.toCharArray();
        for(int i=0;i< ch.length;i++){
            if(s.contains(""+ch[i])){
                counter++;
            }
        }
        if(counter>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

}


