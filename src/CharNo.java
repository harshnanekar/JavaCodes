import java.util.Scanner;

public class CharNo {

    public static void main(String[] args) {

     /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine().toLowerCase();
        char[] ch = s.toCharArray();
         String k=" ";
        for (int i = 0; i < ch.length; i++) {
              int counter=1;
              if(!k.contains(""+ch[i])){
                 for(int j=i+1;j<ch.length;j++) {
                    if(ch[i]==ch[j]){
                        counter++;
                        k=k+ch[i];
                    }
                 }
                  System.out.println(ch[i] + "<---" + counter);
              }
        }*/

      //Program to find duplicate words in a string
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine().toLowerCase();
        System.out.println("Duplicate words are");
        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.print(ch[i] + " ");

                }
            }
        }*/

//Program to check character is a vowel or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet ");
       char c = sc.next().charAt(0);
       switch(c){
       case 'a':
               System.out.println("It is a vowel");
               break;
           case 'e':
               System.out.println("It is a vowel");
               break;
           case 'i':
               System.out.println("It is a vowel");
               break;
           case 'o':
               System.out.println("It is a vowel");
               break;
           case 'u':
               System.out.println("It is a vowel");
               break;
           default:
               System.out.println("It is a consonant");
               break;


       }


    }

}