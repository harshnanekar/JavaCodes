import java.util.Scanner;

public class Anagram {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String name=sc.next();
        if("apple".contains(name)){
            System.out.println("true");
        }
       /* System.out.println("Code for Anagram:- ");
        String frist=sc.nextLine();
        System.out.println("Code for Anagram:- ");
        String second=sc.nextLine();
        int count=0;
        if(frist.length()==second.length()){
            char[]ch=frist.toCharArray();
            for(int i=0;i<ch.length;i++){
                if(!second.contains(""+ch[i])){
                    count++;
                }
            }
            if(count==0){
                System.out.println("Anagram");
            }else{
                System.out.println(" not Anagram");
            }
        }
*/
       /* System.out.println("Enter the first string");
        String a=sc.next();
        System.out.println("Enter the second string");
        String b=sc.next();

        char[] ch=a.toCharArray();

if(a.length()==b.length()) {
    int counter=0;
    for (int i = 0; i < ch.length; i++) {
        if (!b.contains("" + ch[i])) {
            counter++;
        }


    }
    if (counter > 0) {
        System.out.println("It is not a anagram ");
    } else {
        System.out.println("It is a anagram");
    }
}else {
    System.out.println("Length not same");
}*/

        //If vowel replace it with "*"
/*
        String s1="Hello";
        String s2="aeiou";

        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(s2.contains(""+ ch[i])){
               ch[i]='*';
            }
            System.out.print(ch[i]);
        }
*/

/*        //Multiplication Table
Scanner sc=new Scanner(System.in);
        System.out.println("Enter to find which multiplication table");
int n=sc.nextInt();
int result=0;

for(int i=1;i<=10;i++){
    result=n*i;
    System.out.println(n+ " x " + i +"= " + result);
}*/
    }
}
