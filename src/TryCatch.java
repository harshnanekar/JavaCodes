public class TryCatch {

    public static void main(String[] args){
        /*int[] m={1,2,3,4};
        try{
            System.out.println(m[6]);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error occured");
        }
        System.out.println(m[3]);
        System.out.println(m[0]);
*/
      /*  int a=5;
        int b=0;
        int c;
        int d=8;

        try {
            c=a/b;
            System.out.println(c);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error occured");
        }
        c=a+d;
        System.out.println(c);*/

        int[] marks=new int[5];
        try{
            marks[5]=11;
        }catch(Exception e){
           e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally block executed");

        }
    }
}
