import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<Integer>();

        list.add(3);
        list.add(4);
        list.add(5);
        list.addFirst(1);
        list.addLast(6);

        System.out.println("Elements " + list);
        System.out.println("Get first " + list.getFirst());
        System.out.println("Get last " + list.getLast());

        list.offer(7);
        list.offerFirst(2);
        list.offerLast(8);
        System.out.println(list);

        System.out.println("Peek "+ list.peek());
        System.out.println("Peek first "+ list.peekFirst());
        System.out.println("Peek last "+ list.peekLast());

        System.out.println("Poll "+ list.poll());
        System.out.println("Poll first "+ list.pollFirst());
        System.out.println("Poll last "+ list.pollLast());
        System.out.println(list);

        list.add(12);
        list.add(5);
        list.add(6);

        System.out.println("Pop " + list.pop());
        list.push(1);
        System.out.println(list);

        System.out.println("Remove " + list.remove());
        System.out.println("Remove " + list.remove(4));
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirstOccurrence(5));
        System.out.println(list.removeLastOccurrence(6));
        System.out.println(list.removeLast());
    }

}
