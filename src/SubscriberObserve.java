public class SubscriberObserve {

    private String name;
   private  YoutubeSubject y=new YoutubeSubject();

    public SubscriberObserve(String name){
        super();
        this.name=name;
    }

    public void update(String title){
        System.out.println("Video uploaded " + name + ",video is " + title);
    }


}
