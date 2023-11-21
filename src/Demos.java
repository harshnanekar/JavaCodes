import java.util.Scanner;

class As{
     As(){
        System.out.println("As construct");
    }
}
class Bs extends As{
  Bs(){
      System.out.println("Bs");
  }

}
public class Demos{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Bs b=new Bs();
       /* System.out.println("Enter the string");
        String s=sc.nextLine();
        int count=0;
        int c=0;
        String[] ss=s.split("");
        for(int i=0;i<ss.length;i++){
            if(" ".contains("" + ss[i])){
                count++;
            }

        }
        System.out.println(count);*/

       /* System.out.println("Enter the size");
        int num=sc.nextInt();
       int[] ar=new int[num];
        System.out.println("Enter the numbers in array");
       for(int i=0;i<ar.length;i++){
          ar[i]=sc.nextInt();
       }
        for(int i=ar.length-1;i>=0;i--){
            System.out.print(ar[i] + " ");
        }*/
      /*  System.out.println("Enter the String");
        String s=sc.next();
        String vowel="aeiou";
        String k="";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!k.contains(""+ch[i])) {
                if (vowel.contains("" + ch[i])) {
                    k = k + ch[i];
                    System.out.print(ch[i] + " ");

                }
            }
        }*/
       /* int[] a={5,3,15,12,1,45};
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        int min=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>min && a[i]!=max){
                min=a[i];
            }
        }
        System.out.println("Max " + max);
        System.out.println("SMax " + min);*/
    }



}

