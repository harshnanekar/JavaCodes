public class Employee {

    long empId;
    String empName;
    double salary;
   char gender;
    boolean currwork;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean getCurrwork() {
        return currwork;
    }

    public void setCurrwork(boolean currwork) {
        this.currwork = currwork;
    }
}
