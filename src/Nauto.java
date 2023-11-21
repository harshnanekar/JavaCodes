import java.util.Scanner;

public class Nauto {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=num*num;
        String s=String.valueOf(sum);
        String ss=String.valueOf(num);
        int count=1;
        char[] ch=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            for(int j=1;j<=ss.length();j++){
                if(ss.contains(""+ch[i])){
                    System.out.println(ch[i]);
                    count++;
                }
            }
        }
        if(count==ss.length()){
            System.out.println("Automorphic No.");
        }else{
            System.out.println("Not an automorphic");
        }
    }
}
