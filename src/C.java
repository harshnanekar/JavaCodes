import java.util.ArrayList;
import java.util.List;

class C{

    private String name;
    private char gender;
    private int age;


    public static void main(String[] args) {
      C c=new C();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}