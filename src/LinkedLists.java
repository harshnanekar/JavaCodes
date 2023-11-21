import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedLists {


    public static void main(String[] args) {

        List<Integer> li=new ArrayList<Integer>();
        List<Integer> li1=new ArrayList<Integer>();
        int x=3;
        int y=x++;
        int z=++x;
        int result=x+y+z;
        System.out.println(result);
     /*   List<Integer> li2=new ArrayList<Integer>();

        li.add(3);
        li.add(2);
        li.add(21);
        li.add(12);
        li.add(23);
        li.add(32);

       *//* Collections.sort(li);
        System.out.println("Min and max are " + li.get(0) + " and " + li.get(li.size()-1));*//*

        if(li.size()%2==0){
            for(int i=0;i<li.size()/2;i++){
                li1.add(li.get(i));
            }
            for(int i=li.size()/2;i<li.size();i++){
                li2.add(li.get(i));
            }
            System.out.println(li1);
            System.out.println(li2);
        }else{
            System.out.println("Size is not valid for halfing");
        }*/
    }
}
