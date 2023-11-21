public class PayPal implements Payment{
    @Override
    public void type() {
        System.out.println("Your payment method is paypal");
    }
}
class Credit implements Payment{

    @Override
    public void type() {
        System.out.println("Your payment methos is upi");
    }
}
class NewCred{
     Payment p;

     NewCred(Payment p){
         this.p=p;
     }

     void execute(){
         p.type();
     }
}
class TotImp{
    public static void main(String[] args) {
        NewCred n=new NewCred(new PayPal());
        n.execute();
    }

}
