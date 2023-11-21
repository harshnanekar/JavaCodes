import java.lang.reflect.Array;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    int a[]={1,2,3,4,5,6,7};

    int temp=0;

        System.out.println("Enter the first number");
        int ab= sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();

            for(int k=ab;k<b;k++){
                        temp=a[k];
                        a[k]=a[b];
                        a[k]=temp;
                    }

            //reverse array
            /*
int [] arr={2,3,5,7,9,3,1};
int rev=0;

for(int i= 0;i< arr.length;i++){
    for (int j=i+1;j< arr.length;j++){
        rev=arr[i];
        arr[i]=arr[j];
        arr[j]=rev;

    }

}
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
*/
                }
            }




