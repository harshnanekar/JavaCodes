import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Stack {


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Stack s=new Stack();
     //  s.opt(sc);
        Integer[] ar={4,5,3};
       List<Integer> li=new ArrayList<>();
       li.add(3);
       li.add(5);
       li.add(65);
       li.add(76);
       li.add(23);
       //Collections.rotate(li,4);
      Collections.addAll(li,ar);
        System.out.println(li);

        System.out.println(li);
    }

    private void opt(Scanner sc) {
        java.util.Stack<String> stack=new java.util.Stack<>();
        System.out.println("Stack is empty or not " + stack.isEmpty());

        if(stack.isEmpty()==true){
            System.out.println("Enter the size for stack");
            int num=sc.nextInt();

            for(int i=1;i<=num;i++){
                System.out.println("Enter the value");
                String name=sc.next();
                stack.push(name);
            }
            System.out.println("values added in stack");

            System.out.println("Enter the number to pop th stack");
            int po=sc.nextInt();

            for(int i=1;i<=po;i++){
                stack.pop();
            }
            Collections.sort(stack,Collections.reverseOrder());
            System.out.println("Stack Elemnts are " + stack);


            System.out.println("is the stack empty ? " + stack.isEmpty());

        }
    }


    }

