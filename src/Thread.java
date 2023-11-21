class Asd extends java.lang.Thread {


    @Override
    public void run() {
        java.lang.Thread.currentThread().getPriority();
        for(int i=0;i<10;i++){

            System.out.println("Value " + i);
            try {
                java.lang.Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

}



public class Thread {



    public static void main(String[] args) throws InterruptedException {
        Asd a=new Asd();
        a.start();
        Asd ab=new Asd();
       ab.start();
       Asd af=new Asd();
       af.start();
    }
}
