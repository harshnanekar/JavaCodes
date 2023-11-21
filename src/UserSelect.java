import java.util.Scanner;

public class UserSelect {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Choice");
        System.out.println("1.Ascending");
        System.out.println("2.Descending");
        String ch=sc.next();
        System.out.println("Enter the array size");
        int num=sc.nextInt();
        int[] ar=new int[num];
        System.out.println("Enter the array inputs");
        for(int i=0;i<ar.length;i++){
            ar[i]= sc.nextInt();
        }
        int temp=0;
        if(ch.equalsIgnoreCase("ascending") ){
            for(int i=0;i< ar.length;i++){
                for(int j=i+1;j<ar.length;j++){
                    if(ar[i]>ar[j]){
                       temp=ar[i];
                       ar[i]=ar[j];
                       ar[j]=temp;
                    }
                }
            }
            for(int i=0;i<ar.length;i++){
                System.out.print(ar[i] + " ");
            }
        }else  if(ch.equalsIgnoreCase("descending")){
            for(int i=0;i< ar.length;i++){
                for(int j=i+1;j<ar.length;j++){
                    if(ar[i]<ar[j]){
                        temp=ar[i];
                        ar[i]=ar[j];
                        ar[j]=temp;
                    }
                }
            }
            for(int i=0;i<ar.length;i++){
                System.out.print(ar[i] + " ");
            }
        }else{
            System.out.println("Invalid");
        }

    }
}
