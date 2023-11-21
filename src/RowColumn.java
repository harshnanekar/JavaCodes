public class RowColumn {

    public static void main(String[] args) {

        int[][]a={
                {3,4,2},
                {2,21,2},
                {8,2,3}
        };

        //Sum of particular row and column
        /*int sum=0,total=0,add=0,add1=0,add2=0,add3=0;

        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==0){
                    sum=sum + a[i][j];
                }else if(i==1){
                    total=total + a[i][j];
                } else if (i==2) {
                   add=add + a[i][j];
                }else {
                    System.out.println("Invalid");
                }
                if(j==0){
                    add1=add1 + a[i][j];
                }else if(j==1){
                    add2=add2 + a[i][j];
                } else if (j==2) {
                    add3=add3 + a[i][j];
                }else {
                    System.out.println("Invalid");
                }

            }
        }
        System.out.println("Row1--> " + sum );
        System.out.println("Row2--> " + total );
        System.out.println("Row3--> " + add );
        System.out.println("Column1--> " + add1 );
        System.out.println("Column2--> " + add2);
        System.out.println("Column3--> " + add3);*/

        //Transpose of a matrix
       /* int rows=a.length;
        int col=a.length;
   int[][] t=new int[col][rows];
   for(int i=0;i<col;i++){
       for(int j=0;j<rows;j++){
           t[i][j]=a[j][i];
       }
   }
   for(int i=0;i<t.length;i++){
       for(int j=0;j<t.length;j++){
           System.out.print(t[i][j] + " ");
       }
       System.out.println(" ");
   }*/

       /* int[][] b={
                {2,3},
                {9,4}
        };
        int rows=b.length;
        int col=b.length;
        int [][]f= new int[col][rows];
        for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
                f[i][j]=b[j][i];
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
                System.out.print(f[i][j] + " ");
            }
            System.out.println(" ");
        }*/

    }
}
