import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
    String name=sc.nextLine();
    String[] s1=name.split(" ");
    int max=0;
    String largest="";

    for(int i=0;i< s1.length;i++){
        if(s1[i].length() > max){
            max=s1[i].length();
            largest=s1[i];
        }
    }
        System.out.println("The largest word in a string is " +  largest);

    }
}
