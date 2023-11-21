import java.util.Scanner;

public class Lowest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String name=sc.nextLine();
        String[] s1=name.split(" ");
        String lowest="";
        int min;

        for(int i=0;i< s1.length;i++){
            min=s1[0].length();
            if(s1[i].length() <= min){
               min=s1[i].length();
                lowest=s1[i];
            }
        }
        System.out.println("The lowest word in a string is " +  lowest);
    }
}
