import java.util.ArrayList;
import java.util.List;

public class YoutubeSubject {

    private String title;





    private List<SubscriberObserve> li=new ArrayList<>();

    public void subscribe(SubscriberObserve s){
        li.add(s);
    }
    public void unsubscribe(SubscriberObserve s) {
        li.remove(s);

    }
    public void upload(){
        for(SubscriberObserve su:li) {
            su.update(title);
        }

    }
    public void uploaded(String title){
        this.title=title;
        upload();
    }
}
