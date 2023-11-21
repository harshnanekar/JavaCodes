import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Inverted triangle
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int k=n;k>i;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

      /*  System.out.println("Enter the String");
        String str= sc.next();
        char[] ch=str.toCharArray();
        String k="";
        int counter;
        for(int i=0;i<ch.length;i++){
            counter=1;
            if(!k.contains(""+ch[i])){
                for(int j=i+1;j< ch.length;j++){
                    if(ch[i]==ch[j]){
                        counter++;
                        k=k+ch[i];
                    }
                }
                System.out.println(ch[i] + "---->" + counter);
            }
        }*/
    }
}
