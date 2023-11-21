import java.util.*;
import java.util.List;

public class Set {

    public static void main(String[] args){

        java.util.Set<Character> chars=new HashSet<Character>();
        chars.add('a');
        chars.add('g');
        chars.add('p');
        chars.add('s');
        System.out.println(chars.size());

        Character[] ch={'e','m','i'};
        java.util.Set<Character> set=new HashSet<Character>();
        set.addAll(List.of(ch));

        chars.addAll(set);
        System.out.println(chars);

        System.out.println(chars.remove('s'));
        System.out.println(chars);

        set.clear();
        System.out.println(set);

        set.add('r');
        set.add('h');
        set.add('y');

        chars.addAll(set);
        System.out.println(chars);
        System.out.println(chars.containsAll(set));
        chars.removeAll(set);
        System.out.println(chars);

        System.out.println(chars.contains('h'));
        System.out.println(chars.containsAll(set));

        System.out.println(set.isEmpty());

        System.out.println(chars.size());
        System.out.println(set.hashCode());

        chars.removeAll(set);
        System.out.println(chars);

        Character[] m={'p','g','l','q'};
        set.addAll(List.of(m));
        System.out.println(set);
        chars.retainAll(set);
        System.out.println(chars);

        Iterator<Character> i=chars.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        Object[] p=set.toArray();
        for (int r=0;r<p.length;r++){
            System.out.println(p[r]);
        }

        Object[] b=chars.toArray();
        for(int u=0;u<b.length;u++){
            System.out.print(b[u]);
        }
    }
}
