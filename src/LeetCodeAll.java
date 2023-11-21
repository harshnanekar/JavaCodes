import java.lang.reflect.Array;
import java.util.*;
import java.util.Stack;

public class LeetCodeAll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeetCodeAll l = new LeetCodeAll();

        //Find number from 2d matrix
    /*   int[][] matrix={{1,3,5,7},
                       {10,11,16,20},
                       {23,30,34,60}};*/
      /* int[][] matrix={{1}};
        System.out.println("Enter the target");
        int num=sc.nextInt();
        boolean val=false;


        for(int i=0;i<matrix.length;i++){
           // System.out.println(matrix[i].length);
            for(int j=0;j<matrix[i].length;j++){
                if(num==matrix[i][j]){
                    val=true;
                }
            }
            System.out.println("");
        }
       if(val==true){
           System.out.println(true);
       }else{
           System.out.println(false);
       }*/

        //Rotate Array
       /* Integer[] i={0,1,2,4,5,6,7};
        ArrayList<Integer> ar=new ArrayList<>();
        ar.addAll(Arrays.asList(i));
        System.out.println(ar);
        Collections.rotate(ar,4);
       // System.out.println(ar);
       int[] a = new int[ar.size()];
     for(int j=0;j<ar.size();j++){
         a[j]=ar.get(j);
     }
     int tr=-1;
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the target");
     int num=sc.nextInt();
      for(int k=0;k<a.length;k++){
          if(num==a[k]){
              tr=k;
          }
      }
        System.out.println(tr);*/

        //Sorted Colors
       /* int[] nums={2,0,2,1,1,0};
        int temp=0;
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));*/


        //Best Poker hand
       /* "Flush": Five cards of the same suit.
        "Three of a Kind": Three cards of the same rank.
        "Pair": Two cards of the same rank.
        "High Card": Any single card.
*/
     /*   int[] ranks={13,2,13,1,13,13};
        char[] suits={'a','b','a','a','a'};
        char ab=suits[0];
        int rcount=0;
        int count=1;

        ArrayList<Integer> ar=new ArrayList<>();
        outer: for(int i=0;i<ranks.length && i < suits.length;i++){
            if(ab==suits[i]){
                rcount++;
            }
            if(!ar.contains(ranks[i])) {
                for (int j = i + 1; j < ranks.length; j++) {
                    if (ranks[i] == ranks[j]) {
                        count++;
                        if(count==2 | count==3){
                            break outer;
                        }
                        ar.add(ranks[i]);
                    }
                }
            }
        }
        System.out.println(count);
        if(rcount==suits.length){
            System.out.println("Flush");
        } else if (count==3) {
            System.out.println("Three of a kind");
        }else if (count==2) {
            System.out.println("Pair");
        }else{
            System.out.println("High Card");
        }*/

        //Add Digits
    /*  int num=38;
    int k=l.create(num);
        System.out.println(k);
                }

    private int create( int num) {
        int so = 0;
        int temp=num;
        int total=0;
        while(temp>0){
            int q=temp%10;
            total=total+q;
            temp=temp/10;
        }
        if( total>=1 && total<10){
           return total;
        }
        num=total;
        return create(num);
    }
*/
        //Adding spaces in a string
  /*      String s="icodeinpython";
        char[] ch=s.toCharArray();
        int[] spaces={1,5,7,9};
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<spaces.length;i++){
            ar.add(spaces[i]);
        }
        int count=0;
        String norm="";
        String local="";
        for(int i=0;i<ar.size();i++) {
            String ss = "";
            for (int j = count; j < ch.length; j++) {
                if (j < ar.get(i)) {
                    ss = ss + ch[j];
                }
            }
            count = ar.get(i);
            ss = ss + " ";
            local = local + ss;
            System.out.print(ss);

        }
        for(int i=ar.get(ar.size()-1);i<ch.length;i++){
            norm=norm + ch[i];
        }
             local=local + norm;
        System.out.print( local);*/

        //Nim Game
       /* int num=5;
        int a=3;
        int b=3;
     int[] as={a,b};
        int count=1;
        int conum=0;
      ArrayList<String> ar=new ArrayList<>();
       boolean val=false;
        for(int i=0;i<as.length;i++){
            for(int j=count;j<=num;j++){
                if(j<=as[i]){
                    if(i==0){
                        ar.add("a");
                    }else{
                        ar.add("b");
                    }
                   conum=conum+count;
                }
            }
            num=num-conum;
        }
        System.out.println(ar);
         if(ar.get(ar.size()-1).equals("a")){
             System.out.println(true);
         }else{
             System.out.println(false);
         }*/

        //Merge Strings Alternately
      /*  String a="cffff";
        String b="ee";
        String attach="";
        int m=a.length()+b.length();
        int count=0;
        int sum=0;
       for(int i=0;i<m;i++){
          if(a.length()>count) {
              inner:
              for (int j = count; j < a.length(); j++) {
                  attach = attach + a.charAt(i);
                  break inner;
              }
          }
         count++;
          if(b.length()>sum) {
              strong:
              for (int k = sum; k < b.length(); k++) {
                  attach = attach + b.charAt(i);
                  break strong;
              }
          }
          sum++;
      }
        System.out.println(attach);*/

        //reverse Vowels
     /*   String s="leetcode";
        s="hello";
        char[] ch=s.toCharArray();
        int count=0;
        int sum=0;
        String norm="";
        String joint="";
        for(int i=0;i<ch.length;i++) {
            if(count<=0){
                for(int j=ch.length-1;j>=0;j--){
                    if("aeiou".contains(""+ch[j])) {
                        norm = norm + ch[j];
                    }
                }
            }
            count++;
            if("aeiou".contains("" + ch[i])){
            outer:    for(int k=sum;k<norm.length();k++){
                    ch[i]=norm.charAt(sum);
                    break outer;
                }
                sum++;
            }
       joint=joint + ch[i];
        }

        System.out.println(joint);*/

        //Reverse Words in a string
     /*   String s="the sky is   blue";
       char[] ch=s.toCharArray();
        String[] chz=s.split("");
        String norm="";
        int count=0;
        int sum=0;
        String attach="";

        for(int i=0;i<ch.length;i++){
            if(ch[i]!=' '){
           outer: for(int j=sum;j<chz.length;j++) {
               if (chz[j].contains("" + ch[i])) {
                   attach = attach + ch[i];
                   if (chz[j].equals(attach)) {
                       sum++;
                       break outer;

                   }
               }
           }
            }
        }
        System.out.println(attach);

        String h="hello world";
        String[] ss=h.split("");
        for(int i=0;i<ss.length;i++){
            if(ss[i].contains(" ")){
                count++;
            }
        }
        System.out.println(count);*/

        //Length of last word
       /*String s = "Hello World";
       String ss[]=s.split(" ");
       int m=ss[ss.length-1].length();
        System.out.println(ss[ss.length-1].length());*/

        //Plus One
    /*   int[] digits = {1,2,3};
       String che="";
       for(int i=0;i< digits.length;i++){
               che = che + String.valueOf(digits[i]);
           }

       int count=Integer.parseInt(che);
       count=count + 1;
       String ches=String.valueOf(count);
    String []ch=ches.split("");
      int[] ar=new int[ch.length];
       for(int i=0;i<ch.length;i++)
       {
          int j=Integer.parseInt(ch[i]);
           ar[i]=j;
       }
        System.out.println(Arrays.toString(ar));*/

        //Baseball Game
        /*An integer x.
                Record a new score of x.
        '+'.    Record a new score that is the sum of the previous two scores.
        'D'. Record a new score that is the double of the previous score.
        'C'. Invalidate the previous score, removing it from the record.*/
