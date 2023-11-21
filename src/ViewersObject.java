public class ViewersObject {

    private String name;
     ViewersObject(String name) {
     this.name=name;
     }


        public void updates(String title) {
        System.out.println("Hello, " + name + " Movie uploade " +  title );
    }
}
