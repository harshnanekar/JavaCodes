import java.util.Scanner;

public class Happy1 {

    private void happy(int num) {
        int temp = num;
        int total = 0;
        boolean val = false;

        while (temp > 0) {
            int q = temp % 10;
            total = total + q * q;

            temp = temp / 10;
            if (total == 1) {
                val = true;
                break;
            }

        }
        temp = total;
        happy(temp);
        if (val == true) {
            System.out.println("It is a happy number");
        } else {
            System.out.println("Its not happy");
        }

    }

    public static void main(String[] args) {
        Happy1 h = new Happy1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        h.happy(num);
    }

}