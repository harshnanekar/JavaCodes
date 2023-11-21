public class VehicleOperator {

   VehicleFactory getvehicle(String s){
       VehicleFactory v=null;
        if(s.equalsIgnoreCase("bike"))
            v= new BikeFactory();
        else if (s.equalsIgnoreCase("car"))
            v=new CarFactory();

   return v;
   }
}
