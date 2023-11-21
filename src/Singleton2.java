public class Singleton2 {

    public static void main(String[] args) {

        TestSingleton t=TestSingleton.gets();


    }


}
class TestSingleton{

   static  TestSingleton t;

   private TestSingleton(){
       System.out.println("One instance");
   }

   public static TestSingleton gets(){
       t=new TestSingleton();
       return t;
   }
}
