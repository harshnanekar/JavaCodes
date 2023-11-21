import java.util.*;
import java.util.List;
import java.util.Set;


public class Sphenic {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String rev="";
        ArrayList<String> array=new ArrayList<String>();
        ArrayList<String> array1=new ArrayList<String>();
       array.add("blue");
       array.add("red");
       array.add("green");
       array.add("yellow");

       //Reverse a arraylist
     /*  for(int i=array.size()-1;i>=0;i--){
         array1.add(array.get(i));
       }
        for(String j:array1){
            System.out.println(j);

        }*/
String temp="";
int index,index1=0;
String input="";

       //Swap two elements
        System.out.println("Enter the indexes to swap");
        int n1=sc.nextInt();
        System.out.println("Enter the second");
        int n2=sc.nextInt();
        temp=array.get(n1);
        index=array.indexOf(temp);


        System.out.println(array);
        input= array.get(n2);
        index1=array.indexOf(input);

        array.set(index1,temp);
        array.set(index,input);
        System.out.println(array);








    }


}


