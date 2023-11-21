import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Users{

    private String name;

    Users(String name){
        this.name=name;
    }

    public void update(String mobile){
        System.out.println("Hello "+  name + " New mobile arrived " + mobile );
    }

}
class Mobiles{
    private String piece;
    List<Users> li=new ArrayList<>();

    public void addUsers(Users user){
        li.add(user);
    }
    public void notifys(){
        for(Users u:li){
            u.update(piece);
        }
    }
    public void calls(String piece){
        this.piece=piece;
        notifys();
    }

}

public class Streams {

    public static void main(String[] args) {
/*
        List<Integer> li= Arrays.asList(91,23,91,43,43,35);
        li.stream().
                forEach(n-> System.out.println(n));*/

        Users u=new Users("harshal");
        Users us=new Users("nayan");

        Mobiles m=new Mobiles();
        m.addUsers(u);
        m.addUsers(us);
        m.calls("poko");


    }
}
