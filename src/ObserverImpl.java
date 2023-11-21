public class ObserverImpl {

    public static void main(String[] args) {
/*
        SubscriberObserve s=new SubscriberObserve("harsh");
        SubscriberObserve s1=new SubscriberObserve("vimal");
        SubscriberObserve s2=new SubscriberObserve("madhur");
        SubscriberObserve s3=new SubscriberObserve("vishal");

        YoutubeSubject y=new YoutubeSubject();
        y.subscribe(s);
        y.subscribe(s1);

        y.unsubscribe(s1);

        y.subscribe(s3);


        y.uploaded("Telusko");
        y.uploaded("Laearn java");*/

        ViewersObject v=new ViewersObject("harsh");
        ViewersObject v1=new ViewersObject("nayan");
        ViewersObject v2=new ViewersObject("vishal");
        ViewersObject v3=new ViewersObject("patil");

        MovieSubject m=new MovieSubject();
        m.addSubscriber(v);
        m.addSubscriber(v1);

        m.upload("Lagaan");

    }
}
