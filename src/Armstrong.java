public class Armstrong {

    public static void main(String[] args) {
        Armstrong a=new Armstrong();
        int ab=153;
        a.armstrong(ab);
    }

    public void armstrong(int ab) {
        int temp=ab;
        int total=0;
        while(temp>0){
            int q=temp%10;
            total=total+q*q*q;
            temp=temp/10;
        }
        if(total==ab){
            System.out.println("Armstrong no.");
        }else{
            System.out.println("It is not armstrong no.");
        }

    }
}
