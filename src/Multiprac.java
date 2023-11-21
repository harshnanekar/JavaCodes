class Kebbs{
    int a=34;

    Kebbs(){

        System.out.println("Hello constructor 1");

    }
    void m2(){
        System.out.println("This keboi");
    }
}
class Kebboi extends Kebbs{


    Kebboi(){
        System.out.println("Constructor 2");
    }

    void m1(){
        System.out.println("This is a method");

    }
}


public class Multiprac {

    public static void main(String[] args) {
        Kebboi k=new Kebboi();
        k.m1();
     /*   int[][] arr = {{1,0,0},
                       {0,1,0},
                       {0,0,1}};
        int[][] arr2 = {{1,0,0},
                       {0,1,0},
                       {0,0,10}};
        int[][]arr4={{3,4,5},{3,1,2},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    System.out.print(arr4[i][j] + " ");
                }else{
                    System.out.print(0+ " ");
                }
            }
            System.out.println(" ");
        }
        int[][]arr3=new int[3][3];*/
      /*  int count=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if(arr[i][j]!=arr2[i][j]){
                   count++;
               }
            }
            System.out.println(" ");
        }
        if(count>0){
            System.out.println("it is not a identity matrix");
        }else{
            System.out.println("it is a identity");
        }*/
      /*  for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
              arr3[i][j]=arr[j][i];
                System.out.print(arr3[i][j]);
            }
            System.out.println(" ");
        }*/
       /* int r1=0;
        int r2=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<2;i++ ){
            for(int j=0;j<2;j++) {
                if (i == 0) {
                    r1 = r1 + arr[i][j];
                } else if (i == 1) {
                    r2 = r2 + arr[i][j];
                } else {
                    System.out.println("invalid");
                }
                if (j == 0 ) {
                    c1 = c1 + arr[i][j];
                } else if (j == 1 ) {
                    c2 = c2 + arr[i][j];
                } else {
                    System.out.println("invalid");
                }
            }

        }
        System.out.println("Row 1--> " + r1);
        System.out.println("Row 2--> " + r2);
        System.out.println("Column 1--> " + c1);
        System.out.println("Column 2 -- > " + c2);*/
       /* int m=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]%2==0){
                    count++;
                }else{
                  m++;
                }*/
               /* if(i<=j){
                    System.out.print(arr[i][j] + " ");
                }else{
                    System.out.print(0 + " ");
                }*/
           /* }
            System.out.println(" ");
            }
        System.out.println("Odd--> " + m + " and Even are " + count );*/

       /* for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if(arr[i][j]!=arr3[i][j]){
                   count++;
               }
            }
            System.out.println(" ");
        }
        if(count>0){
            System.out.println("both are not equal");
        }else{
            System.out.println("Both are equal");
        }*/
    }
}
