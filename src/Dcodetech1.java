import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dcodetech1 {

    void update(int select,int n,List<Dcodtech> dcode,Scanner sc) {
        outer:
        for (int i = 0; i < n; i++) {
            int selectnum;
            if (select == i) {
                System.out.println("Enter the input to change");
                selectnum = sc.nextInt();
                if (selectnum == 0) {
                    System.out.println("Enter the new name");
                    String names = sc.next();
                    dcode.get(i).setStudentName(names);
                    break outer;
                } else if (selectnum == 1) {
                    System.out.println("Enter the new course name");
                    String coursenames = sc.next();
                    dcode.get(i).setCourseName(coursenames);
                    break outer;
                } else if (selectnum == 2) {
                    System.out.println("Enter the new fees");
                    long fees = sc.nextLong();
                    dcode.get(i).setFees(fees);
                    break outer;
                } else if (selectnum == 3) {
                    System.out.println("Enter the new education");
                    String education = sc.next();
                    dcode.get(i).setEducation(education);
                    break outer;
                } else {
                    System.out.println("Not found");
                }

            }

        }

    }

    private void object(int n,Scanner sc,List<Dcodtech> dcode) {
        for (int i = 0; i < n; i++) {
            Dcodtech d = new Dcodtech();


            System.out.println("Enter the student name");
            String name = sc.next();
            d.setStudentName(name);

            System.out.println("Enter the course name");
            String course = sc.next();
            d.setCourseName(course);

            System.out.println("Enter the fees");
            long fees = sc.nextLong();
            d.setFees(fees);

            System.out.println("Enter the education");
            String education = sc.next();
            d.setEducation(education);


            dcode.add(d);

        }
        }


    public static void main(String[] args) {

        Dcodetech1 d1=new Dcodetech1();
        List<Dcodtech> dcode = new ArrayList<Dcodtech>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to see details");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Dcodtech d = new Dcodtech();


            System.out.println("Enter the student name");
             String  name = sc.next();
            d.setStudentName(name);

            System.out.println("Enter the course name");
            String course = sc.next();
            d.setCourseName(course);

            System.out.println("Enter the fees");
            long fees = sc.nextLong();
            d.setFees(fees);

            System.out.println("Enter the education");
            String education = sc.next();
            d.setEducation(education);


            dcode.add(d);



        }
        for (int i=0;i<dcode.size();i++){

            System.out.println(dcode.get(i).getStudentName());
            System.out.println(dcode.get(i).getCourseName());
            System.out.println(dcode.get(i).getFees());
            System.out.println(dcode.get(i).getEducation());
            System.out.println(" ");

        }

        System.out.println("Do you want to change any input");
        String yesorno=sc.next();
        if(yesorno.equalsIgnoreCase("yes")) {
            System.out.println("1.Add another Object ");
            System.out.println("2.Change the inputs ");
            int change=sc.nextInt();
            if(change==1){
                System.out.println("Enter the objects to add");
                n=sc.nextInt();
                d1.object(n,sc,dcode);

            }else if(change==2) {

                System.out.println("Enter the object");
                int select = sc.nextInt();
                d1.update(select, n, dcode, sc);

            }else{
                System.out.println("Invalid");
            }
        }else if (yesorno.equalsIgnoreCase("no")){
            System.out.println("Ok continue");
        }else{
        System.out.println("Invalid input");
        }


        for (int i=0;i<dcode.size();i++){

            System.out.println(dcode.get(i).getStudentName());
            System.out.println(dcode.get(i).getCourseName());
            System.out.println(dcode.get(i).getFees());
            System.out.println(dcode.get(i).getEducation());
            System.out.println(" ");

        }







    }


}
