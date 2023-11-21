import javax.xml.transform.stream.StreamSource;
import java.util.Arrays;
import java.util.Scanner;

public class Raja {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[][] a={{3,4,5},
                   {6,3,2},
                 {12,78,43}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
             a[i][j]=a[j][i];
            }
            System.out.println(" ");
        }

      for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print( a[i][j] + " ");
            }
            System.out.println(" ");
        }

       /* System.out.println("Enter array size");
        int n=sc.nextInt();
        int sum=0;
        int sum1=0;
        int [][] arr=new int[n][n];

        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i==j){
                    sum +=arr[i][j];
                }
            }
        }
        for(int i=0; i< arr.length; i++){
            for(int j= arr.length-1; j>=0; j--){
                if(i==j){
                    sum1 +=arr[i][j];
                }
            }
        }
        System.out.println(sum);
        System.out.println(sum1);*/
    }
}
