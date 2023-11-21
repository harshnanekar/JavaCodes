import java.util.Scanner;

public class Example {
static int m1(){
    int balance=2000;
    return balance;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Example e=null;
        System.out.println(Example.m1());
    /*  String input="Alive is awesome";
        System.out.println("Enter the words");
      String user=sc.nextLine();

      char[] ch=input.toCharArray();
      for(int i=0;i<ch.length;i++){
          if(!user.contains(""+ch[i])){
              System.out.print(ch[i] + " ");
          }
      }*/

        //remove the target sum from array

       /* int sum=75;
        int ab=0,ba=0;
        int []a={2,43,65,10,12};
for(int i=0;i<a.length;i++){
    for(int j=i+1;j<a.length;j++){
        int total=a[i]+a[j];
        if(sum==total){
            ab=a[i];
            ba=a[j];
        }
    }
}*/

        // System.out.print("Numbers are " + ab + " and " + ba);
    }
}
