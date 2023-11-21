public class Pyramid2 {

    public static void main(String[] args) {
     int n=4;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=6;j++){
//             System.out.print("*");
//         }
//         System.out.println(" ");
//     }

        //Hollow pyramid
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(i==1 || i==n) {
                    System.out.print("*");
                }else {
                    if (i >= 2 && i < n) {
                        if (j == 1 || j == 6) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                }
            System.out.println(" ");
            }
*/

        //Rhombus Triangle

        for(int i=1;i<=n;i++){
            for(int j=1;j<=4;j++){
                if(j>=i){
                    if(i==1 || i==2 || i==3 || i==4) {
                        System.out.print("*");
                    }
                }else {
                    System.out.print(" ");
                }
            }

            if(i>1) {
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }

        }
    }

