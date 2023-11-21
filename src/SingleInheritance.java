/*class Audi{
    void speed(){
        System.out.println("Audi Speed is 100km/hr");
    }
}
class BMW extends Audi{
    void speed(){
       super.speed();
        System.out.println("BMW Speed is 200km/hr");

    }
}*/
/*class Dog{
    void foods(){
        System.out.println("Dog eats pedigree");
    }
}
class Cat extends Dog{

    void food() {
        System.out.println("Cat drinks milk");
    }
}*/

class John{

    John(){

        System.out.println("Hi....");
    }
    void favLanguage(){
        System.out.println("John's favourite programming language is Java");
    }
}
class Peter extends John{

    Peter(int c){
        super();
        System.out.println(c);
    }

    void favLanguage(){
        super.favLanguage();
        System.out.println("Peter's favourite programming language is Python");
    }
}

public class SingleInheritance {

    public static void main(String[] args){
      /* BMW b=new BMW();
        b.speed();*/

       /* Cat c=new Cat();
        c.foods();
        c.food();*/

       //John j=new John(10,20);

        Peter p=new Peter(10);
        p.favLanguage();
    }
}
