public class Constructor {

    String name;
    int rollNo;
    String Class;


    public static void main(String[] args){
        Constructor c=new Constructor();
        c.cons("Harshal",52,"IT");

    }

    private void cons(String a, int b,String c) {
        this.name=a;
        this.rollNo=b;
        this.Class=c;
        System.out.println("Your name is " + name + " your rollNo is " + rollNo +  " your class is " + Class);
    }

}
