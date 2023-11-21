import java.util.Scanner;


class Test{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
     int n=sc.nextInt();

     //Number divisible  by  5 and getting factors last value 5
   /*  for(int i=1;i<=n;i++){
         if(i%5==0){
             if(i%10==5){
                 System.out.println(i);
             }

         }
     }*/

        //Spy number
int temp=n;
int total=1;
int sum=0;

        while (temp > 0) {
            int q = temp % 10;
            total = total * q;
            temp = temp / 10;
        }

        temp=n;
        while(temp>0){
        int p=temp%10;
        sum=sum+p;
        temp=temp/10;
        }

        if(total==sum){
            System.out.println("It is a Spy no.");
        }else{
            System.out.println("It is not a Spy no.");
        }


}


    public void valid(String s1, String email, String pass) {
    }
}







