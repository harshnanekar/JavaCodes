class Ams implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello thread1");
    }
}

public class Thread2 {

    public static void main(String[] args) {
        Ams as=new Ams();
        ThreadGroup th=new ThreadGroup("threading");
       java.lang.Thread t1=new java.lang.Thread(th,as,"t1");
       t1.start();
        java.lang.Thread t2=new java.lang.Thread(th,as,"t1");
        t2.start();
        th.list();
    }
}
