import java.util.*;
import java.util.List;

public class Employee1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Employee> emp1=new ArrayList<Employee>();

        for(int i=0;i<1;i++){
            Employee e=new Employee();
            System.out.println("Enter the Employee I'd");
            long id=sc.nextLong();
            e.setEmpId(id);

            System.out.println("Enter the Employee name");
           String name=sc.next();
           e.setEmpName(name);

            System.out.println("Enter the Employee Salary");
           double salary=sc.nextDouble();
            e.setSalary(salary);

            System.out.println("Enter the Gender");
           char gender=sc.next().charAt(0);
           e.setGender(gender);

            System.out.println("Currently working or not");
            boolean work=sc.nextBoolean();
            e.setCurrwork(work);

            emp1.add(e);

        }
     /*  ListIterator<Employee> e1=emp1.listIterator();
        while (e1.hasNext()){
            System.out.println(e1.next().getEmpId());

        }*/
        for(int j=0;j< emp1.size();j++){
            System.out.println(emp1.get(j));

            System.out.println(emp1.get(j).getEmpId());
            System.out.println(emp1.get(j).getEmpName());
            System.out.println(emp1.get(j).getGender());

        }





    }
}
