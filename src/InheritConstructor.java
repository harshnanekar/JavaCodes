class Mike{
     Mike(int a,int b){

        System.out.println("Hi Mike here");
    }
    void iceCream(){
        System.out.println("Mike likes Chocobar");
    }
}
class Emily extends Mike {
   Emily(int c){
    super(10,5);
        System.out.println("Hii Emily here...");
    }
    @Override
    void iceCream() {
        super.iceCream();
        System.out.println("Emily likes Butterscoth");
    }
}
    public class InheritConstructor {

        public static void main(String[] args) {
            Emily e=new Emily(10);
            e.iceCream();


        }
        }
