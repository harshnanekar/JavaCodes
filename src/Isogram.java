import java.util.Scanner;

public class Isogram {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int counter=0;
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    counter++;
                }
            }
        }
        if(counter>0){
            System.out.println("It is not isogram");
        }else{
            System.out.println("It is a isogram");
        }
    }

}
