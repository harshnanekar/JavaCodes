import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Auto {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        //Tech number
       /* int num = 2025;
        int digits = 0;
        int temp = num;
        int first = 0;
        int second = 0;
        int square = 0;*/

     /*  while(temp>0){
           digits++;
           temp/=10;
       }
       if(digits%2==0){
           temp=num;
           first=num/(int) Math.pow(10,digits/2);
           second=num%(int) Math.pow(10,digits/2);
           square=(first+second)*(first+second);
           if(square==num){
               System.out.println("tech no.");
           }else {
               System.out.println("not a tech no.");
           }
       }*/
/*

//Automorphic number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
       int num=sc.nextInt();
       int c;
       int d;
       c=num*num;
       d=c%100;
       if(d==num){
           System.out.println("Automorphic number");
       }else {
           System.out.println("Not Automorphic number");
       }
*/

        //Program to calculate median

       /* double[] mean={2,6,7,4,9};
        int n=5;
        double temp=0;
        double total=0;
       double sum=0;
        for(int i=0;i< mean.length;i++){
            sum=sum+i;
        }
       total=sum/(double)n;
        System.out.println("Mean of given dataset is "+ total);*/

       /* Integer[] a = {2, 5, 88, 29, 16, 3, 27, 58, 53, 71, 68};
       ArrayList<Integer> ar=new ArrayList<>();
       ar.addAll(Arrays.asList(a));
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> ars=new ArrayList<>();
        for(int i=0;i<ar.size();i++){
            if(ar.get(i)%2==0){
              arr.add(ar.get(i));
            }else{
              ars.add(ar.get(i));
            }
        }
        Collections.sort(arr);
        Collections.sort(ars);
        System.out.println(arr);
        System.out.println(ars);*/

       /* System.out.println("Enter the string");
        String vow=sc.next();

        String k="";
int c=0;
        char[] ch=vow.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count=1;
if(!k.contains(""+ch[i])){
    if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i'  || ch[i]=='o'  || ch[i]=='u'){
        c++;
        for(int j=i+1;j<ch.length;j++) {
            if(ch[i]==ch[j]) {
                count++;
                k = k + ch[i];
            }
        }
        System.out.println(ch[i] + " --> " + count);
    }

}
        }
        System.out.println("The number of vowels present are " + c);*/

        //Array divisible by 3,5,2
        System.out.println("Enter the length");
        int num=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter the value");
        for(int i=0;i<num;i++){
           arr.add(sc.nextInt());
        }

ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> arr3=new ArrayList<>();
        ArrayList<Integer> arr4=new ArrayList<>();
        ArrayList<Integer> arr5=new ArrayList<>();
        ArrayList<Integer> arr6=new ArrayList<>();
        ArrayList<Integer> arr7=new ArrayList<>();
        ArrayList<Integer> arr8=new ArrayList<>();

      /*  for(int i=0;i<arr.size();i++){
            if(arr[i]%2==0 && arr[i]%3==0 && arr[i]%5==0){
                arr1.add(arr[i]);
            }else if(arr[i]%2==0 && arr[i]%3==0){
                arr2.add(arr[i]);
            }else if(arr[i]%3==0 && arr[i]%5==0){
            arr3.add(arr[i]);
        }else if(arr[i]%2==0 && arr[i]%5==0){
            arr4.add(arr[i]);
        }else if(arr[i]%2==0){
                arr6.add(arr[i]);
            }else if( arr[i]%3==0){
                arr7.add(arr[i]);
            }else if( arr[i]%5==0){
                arr8.add(arr[i]);
            }
            else {
                arr5.add(arr[i]);
            }
        }
        System.out.println("Elements of array " + array);
        System.out.println("Divisible of 2,3,5 " + arr1);
        System.out.println("Divisible of 2,3 " + arr2);
        System.out.println("Divisible of 3,5 " + arr3);
        System.out.println("Divisible of 2,5 " + arr4);
        System.out.println("Divisible of 2 " + arr6);
        System.out.println("Divisible of 3 " + arr7);
        System.out.println("Divisible of 5 " + arr8);
        System.out.println("Not divisible by any number " + arr5);*/
    }
}
