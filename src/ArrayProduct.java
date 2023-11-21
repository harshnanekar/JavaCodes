import java.util.*;
import java.util.List;

class Arraying{

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class ArrayProduct {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      Arraying a=new Arraying();
      a.setId(1);
      a.setName("harshal");

      List<Arraying> li=new ArrayList<Arraying>() ;
      li.add(a);
      for(Arraying ar:li){
          System.out.println(ar.getId());
          System.out.println(ar.getName());
      }

     /* int product=0;
      int max=0;
      int total=0;
      int sum=0;
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                product=a[i]*a[j];
                if(product>max){
                    max=product;
                    total=a[i];
                    sum=a[j];
                }
            }
        }
        System.out.println("The highest product is " + max + " and " + " the numbers are " + total + "and " + sum);
*/
    }
}
