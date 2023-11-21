
class Bike{
int bprice=100000;
int profit;
int year=2022;
    void price(){
        System.out.println("The price of Honda bike in "+ year + " is " + bprice);
    }
}
class Honda extends Bike{
 int bprice1=80000;

void price1(){
     profit=bprice-bprice1;

    System.out.println("The price of Honda bike was  " + bprice1 + " in 2021 " + " and it inceased in " + year +" by " + profit);
}
}
class Honda1 extends Bike{
    int bprice2=70000;
    void price2(){
        profit=bprice-bprice2;
        System.out.println("The price of Honda bike was " + bprice2 + " in 2020 " + " and it inceased in " + year +" by " + profit);
    }
}
class Honda2 extends Bike{
    int bprice3=50000;
    void price3(){
        profit=bprice-bprice3;
        System.out.println("The price of Honda bike was " + bprice3 + " in 2019 " + " and it inceased in " + year + " by " + profit);
    }
}

public class Hierarchy2 {

    public static void main(String[] args){
     Bike b=new Bike();
     b.price();

     Honda h=new Honda();
     h.price1();

     Honda1 h1=new Honda1();
     h1.price2();

     Honda2 h2=new Honda2();
     h2.price3();
    }
}
