public class Singleton {

    public static void main(String[] args) {
        Bab bss=Bab.getInst();
        Bab bs11s=Bab.getInst();
    }

}
class Bab{

    static Bab b;

    private Bab(){
        System.out.println("Instance created");
    }

    public static Bab getInst(){
          if(b==null) {
              b = new Bab();
          }
        return b;
    }


}