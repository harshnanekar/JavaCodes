public class Cashback implements Redmi{
    @Override
    public void cashback() {
        System.out.println("Monday to tuesday 20% discount");
    }
}
class Wednesday implements Redmi{

    @Override
    public void cashback() {
        System.out.println("Wednesday to friday 30% discount");
    }
}
class Friday implements Redmi{

    @Override
    public void cashback() {
        System.out.println("Saturday,Sunday 50% discount");
    }
}
class Casher{

    Redmi r;

    Casher(Redmi r){

        this.r=r;
    }
    void getdis(){
        r.cashback();
    }
}
class Getdiscou {
    public static void main(String[] args) {
         Casher c=new Casher(new Friday());
         c.getdis();
    }
}