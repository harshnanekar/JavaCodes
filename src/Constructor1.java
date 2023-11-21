public class Constructor1 {
int i;
int j;
String k;

    Constructor1(int a,int b){
        this.i=a;
        this.j=b;
        System.out.println("The numbers are " + i + " and " + j);
    }
    Constructor1(){

        System.out.println("Empty Constructor");
    }
    Constructor1(int a,String b,int c){
        this.i=a;
        this.j=c;
        this.k=b;
        System.out.println("The values are " + i + " and " + j  + k);
    }

    private void cons() {
        System.out.println("Method is called");
        System.out.println("The numbers are " + i + " and " + j + k);
    }


    public static void main(String[] args){
        Constructor1 c=new Constructor1(5,6);
        Constructor1 c1=new Constructor1();
        Constructor1 c2=new Constructor1(2,"Harsh",9);

        c2.cons();
        c.cons();


    }


}
