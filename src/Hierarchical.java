class Animal{
    void animalSounds(){
        System.out.println("eating..");
    }
}
class Dog extends Animal{
    void DogSounds(){
        System.out.println("barking...");
    }
}
class Cat extends Animal{
    void CatSounds(){
        System.out.println("Meowing...");
    }
}
class Bird extends Animal{
    void BirdSounds(){
        System.out.println("Chirping...");
    }
}
class Peacock extends Bird{
    void PeacockSounds(){
        System.out.println("Meow...");
    }
}
public class Hierarchical {
    public static void main(String[] args){
        Bird b=new Bird();
        b.animalSounds();
        b.BirdSounds();

        Dog d=new Dog();
        d.animalSounds();
        d.DogSounds();

        Peacock p=new Peacock();
        p.animalSounds();
        p.BirdSounds();
        p.PeacockSounds();
    }
}
