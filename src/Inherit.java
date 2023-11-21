
class A{
    A(){
        System.out.println("Constructor of a is called");
    }
    void m1(){
        System.out.println("method 1 is called");
    }
    void m2(){
        System.out.println("method 2 is called");
    }
}
class B extends  A{
    B(){
        System.out.println("Constructor of b is called");
    }
    @Override
    void m2() {
        System.out.println("method 3 is called");
    }
}


public class Inherit {

    public static void main(String[] args) {
        B a=new B();
        a.m2();
    }
}
