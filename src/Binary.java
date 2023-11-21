import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        List<Integer> li=new ArrayList<Integer>();
 li.add(3);
        li.add(3);
        li.add(5);
        li.add(0);
        li.add(3);
        li.add(2);
        li.add(31);
        int[] a=new int[li.size()];
        for(int i=0;i<li.size();i++){
            if(i<li.size()-3){
                System.out.println(li.get(i));
            }
        }
       /* for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/
        /*System.out.println(java.time.LocalDate.now());
        Scanner sc = new Scanner(System.in);
        int[] a = {0, 0, 0, 1, 1, 1};*/

       /* int m=1;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                if(a[i]%2!=0){
                    a[i]=0;
                }
            }else{
                if(a[i]%2!=1){
                    a[i]=1;
                }
            }
            System.out.print(a[i] + " ");
        }*/


        //Using Arraylist
    /*    ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i:a){
            arr.add(i);
        }
        for(int i=0;i<arr.size();i++){
            if(i%2==0){
                if(arr.get(i)%2!=0){
                    arr.set(i,0);
                }
            }else{
                if(arr.get(i)%2!=1){
                    arr.set(i,1);
                }
            }
            System.out.print
                    (arr.get(i) + " ");
        }*/
    }
}
