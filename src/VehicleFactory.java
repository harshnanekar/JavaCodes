import java.util.Scanner;

public interface VehicleFactory {

    void vehiclename();
}
interface Mobile{
    void details();
}
interface Milk{
    void products();
}
class Curd implements Milk{

    @Override
    public void products() {
        System.out.println("Curd price is 30rs kg");
    }
}
class Yoghurt implements Milk{

    @Override
    public void products() {
        System.out.println("Yoghurt price is 130rs kg");
    }
}
class SeperateProduct {

    Milk m;

    public  SeperateProduct(Milk m){
        this.m=m;
    }
 public void checks(){
        m.products();
 }
    /*public Milk getp(String product) {
        Milk m = null;
        if (product.equalsIgnoreCase("Curd"))
            m = new Curd();
        else if (product.equalsIgnoreCase("Yoghurt"))
            m = new Yoghurt();
        else
            System.out.println("Invalid");
        return m;
    }*/
}
    class GetProduct {

        public static void main(String[] args) {
            SeperateProduct s = new SeperateProduct(new Yoghurt());
            s.checks();
        }
    }
