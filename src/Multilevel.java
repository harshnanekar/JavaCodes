/*
class Joy{
    int a=100000;
    void property(){
        System.out.println("Joy's property is " + a);
    }
}
class John extends Joy{
    int b=200000;
    void Johnproperty(){
        System.out.println("John's property is " + b + " and " + " his father's property is " + a);
    }
}
class Peter extends John{
    int c=400000;
    void peterProperty(){
    System.out.println("Peter's's property is " + c + " and " + " his father's property is " + b + " and his grandfather's property is " + a);
    }
}
*/

class Add{
 int a=10;
  int b=8;
    int c;
    void Acalculator(){
         c=a+b;
        System.out.println("Addition of two numbers is " + c);
    }
}
class Sub extends Add{

    void Scalculator() {
        c=a-b;
        System.out.println("Subtraction of two numbers is " + c);
    }
}
class Mul extends Sub{

    void Mcalculator() {
        c=a*b;
        System.out.println("Multiplication of two numbers is " + c);
    }
}
class Div extends Mul{
    void Dcalculator(){
        c=a/b;
        System.out.println("Division of two numbers is " + c);
    }
}



public class Multilevel {
    public static void main(String[] args){
       /* System.out.println("The property of all family are");
        Peter p=new Peter();
        p.property();
        p.Johnproperty();
        p.peterProperty();*/

        System.out.println("The calculation of all numbers are");
        Div d=new Div();
        d.Acalculator();
        d.Scalculator();
        d.Mcalculator();
        d.Dcalculator();


    }
}
