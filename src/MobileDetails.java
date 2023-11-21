import java.util.Scanner;

public class MobileDetails implements Mobile {
    @Override
    public void details() {
        System.out.println("This is Redmi phone with price 10,000" );
    }
}
class Samsung implements Mobile{


    @Override
    public void details() {
        System.out.println("This is Samsung phone with price 20,000" );
    }
}
class Apple implements Mobile{

    @Override
    public void details() {
        System.out.println("This is Apple phone with price 1,000,00" );
    }
}
class ConfigMobile {

    Mobile m;

    public Mobile getmobile(String name){
        if(name.equalsIgnoreCase("redmi")){
            m=new MobileDetails();
        }else   if(name.equalsIgnoreCase("samsung")){
            m=new Samsung();
        }  if(name.equalsIgnoreCase("apple")){
            m=new Apple();
        }

        return m;
    }


}
class MobileDet{
    public static void main(String[] args) {
        ConfigMobile c=new ConfigMobile();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mobile name");
        String mob=sc.next();
        Mobile m=c.getmobile(mob);
        m.details();

    }

}