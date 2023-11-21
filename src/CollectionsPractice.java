import java.lang.reflect.Array;
import java.util.*;
import java.util.List;
import java.util.Set;

public class CollectionsPractice {

    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<Integer>();
        System.out.println("IsEmpty " + l1.isEmpty());
        l1.add(0,4);
        l1.add(1,3);
        l1.add(5);
        l1.add(2);
        System.out.println("IsEmpty " + l1.isEmpty());
       LinkedList<Integer> l2=new LinkedList<Integer>();
        l2.add(4);
        l2.add(3);
        l2.add(52);
        l2.add(21);
       l1 .retainAll(l2);
        System.out.println("Retainall " + l1);
        System.out.println("containsAll " + l1.containsAll(l2));
        l1.addAll(l2);
        System.out.println("containsAll " + l1.containsAll(l2));
        System.out.println(l1);
        System.out.println("Get element " + l1.get(1));
        System.out.println("Set element " + l1.set(1,13));
        System.out.println(l1);
        System.out.println("Contains " + l2.contains(27));
        System.out.println("Hashcode " + l1.hashCode());
        System.out.println("size " + l1.size());
        System.out.println("Sublist " + l1.subList(2,6));
        l1.add(3,13);
        System.out.println(l1);
        System.out.println("Indexof " + l1.indexOf(13));
        System.out.println("LastIndexof " + l1.lastIndexOf(13));
        System.out.println("Remove usiing index " + l1.remove(2));
        System.out.println(l1);


        ListIterator<Integer> j=l1.listIterator();
        while (j.hasNext()){
            System.out.println(j.next());
        }
        while (j.hasPrevious()){
            System.out.println(j.previous());
        }
      LinkedList<Integer> l3=new LinkedList<Integer>();
        l3.add(0,4);
        l3.add(1,3);
        l3.add(5);
        l3.add(2);
        l3.add(4);
        l3.add(3);
        l3.add(52);
        l3.add(21);
        System.out.println(l1);
        l3.set(2,13);
        l3.set(1,13);
        System.out.println(l3);
        System.out.println("Equals or not " + l1.equals(l3));
        l1.removeAll(l2);
        System.out.println(l1);
        Object[] a=l1.toArray();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        l1.add(3);
        l1.add(23);
        l1.add(34);
        l1.add(23);
        System.out.println(l1);
        l1.removeIf(n->n%2!=0);
        System.out.println(l1);

        l1.add(12);
        l1.add(54);
        l1.add(90);
        l1.add(23);
        l1.add(34);
     Collections.sort(l1);
        System.out.println(l1);

       // ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("Linked list is" + l1);
        l1.addFirst(25);
        l1.addLast(31);
        System.out.println(l1);
        System.out.println("get first " + l1.getFirst()  + " get last " + l1.getLast());
       l1.offer(2531);
       l1.offerFirst(3);
       l1.offerLast(5);
        System.out.println(l1);
        System.out.println("peek " + l1.peek() + " peekfirst " + l1.peekFirst() + " peeklast " + l1.peekLast());
        System.out.println("poll " + l1.poll() + " pollfirst " + l1.pollFirst() + " polllast " + l1.pollLast());
     l1.push(23);
     l1.pop();
        System.out.println(l1);
        System.out.println("remove " + l1.remove() );
        System.out.println("remove first" + l1.removeFirst() );
        System.out.println("remove " + l1.removeFirstOccurrence(34) );
        System.out.println("remove last" + l1.removeLast() );
        System.out.println("remove " + l1.removeLastOccurrence(31) );
    }

}
