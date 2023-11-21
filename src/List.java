import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import static java.util.Collections.sort;

public class List {

    public static void main(String[] args) {
        java.util.List<Character> list=new ArrayList<Character>();
    list.add(0,'a');
    list.add(1,'b');
    list.add(2,'c');
    list.add('d');

        java.util.List<Character> list1=new ArrayList<Character>();

        list1.add('e');
        list.add('a');
        list1.add('f');
        list.add('g');
        System.out.println("Empty" +list1.isEmpty());
        list.addAll(list1);
        list.removeAll(list1);
        System.out.println(list);

        list1.clear();
        System.out.println(list1);

        list1.add(0,'a');
        list1.add(1,'b');
        list1.add(2,'c');
        list1.add('d');
        list.remove(5);
        list.remove(4);

        System.out.println(list);
        System.out.println(list1);

        System.out.println(list.equals(list1));
        System.out.println("Get " +list1.get(2));
        System.out.println("Contains "+list1.contains('b'));

        list.addAll(list1);
        System.out.println("Contains All "+list.containsAll(list1));

        java.util.List<Character> list2=new ArrayList<Character>();
        list2.add('m');
        list2.add('n');
        list2.add('o');
        list2.add('m');
        list2.add('p');
        list2.add('a');
        list2.add('b');
        System.out.println("Index "+ list2.indexOf('m'));
        System.out.println("Index "+ list2.lastIndexOf('m'));
        System.out.println("hashcode " + list2.hashCode());
        System.out.println("size of list "+ list2.size());

        list.retainAll(list2);
        System.out.println("retain " + list);
        System.out.println("Sublist " + list2.subList(2,6));
        list2.set(2,'z');
        list2.set(6,'y');
        System.out.println("Set " + list2);

        Collections.sort(list2);
        System.out.println("Sort " + list2);

        Iterator<Character> i=list2.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        ListIterator<Character> li=list.listIterator();
        System.out.println("Sortasfas " + list);
        while(li.hasNext()){
           li.next();

        }


        Object[] mn=list.toArray();
       for (int j=0;j<mn.length;j++){
           System.out.print(mn[j] + " ");
       }

       Integer[] l={2,3,4,5};
 java.util.List<Integer> lk=new ArrayList<Integer>();
 lk.addAll(java.util.List.of(l));
        System.out.println(lk);;



    }


}
