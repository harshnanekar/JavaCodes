import java.util.Scanner;

public interface ClothShop {
    boolean validUser(String user,String pass);
    void getOpt(int selOpt);
    void getPair(int select);

    boolean buyProduct();
    void putMoney(int money);
    }
class Create implements ClothShop{
    int balance;

    int cost;
    int total;
   @Override
    public boolean validUser(String user, String pass) {
        boolean valid=true;
        if(user.equalsIgnoreCase("harshal") && pass.equalsIgnoreCase("1234")){
            balance=1000;
        }else if(user.equalsIgnoreCase("nayan") && pass.equalsIgnoreCase("1234")){
           balance=3000;
       }else if(user.equalsIgnoreCase("bhagyashree") && pass.equalsIgnoreCase("1234")){
            balance=5000;
        }else{
            System.out.println("Invalid user");
            valid=false;
        }
        return valid;
   }

    @Override
    public void getOpt(int selOpt) {
        if(selOpt==1){
            cost=800;
        }else if(selOpt==2){
            cost=500;
        }else if(selOpt==3){
            cost=1500;
        }else if(selOpt==4){
            cost=2000;
        }else if(selOpt==5){
            cost=1000;
        }else{
            System.out.println("Not in stock");
        }
    }

    @Override
    public void getPair(int select) {
        total=cost*select;
    }

    @Override
    public boolean buyProduct() {
       boolean product=true;
       if(balance>0){
           if(balance>=total){
               balance=balance-total;
               System.out.println("Your clothes are purchase at price " + total + " and your account balance is " + balance);
           }else {
               System.out.println("Insufficient account balance");
               product=false;
           }
       }else {
           System.out.println("Your account balance is 0");
       }
        return product;
    }

    @Override
    public void putMoney(int money) {
        balance=balance+money;
        System.out.println("Money added successfully");
        buyProduct();
    }
}
interface Checks{
    void fiba(int num);
}
class Niba implements Checks{

    @Override
    public void fiba(int num) {
        int first=0;
        int second=1;
        for (int i=1;i<=num;i++){
            System.out.println(first);
            int next=first+second;
            first=second;
            second=next;

        }

    }

    public static void main(String[] args) {
        Niba n=new Niba();
        n.fiba(10);
    }
}
class Interface{
    public static void main(String[] args){
        Create c=new Create();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username");
        String user=sc.nextLine();
        System.out.println("Enter the password");
        String pass=sc.nextLine();
        boolean valid=c.validUser(user,pass);
        if(valid){
            System.out.println("Welcome " + user);
            System.out.println("Select clothes of your choice");
            System.out.println("1.Shirts");
            System.out.println("2.T-Shirts");
            System.out.println("3.Trousers");
            System.out.println("4.Jeans");
            System.out.println("5.FormalPants");
        int selOpt=sc.nextInt();
        c.getOpt(selOpt);
            System.out.println("Select the no. of pairs");
            int select=sc.nextInt();
            c.getPair(select);
          boolean product = c.buyProduct();
          if(!product){
              System.out.println("Add money to account");
              int money=sc.nextInt();
              c.putMoney(money);
          }
        }
    }
}