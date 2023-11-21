public class BiPyramid {

    public static void main(String[] args) {

        int num=4;
int k=0;
int m=1;

        for(int i=1;i<=num;i++){
            for(int j=7;j>=i;j--)
                if(i%2!=0){

                        if (j % 2 != 0) {
                            System.out.print(m);
                        }

                }else{

                        if (j % 2 == 0) {
                            System.out.print(k);
                        }

                }

            System.out.println(" ");
            }

        }
    }
