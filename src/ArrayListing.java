import java.util.*;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListing {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(0,1);
        a.add(1,2);
        a.add(2,3);
        a.add(4);
        a.add(5);

        System.out.println("Array List is " + a);

        ArrayList<Integer> array=new ArrayList<Integer>();
           array.add(6);
           array.add(7);
           array.add(8);

           a.addAll(array);
        System.out.println("Adding two arraylists " + a);

        System.out.println("Getting through index " + a.get(2));
        a.clear();
        System.out.println("Is empty or not " + a.isEmpty());

        a.add(4);
        a.add(10);
        a.add(90);
        a.add(25);
        a.add(12);

        System.out.println("Is empty or not " + a.isEmpty());
        System.out.println("After clearing re-adding " + a);
        Collections.sort(a);
        System.out.println("After sorting " + a);
        System.out.println("Contains " + a.contains(50));
        System.out.println("Contains all " + a.containsAll(array));
        a.addAll(array);
        System.out.println("Contains all " + a.containsAll(array));
a.remove(3);
System.out.println("After removing " + a);
a.removeAll(array);
        System.out.println("After removeall " + a);

        ArrayList<Integer> a2=new ArrayList<Integer>();
        a2.add(4);
        a2.add(10);
        a2.add(12);
        a2.add(90);

        System.out.println("Arraylist 2 " + a2);
        System.out.println("Equals or not " + a.equals(a2));

        a2.add(49);
        a2.add(10);
        a2.add(55);
        a2.add(13);

        System.out.println(a);
        System.out.println(a2);

        a.retainAll(a2);
        System.out.println("RetainAll " + a);
        System.out.println("SubArrayList " + a2.subList(2,6));
        System.out.println("indexof " + a2.indexOf(10));
        System.out.println("Lastindexof " + a2.lastIndexOf(10));
        System.out.println("Size of ArrayList " + a2.size());
        System.out.println("hashcode odf Arraylist " + a2.hashCode());
        a2.set(5,98);
        System.out.println("After seting "+ a2);

     /*   Iterator<Integer> i=a2.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }*/
        ListIterator<Integer> j=a2.listIterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }
        while(j.hasPrevious()){
            System.out.println(j.previous());
        }

        Object[] m=a2.toArray();
        for(int k=0;k<m.length;k++){
            System.out.print(m[k] + " ");
            System.out.println(" ");
        }
  ArrayList arr1=(ArrayList) a.clone();
        System.out.println(arr1);

        ArrayList<Character> chars=new ArrayList<Character>(6);
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.trimToSize();
        System.out.println(chars.size());
        chars.ensureCapacity(500);

        chars.removeIf(n->n%2==0);
        System.out.println(chars);

        for (char ch:chars) {
            System.out.println(ch);
        }
        for (int i=0;i<chars.size();i++){
            System.out.println(chars.get(i));
        }

        //Program to remove duplicate records

         /* Integer[] a = {2, 4, 1, 4, 5, 3, 2, 2};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.addAll(List.of(a));
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for (int i:arr){
            if(!arr1.contains(i)){
                arr1.add(i);
            }
        }
        System.out.println(arr1);*/
    }
}
