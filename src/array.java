import java.util.Scanner;

public class array {
    public static void main(String[] args) {


       int[] a = {2, 4, 1, 6, 7};
      int max = 0;

      /*  for(int i=1;i<arr.length;i=i+2){
            System.out.println(arr[i]);
        }*/

        //Ascending
/*int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        for(int i=0;i<arr.length;i++) {
            if (i == 1) {
                System.out.print(arr[i]);
            }
        }*/



//        //For removing highest no.
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("The max number in array is " + max);



        //For removing lowest no.
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array numbers");
          int n=sc.nextInt();
          int []arr=new int[n];
          for (int i=0;i<arr.length;i++){
              arr[i]=sc.nextInt();

          }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        int min=arr[0];
for(int i=0;i<arr.length;i++){
    if(arr[i]<=min){
        min=arr[i];
    }
}
        System.out.println("The lowest value in array is " + min);
    }
}