/*
       String[] ops = {"5","2","C","D","+"};
       ArrayList<Integer> ar=new ArrayList<>();
       for(int i=0;i<ops.length;i++){
           if(!"+DC".contains(ops[i])){
               ar.add(Integer.parseInt(ops[i]));
           }else if("C".equals(ops[i])){
               ar.remove(ar.size()-1);
           }else if ("D".equals(ops[i])) {
               int sum=Integer.parseInt(String.valueOf(ar.get(ar.size()-1))) ;
               sum=sum*2;
               ar.add(sum);
           }else if("+".equals(ops[i])){
               int sum=Integer.parseInt(String.valueOf(ar.get(ar.size()-1))) ;
               int count= Integer.parseInt(String.valueOf(ar.get(ar.size()-2)));
               int var=sum + count;
               ar.add(var);
           }
       }
       int total=0;
       for(int i=0;i<ar.size();i++){
           total=total + ar.get(i);
       }
        System.out.println(total);*/

        //Sort array by parity
      /*  int[] nums = {3,1,2,4};
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> ar=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                a.add(nums[i]);
            }else {
                ar.add(nums[i] );
            }
        }
        a.addAll(ar);
        int[] nm=new int[a.size()];
       for(int i=0;i<a.size();i++){
           nm[i]=a.get(i);
       }
        System.out.println(Arrays.toString(nm));*/

        //decode String
        String s="3[a]2[bc]";
       String[] ch=s.split("");
       String sf="";
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }

    }
    }

