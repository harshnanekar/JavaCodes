import java.util.Scanner;

public class Store {
    String giftName;
    int balance;
    String userName;
    String giftProduct;
    int price;

    public static void main(String args[]){
        Store s=new Store();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String user=sc.nextLine();
        System.out.println("Enter the password");
        String pass=sc.nextLine();
        boolean validUser=s.login(user,pass);
        if(validUser){
            System.out.println("Welcome" + s.userName);
        }
        System.out.println("Select the item to gift for!!");
        System.out.println("1.Birthday Gifts");
        System.out.println("2.Anniversary Gifts");
        System.out.println("3.Work Promotion Gifts");
        System.out.println("4.Festive Gifts");
        System.out.println("5.Wedding Gifts");

        int n=sc.nextInt();
        s.gift(n);

        String productName=sc.next();
        boolean value=s.product(productName);
        if(value) {
            boolean product = s.buyProduct();

            if (!product) {
                System.out.println("Add Money");
                int money = sc.nextInt();
                s.addWallet(money);
            }
        }
    }

    private void addWallet(int money) {

        balance=balance+money;
        System.out.println("Money added successfully");
        buyProduct();
    }

    private boolean buyProduct() {
        boolean product=false;
        if (balance>0){
            if(balance>=price){
                balance=balance-price;
                product=true;
                System.out.println("Your item is purchased at price" + price +"and your account balance is " + balance );
            }else{
                System.out.println("Invalid account balance add money to your account");
            }
        }else {
            System.out.println("Your account balance is 0");
        }
        return product;
    }


    private boolean product(String productName) {
        boolean value=true;
        switch(productName){
            case"Greetingcard":
                price =100;
                break;
            case"Chocolates":
                price =500;
                break;
            case"Cosmetics":
                price=1500;
                break;
            case"Bouqet":
                price =300;
                break;
            case"Men's/Women's Accessories":
                price =2000;
                break;
            case "Statues":
                price = 100;
                break;
            case "Jewellery":
                price = 500;
                break;
            case "Watches":
                price = 1000;
                break;
            case "Sweets":
                price = 500;
                break;
            case "Home & Living":
                price = 2000;
                break;
            default:
                System.out.println("Item Not available");
                value=false;
                break;

        }
        return value;
    }


    private void gift(int n) {
    if(n==1){
        System.out.println("1.Greeting card");
        System.out.println("2.Chocolates");
        System.out.println("3.Cosmetics");
        System.out.println("4.Bouqet");
        System.out.println("5.Men's/Women's Accessories");
      }else if(n==2){
        System.out.println("1.Statues");
        System.out.println("2.Jewellery");
        System.out.println("3.Cosmetics");
        System.out.println("4.Bouqet");
        System.out.println("5.Men's/Women's Accessories");
    }else if(n==3){
        System.out.println("1.Watches");
        System.out.println("2.Jewellery");
        System.out.println("3.Cosmetics");
        System.out.println("4.Bouqet");
        System.out.println("5.Men's/Women's Accessories");
    }else if(n==4){
        System.out.println("1.Sweets");
        System.out.println("2.Jewellery");
        System.out.println("3.Greeting Card");
        System.out.println("4.Men's/Women's Accessories");
    }else if(n==5){
        System.out.println("1.Home & Living");
        System.out.println("2.Jewellery");
        System.out.println("3.Greeting Card");
        System.out.println("4.Bouqet");
        System.out.println("5.Men's/Women's Accessories");
    }else{
        System.out.println("Invalid Input");
    }
    }

    private boolean login(String user, String pass) {
      userName=user;
      boolean validUser=true;
      if(user.equalsIgnoreCase("Harshal") && pass.equals("1234")){
          balance=300;
      }else  if(user.equalsIgnoreCase("Nayan") && pass.equals("1234")){
          balance=5000;
      }else  if(user.equalsIgnoreCase("Yash") && pass.equals("1234")){
          balance=25000;
      }else {
          System.out.println("Invalid User");
          validUser=false;
      }
        return validUser;
    }
}

