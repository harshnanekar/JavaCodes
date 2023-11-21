import java.util.Arrays;

public class Stringpractice {

    public static void main(String[] args) {

        //Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
     /* String s1="This is 1 Exercise";
        String s2="This is 1 Exercise" ;
        char[] ch=s1.toCharArray();
        char[] ch1=s2.toCharArray();
        int count=0;
        if(s1.length()==s2.length()){
            int n=ch.length;
            for(int i=0;i<n;i++){
                if(ch[i]!=ch1[i]){
                    count++;
                }
            }
            if (count>0){
                System.out.println("characters not same");
            }else{
                System.out.println("characters same");
            }
        }else{
            System.out.println("Length not same");
        }*/

//Java program that checks the letters of the second string are present in the first string. Return true otherwise false
       /* String str="Java";
        String s="jv";
        char[]ch=s.toCharArray();
        int count=0;
        for(int i=0;i< ch.length;i++){
            if(str.contains(""+ch[i])){
                count++;
            }
        }
        if(count>0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }*/

 //Java program that removes a specified word from a given text. Return the new string.
      /*  String str="This is python";
        String word="python";
        String[] ch=str.split(" ");
        for(int i=0;i<ch.length;i++){
            if(!word.equals(ch[i])){
                System.out.print(ch[i] + " ");
            }
        }*/

 //Java program that reverses all the words in a string that have odd lengths.
     /*   String text= "Create a Date object using the Calendar class";
        String[] ch=text.split(" ");

        for(int i=0;i<ch.length;i++){
            if(ch[i].length()%2!=0){
                char[] chars=ch[i].toCharArray();
                String rev="";
                for(int j= chars.length-1;j>=0;j--){
                    rev=rev+chars[j];

                }
                ch[i]=rev;
            }

            System.out.print(ch[i] + " ");
        }*/

//Java program to check whether there are two consecutive (following each other continuously.), identical letters in a given string.
 /* String str="javva";
  char[] ch=str.toCharArray();
  int count=0;
  for(int i=0;i< ch.length;i++){
      for(int j=i+1;j< ch.length;j++){
          if(ch[i]==ch[i+1]) {
              count++;
          }
      }
  }
if(count>0){
    System.out.println("true");
}else{
    System.out.println("false");
}
*/
        String s="harshal";
        char[] ch=s.toCharArray();
        String k="";
        int count;
        for(int i=0;i<ch.length;i++){
            count=1;
            if(!k.contains(""+ch[i])){
                for (int j=i+1;j< ch.length;j++){
                    if(ch[i]==ch[j]){
                        count++;
                        k=k+ch[i];
                    }
                }
                System.out.println(ch[i] + "--->" + count);
            }
        }
    }

}
