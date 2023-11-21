import javax.swing.text.View;
import java.util.ArrayList;
import java.util.List;

public class MovieSubject {

    private List<ViewersObject> li=new ArrayList<>();
    String title;

    public void addSubscriber(ViewersObject view){
        li.add(view);
    }
    public void removeSubscriber(ViewersObject view){
        li.remove(view);
    }

    public void sent(){
        for(ViewersObject v:li){
            v.updates(title);
        }

    }



    public void upload(String title){
        this.title=title;
      sent();
    }

}
