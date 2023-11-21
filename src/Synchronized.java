class Abc{
   synchronized void calci(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + " " +  (n*i));
        }
    }
}
class Bbc extends java.lang.Thread {

    Abc a;

    public Bbc(Abc a) {
        this.a=a;
    }

    @Override
    public void run() {
        a.calci(5);
    }
}
class Ccb extends java.lang.Thread {

    Abc a;

    public Ccb(Abc a) {
        this.a=a;
    }

    @Override
    public void run() {
        a.calci(15);
    }
}


/*class Dsa implements Runnable{
//int num=1;
    @Override
    public synchronized void run() {
       *//* if(num>0) {
            System.out.println("Hello your name is " + java.lang.Thread.currentThread().getName());
            num--;
        }else{
            System.out.println("sorry");
        }*//*
    }
}*/

public class Synchronized {


    public static void main(String[] args) {
        Abc a=new Abc();
        Bbc b=new Bbc(a);
       Ccb c=new Ccb(a);
        b.start();
        c.start();


      /*  Dsa d=new Dsa();
        java.lang.Thread tr=new java.lang.Thread(d);
        java.lang.Thread trs=new java.lang.Thread(d);
        java.lang.Thread tra=new java.lang.Thread(d);

        tr.setName("Harsh");
        trs.setName("Harshal");
        tra.setName("Harsha");

        tr.start();
        trs.start();
        tra.start();*/
    }


}
