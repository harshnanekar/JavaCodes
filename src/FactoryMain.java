import java.util.Scanner;

public class FactoryMain {

    public static void main(String[] args) {
        VehicleOperator v=new VehicleOperator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vehice name");
        String name=sc.next();
        VehicleFactory vs=v.getvehicle(name);
        vs.vehiclename();
    }
}
