class Mse{
    void  m1(String name){
        System.out.println("Threads running " + name);
        synchronized(this){
            System.out.println("Hi your name is " + name + 4*4);
        }
        System.out.println("Threads ending " + name);
    }
}
class Cbse extends java.lang.Thread{
    Mse m;

    public Cbse(Mse m) {
        this.m=m;
    }

    @Override
    public void run() {
        m.m1("Harsh");
    }
}
class Leb extends java.lang.Thread{
Mse m;

Leb(Mse m){
    this.m=m;
}
    @Override
    public void run() {
        m.m1("Vishal");
    }
}

public class Synblock {

    public static void main(String[] args) {
        Mse m=new Mse();
        Cbse c=new Cbse(m);
        Leb l=new Leb(m);
        c.start();
        l.start();
    }
}
