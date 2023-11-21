import java.util.Scanner;

public class ArrowStar {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=9;
        for(int i=1;i<=n;i++){
            if(i<=n/2 + 1){
                for(int j=n-4;j>=1;j--){
                    if(j==i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                for(int j=n-3;j>=2;j--){
                    if(j>2) {
                        if (j == i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                }


            }else{


            }

            System.out.println(" ");
        }
    }
}
