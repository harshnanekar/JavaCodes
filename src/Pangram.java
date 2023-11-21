import java.util.ArrayList;
import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Pangram
      /*  System.out.println("Enter the string");
        String name=sc.nextLine();
        name=name.toUpperCase();
        int count=0;
        for(int i=65;i<=90;i++){
            char ch= (char) i;
           if(name.contains("" + ch)){
               count++;
           }
        }
        if(count==26){
            System.out.println("It is a pangram");
        }else{
            System.out.println("It is not a pangram");
        }*/

//Maximum String
     /*   ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("Enter the string");
            String name=sc.next();
            a.add(name);
        }
        int max=0;
        String k="";
        for(int i=0;i<a.size();i++){
           int length=a.get(i).length();
           if(length>max){
               max=length;
               k=  a.get(i) ;
           }
        }
        System.out.println("The maximum string is " + k);*/

       /*int[]ar={10,33,21,12,22};
       int[]br={11,34,20,45,9};
       int count=0;
       for(int i=0;i<5;i++){
           if(ar[i]>br[i]) {
               if(Math.subtractExact(ar[i], br[i])==1) {
               count++;
               }
           }else{
               if(Math.subtractExact(br[i],ar[i])==1) {
                   count++;
               }
           }
       }
        System.out.println("Count is " + count );
*/
        int[] ar={0,0,4,5,6};
        int count=0;
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
            }
        }
    }
}
