public class Lowertriangular {

    public static void main(String[] args) {

        int[][]a= {
                {3,4,2},
                {4,21,1},
                {7,5,6}
        };


//Frequency of odd and even numbers
      /*  int counter=0;
        int count=0;
        for(int i=0;i<a.length;i++){

            for(int j=0;j< a.length;j++){
                if(a[i][j]%2==0){
                    counter++;
                }else{
                    count++;
                }
            }
        }
        System.out.println("The Even Numbers are " + counter +" and odd numbers are " + count);*/


        //Lower Triangular matrix
     /*   for(int i =0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(j>i){
                    System.out.print("0" + " ");
                }else{
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println(" ");
        }*/

        //Upper Triangular Matrix
     /*   for(int i =0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(j>=i){
                    System.out.print(a[i][j] + " ");

                }else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println(" ");
        }*/
    }
}
