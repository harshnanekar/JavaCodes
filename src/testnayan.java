public class testnayan {

    public static void main(String[] args) {
        int[] a={5,1,2,3,1,2};

        String num="";
        for(int i=0;i< a.length;i++){
             int count=1;
            if(!num.contains(""+String.valueOf(a[i]))){
                for(int j=i+1;j<a.length;j++){
                    int am=Integer.parseInt(String.valueOf(a[i]));
                    if(am==a[j]){
                        num=num+String.valueOf(a[i]);
                        count++;
                    }
                }
                if(count>1){
                    System.out.println(a[i]);
                }
            }

        }
    }
}
