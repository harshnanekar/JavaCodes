class Trun extends java.lang.Thread{
    @Override
    public void run() {
        int n=50;
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println("Even of " +  java.lang.Thread.currentThread().getName() + " " + i);
            }else{
                System.out.println("Odd of " +  java.lang.Thread.currentThread().getName() +  " " + i);
            }
            try {
                java.lang.Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
/*class Dedd implements Runnable{

    @Override
    public void run() {
        int c=1;
        for(int i=1;i<20;i++){
           c=c*i;
            System.out.println(c);
        }
    }
}*/
public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {
        Trun t=new Trun();
        t.setName("Thread1");
        t.setPriority(4);
        System.out.println(t.isAlive());
        t.start();
        t.join();
        Trun trun=new Trun();

        trun.setName("Thread2");
        trun.setPriority(9);

        java.lang.Thread tr=new java.lang.Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Running thread");
            }
        });
        tr.start();
        tr.join();
    }
}
