import java.util.Scanner;

public class Percentage {

    public static  void main(String[]args){
Scanner sc=new Scanner(System.in);

        double percent=0;
        int total=0;

        System.out.println("Enter the marks out of 100");
        System.out.println("1.English");
        int eng=sc.nextInt();
        System.out.println("2.Maths");
        int math=sc.nextInt();
        System.out.println("3.Science");
        int sci=sc.nextInt();
        System.out.println("4.History");
        int his=sc.nextInt();
        System.out.println("5.Geography");
        int geo=sc.nextInt();
        System.out.println("6.Marathi ");
        int mar=sc.nextInt();
        System.out.println("7.Hindi");
        int hin=sc.nextInt();

        int sum=eng+sci+math+hin+his+geo+mar;
        total=7*100;
    percent=(sum*100)/total;
        System.out.println(percent);

       if( (percent>=35 && percent<50) ){
           System.out.println("C grade");
       }else  if(percent>=50 && percent <75){
           System.out.println("B grade");
       }else  if(percent>=75 && percent <100){
           System.out.println("A grade");
       }else {
           System.out.println("Fail");
       }
    }
}
