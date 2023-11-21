import java.util.Scanner;

public class Uber {
double balance;
int fare;
double total;
double distance;
String username;
String carName;

    public static void main(String[] args){
        Uber u=new Uber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String user=sc.nextLine();
        System.out.println("Enter the password");
        String pass=sc.nextLine();
        boolean validUser= u.valid(user,pass);
        System.out.println("Welcome " + u.username + " 'Have a good day..!!' ");
        if(validUser){
            System.out.println("Enter the pick up location");
            String locate= sc.next();
            System.out.println("Enter the destination");
            String destination=sc.next();
            boolean des=u.destinate(locate,destination);
            if(des) {
                System.out.println("Choose the vehicle for ride");
                System.out.println("1.Car");
                System.out.println("2.Bike");
                System.out.println("3.Auto");
            }
        }
       String selOpt=sc.next();
      boolean opt= u.select(selOpt);
    if (opt) {
          if (selOpt.equalsIgnoreCase("car")) {
              System.out.println("1.Ertiga ");
              System.out.println("2.Mini");
              System.out.println("3.Wagon-r");
              System.out.println("4.Sedan");
              System.out.println("5.SUV");

              System.out.println("Enter the car name");
              String selCar=sc.next();
              boolean car=u.getCar(selCar);

          }
        boolean ride=u.bookRide();
          if(!ride){
              System.out.println("Add money to account");
              int money=sc.nextInt();
              u.addMoney(money);
          }
    }
    }

    private void addMoney(int money) {
        balance=balance+money;
        System.out.println("Money added successfully");
        bookRide();
    }

    private boolean bookRide() {
        boolean ride=true;
        if(balance>0){
                total=fare*distance;
                if(balance>=total) {
                    balance = balance - total;
                    System.out.println("Your ride is booked and your fare is " + total + " and your account balance is " + balance + " Happy journey!! ");

                }else{
                System.out.println("Insufficient balance");
                ride=false;
            }
        }else {
            System.out.println("Your account balance is 0 add money to your account");
        }
        return ride;
    }

    private boolean getCar(String selCar) {
        carName=selCar;
        boolean car=true;
        if (selCar.equalsIgnoreCase("ertiga")){
            fare=16;
        } else if (selCar.equalsIgnoreCase("wagon-r")) {
            fare=10;

        } else if (selCar.equalsIgnoreCase("mini")) {
            fare=11;

        } else if (selCar.equalsIgnoreCase("sedan")) {
            fare=13;

        } else if (selCar.equalsIgnoreCase("suv")) {
            fare=17;

        }else {
            System.out.println("Car not found");
            car=false;
        }
        return car;
    }

    private boolean destinate(String locate, String destination) {
        boolean des=true;
        if(locate.equalsIgnoreCase("chembur") && destination.equalsIgnoreCase("dadar")){
            distance=7.6;
        }else if(locate.equalsIgnoreCase("chembur") && destination.equalsIgnoreCase("virar")){
            distance=70.9;
        }else if(locate.equalsIgnoreCase("chembur") && destination.equalsIgnoreCase("thane")){
            distance=22.1;
        }else if(locate.equalsIgnoreCase("chembur") && destination.equalsIgnoreCase("csmt")){
            distance=17.5;
        }else if(locate.equalsIgnoreCase("dadar") && destination.equalsIgnoreCase("chembur")){
            distance=10.3;
        }else if(locate.equalsIgnoreCase("dadar") && destination.equalsIgnoreCase("virar")){
            distance=71.7;
        }else if(locate.equalsIgnoreCase("dadar") && destination.equalsIgnoreCase("csmt")){
            distance=9.00;
        }else if(locate.equalsIgnoreCase("dadar") && destination.equalsIgnoreCase("thane")){
            distance=30.2;
        }else if(locate.equalsIgnoreCase("thane") && destination.equalsIgnoreCase("chembur")){
            distance=21.9;
        }else if(locate.equalsIgnoreCase("thane") && destination.equalsIgnoreCase("dadar")){
            distance=27.9;
        }else if(locate.equalsIgnoreCase("thane") && destination.equalsIgnoreCase("csmt")){
            distance=38.7;
        }else if(locate.equalsIgnoreCase("thane") && destination.equalsIgnoreCase("virar")){
            distance=49.3;
        }else if(locate.equalsIgnoreCase("virar") && destination.equalsIgnoreCase("chembur")){
            distance=72.1;
        }else if(locate.equalsIgnoreCase("virar") && destination.equalsIgnoreCase("dadar")){
            distance=69.9;
        }else if(locate.equalsIgnoreCase("virar") && destination.equalsIgnoreCase("csmt")){
            distance=78.00;
        }else if(locate.equalsIgnoreCase("virar") && destination.equalsIgnoreCase("thane")){
            distance=49.3;
        } else if (locate.equalsIgnoreCase("csmt") && destination.equalsIgnoreCase("thane")) {
            distance=38.5;
        } else if (locate.equalsIgnoreCase("csmt") && destination.equalsIgnoreCase("virar")) {
            distance=78.7;
        }else if (locate.equalsIgnoreCase("csmt") && destination.equalsIgnoreCase("chembur")) {
            distance=17.9;
        }else  if (locate.equalsIgnoreCase("csmt") && destination.equalsIgnoreCase("dadar")) {
            distance=10.4;
        }
        else{
            System.out.println("Out of mumbai");
             des=false;
        }
        return des;
    }

    private boolean select(String selOpt) {
        boolean opt=true;
        if (selOpt.equalsIgnoreCase("Car")){
            fare=20;
        } else if (selOpt.equalsIgnoreCase("Bike")){
             fare=7;
        } else if (selOpt.equalsIgnoreCase("Auto")) {
            fare=14;
        } else {
            System.out.println("Invalid input");
            opt=false;
        }
         return opt;
    }

    private boolean valid(String user, String pass) {
        username=user;
        boolean validUser=true;
        if(user.equalsIgnoreCase("harshal") && pass.equals("1234")){
            balance=3000;
        } else if (user.equalsIgnoreCase("nayan") && pass.equals("1234")) {
            balance=2000;
        } else if (user.equalsIgnoreCase("yash") && pass.equals("1234")) {
            balance=3000;
        }else{
            System.out.println("Invalid User");
            validUser=false;
        }
        return validUser;
    }

}


