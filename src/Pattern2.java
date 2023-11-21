import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Pattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pattern2 p = new Pattern2();
        System.out.println("Enter the string");
        String name = sc.next();
        p.check(name);
        //132 pattern
        // int[] ar={2,3,1,4,4,1,3,2};
      /* int [] ar={1,2,3,4};
        int a = 0,b=0,c=0;
        int count=0;
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                for(int k=j+1;k<ar.length;k++){
                    if(ar[i]<ar[j] && ar[j] > ar[k]){
                        count++;

                    }
                }
            }
        }
        if(count>0){
            System.out.println("Its 132 pattern");
        }else{
            System.out.println(false + " Its not 132");
        }*/
       /* System.out.println("Enter the string");
        String name=sc.next();
        String[] s={"aei","apple","map","geoss","rips"};
        char[] ch=name.toCharArray();
        int count=0;
        String k="";
        int max=0;
        for(int i=0;i<s.length;i++){
            for(int j=0;j<ch.length;j++){
                if(s[i].contains(""+ch[j])){
                    System.out.println(s[i]);
                    count++;
                }

            }

            if(count>max){
                max=count;
                k=s[i];
            }
        }
        System.out.println(k);*/

        //Pattern
       /* System.out.println("Enter the number");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                    System.out.print(count++);
                    if(count>9) {
                        count = 0;
                    }

            }
            System.out.println(" ");
        }*/

        //checking double letters

     /*   char[] c=name.toCharArray();
        ArrayList<Character> ch=new ArrayList<Character>();

        for(Character chs:c){
            ch.add(chs);
        }
        ArrayList<Character> ch1=new ArrayList<Character>();
        ch1.add(ch.get(0));
     for(int i=0;i<ch.size();i++){

       if(i>0) {
          if (ch.get(i-1) !=ch.get(i) ) {
            ch1.add(ch.get(i));
            name=name+ch1.get(i);
        }
      }
       }*/
   /*  String fin="";
       for(Character chs:ch1){
           fin=fin + chs;
       }*/
        System.out.println();


    }

    private void check(String name) {
        String fin="";
        char[] c = name.toCharArray();
        ArrayList<Character> ch = new ArrayList<Character>();
        for (Character chs : c) {
            ch.add(chs);
        }
        ArrayList<Character> ch1 = new ArrayList<Character>();
        ArrayList<Character> ch5 = new ArrayList<Character>();

        String toget="";
        for (int i = 0; i < ch.size(); i++) {

            if (i > 0) {
                if (ch.get(i-1)!=ch.get(i)) {
                    ch5.add(ch.get(i));
                  if(ch5.contains(ch.get(i-1))){
                      ch5.add(i-1,null);
                  }
                   // toget=toget+ch.get(i);
                }
            }
        }
        System.out.println(ch5);
        System.out.println(toget);
        ch1.add(ch.get(0));
        ArrayList<Character> chnew = new ArrayList<Character>();
        chnew.add(ch.get(0));
        for (int i = 0; i < ch.size(); i++) {
            if(i>0) {
                if (!toget.contains("" + ch.get(i-1)) || !toget.contains(""+ch.get(i))){
                ch1.add(ch.get(i));
                }
            }

        }

        for(Character chs:chnew){
           fin=fin + chs;
        }
        System.out.println(fin);
    }
}

