import java.util.Enumeration;
import java.util.Iterator;

public class Vector {

    public static void main(String[] args) {

        java.util.Vector<String> vect=new java.util.Vector<>();
        vect.add("abc");
        vect.addElement("bcpc");
        vect.add("vdhd");
        java.util.Vector<String> vect1=new java.util.Vector<>();
        vect1.addElement("eueeu");
        vect1.add("djdg");
        vect.addAll(vect1);
        System.out.println(vect);
        System.out.println(vect.get(2));
        System.out.println(vect.elementAt(4));
        System.out.println(vect.firstElement());
        System.out.println(vect.lastElement());
        vect.set(3,"common");
        System.out.println(vect);
        System.out.println(vect.subList(1,3));
        Iterator<String> i=vect.listIterator(1);
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Enumeration");
        Enumeration<String> en= vect.elements();
       while(en.hasMoreElements())  {
           System.out.println(en.nextElement());
        }

    }
}
