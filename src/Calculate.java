import java.util.Scanner;

public class Calculate {
    Prime p=new Prime();
    EvOd e=new EvOd();
    recursion r=new recursion();

    Calculator c=new Calculator();


    private void opt(int sel, int n) {

        if (sel==1){
           p.prime1(n);
            System.out.println("Check the other operations also");
            System.out.println("1.Yes");
            System.out.println("2.No");
        } else if (sel==2) {
           e.even(n);
            System.out.println("Check the other operations also");
            System.out.println("1.Yes");
            System.out.println("2.No");
        }else if (sel==3) {
            r.factorial(n);
            System.out.println("Check the other operations also");
            System.out.println("1.Yes");
            System.out.println("2.No");
        }else{
            System.out.println("Invalid Option");

        }

    }
    private boolean cal(int sel) {
        boolean valid=false;
        if(sel==4){
           valid=true;
        }
        return valid;
    }
    private void check(double num1, double num2) {
        c.add(num1,num2);
        c.sub(num1,num2);
        c.mul(num1,num2);
        c.div(num1,num2);
    }
    private boolean val(String check) {
        boolean yes=false;
        if(check.equalsIgnoreCase("yes") ){
            yes=true;
        }else {
            System.out.println("Ok");
        }
        return yes;
    }

    private boolean count(int select) {
        boolean val=true;
        if (select==1){

        }else if (select==2){

        }else if (select==3){

        }else{
            System.out.println("Option not found");
            val=false;
        }
        return val;
    }

    private void calci(int select, int num) {
        if (select==1){
            p.prime1(num);
        }else if (select==2){
            e.even(num);
        }else if (select==3){
            r.factorial(num);
        }else{
            System.out.println("Operation not found");
        }
    }

    private boolean checkprime(String yesno) {
        boolean check=false;
        if(yesno.equalsIgnoreCase("yes") ){
            check =true;
        }else {
            System.out.println("Ok");
        }
        return check;

    }
    private boolean counts(int i) {
        boolean v=true;
        if (i==2){

        }else if (i==3){

        }else{
            System.out.println("Option not found");
            v=false;
        }
        return v;
    }
    private void b(int i, int n2) {
        if (i==2){
            e.even(n2);
        }else if (i==3){
            r.factorial(n2);
        }else{
            System.out.println("Operation not found");
        }
    }
    private void ca(double i1, double i2) {
        c.add(i1,i2);
        c.sub(i1,i2);
        c.mul(i1,i2);
        c.div(i1,i2);
    }
    private boolean checkeven(String yesorno) {
        boolean va=false;
        if(yesorno.equalsIgnoreCase("yes")){
            va=true;
        }else{
            System.out.println("Ok");
        }
        return va;
    }
    private boolean counter(int j) {
        boolean crosscheck=true;
        if (j==1){

        }else if (j==3){

        }else{
            System.out.println("Option not found");
            crosscheck=false;
        }
        return crosscheck;

    }
    private void get(int j, int cv) {
        if (j==1){
            p.prime1(cv);
        }else if (j==3){
            r.factorial(cv);
        }else{
            System.out.println("Operation not found");
        }
    }
    private void getcal(double s1,double s2) {
        c.add(s1, s2);
        c.sub(s1,s2);
        c.mul(s1, s2);
        c.div(s1,s2);
    }
    private boolean checkfact(String yesandno) {
        boolean cb=false;
        if(yesandno.equalsIgnoreCase("yes")){
            cb=true;
        }else{
            System.out.println("Ok");
        }
        return cb;
    }
    private boolean checking(int set) {
        boolean co=true;
        if (set==1){

        }else if (set==2){

        }else{
            System.out.println("Option not found");
            co=false;
        }
        return co;
    }
    private void checker(int put, int set) {
        if (set==1){
            p.prime1(put);
        }else if (set==2){
            e.even(put);
        }else{
            System.out.println("Operation not found");
        }

    }
    private void put(double p1, double p2) {
        c.add(p1,p2);
        c.sub(p1,p2);
        c.mul(p1,p2);
        c.div(p1,p2);
    }
    public static void main(String[] args){

        Calculate c=new Calculate();
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Select the operation to perform");
        System.out.println("1.Prime");
        System.out.println("2.Even/Odd");
        System.out.println("3.Factorial");
        System.out.println("4.Calculator");
        int sel=sc.nextInt();

        if(sel!=4) {
            System.out.println("Enter the number to check");
             n = sc.nextInt();
         c.opt(sel, n);
         if(sel==1){
             String yesno=sc.next();
            boolean check= c.checkprime(yesno);
            if(check){
                System.out.println("Select the operation to perform");
                System.out.println("2.Even/Odd");
                System.out.println("3.Factorial");
                System.out.println("4.Calculator");
                int i=sc.nextInt();
                if(i!=4) {
                    boolean v = c.counts(i);
                    if (v) {
                        System.out.println("Enter the number");
                        int n2 = sc.nextInt();
                        c.b(i, n2);
                    }
                }
                if(i==4){
                    System.out.println("Enter the first number");
                    double i1=sc.nextDouble();
                    System.out.println("Enter the second number");
                    double i2=sc.nextDouble();
                    c.ca(i1,i2);
                }
            }
         }
         if(sel==2){
             String yesorno=sc.next();
             boolean va=c.checkeven(yesorno);
             if(va) {
                 System.out.println("Select the operation to perform");
                 System.out.println("1.Prime");
                 System.out.println("3.Factorial");
                 System.out.println("4.Calculator");
                 int j = sc.nextInt();
                 if (j != 4) {
                     boolean crosscheck = c.counter(j);
                     if (crosscheck) {
                         System.out.println("Enter the number");
                         int cv = sc.nextInt();
                         c.get(j, cv);
                     }
                 }
                 if(j==4){
                     System.out.println("Enter the first number");
                   double s1=sc.nextDouble();
                     System.out.println("Enter the second number");
                     double s2=sc.nextDouble();
                     c.getcal(s1,s2);
                 }
             }
         }
         if(sel==3) {
             String yesandno = sc.next();
             boolean cb = c.checkfact(yesandno);

             if (cb) {
                 System.out.println("Select the operation to perform");
                 System.out.println("1.Prime");
                 System.out.println("2.Even/Odd");
                 System.out.println("4.Calculator");
                 int set = sc.nextInt();
                 if (set != 4) {
                     boolean co = c.checking(set);
                     if (co) {
                         System.out.println("Enter the number");
                         int put = sc.nextInt();
                         c.checker(put, set);
                     }
                 }
                 if(set==4){
                     System.out.println("Enter the first number");
                     double p1=sc.nextDouble();
                     System.out.println("Enter the second number");
                     double p2=sc.nextDouble();
                     c.put(p1,p2);
                 }
             }
         }

        }

       boolean valid=c.cal(sel);
       if(valid){
           System.out.println("Enter the first no.");
           double num1=sc.nextDouble();
           System.out.println("Enter the second no.");
           double num2=sc.nextDouble();
            c.check(num1,num2);
           System.out.println("Check the other operations also");
           System.out.println("1.Yes");
           System.out.println("2.No");
           String check=sc.next();
          boolean yes= c.val(check);
          if(yes){
              System.out.println("Select the operation to perform");
              System.out.println("1.Prime");
              System.out.println("2.Even/Odd");
              System.out.println("3.Factorial");
              int select=sc.nextInt();

              boolean val=c.count(select);
              if (val) {
                  System.out.println("Enter the number");
                  int num=sc.nextInt();
                c.calci(select,num);
              }
              }

          }
       }

}



