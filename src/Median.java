public class Median {
    public static void main(String[] args) {

        int []median={45,23,98,11,36,78,64};
        int temp=0;
        int total;
        for(int i=0;i<median.length;i++){
            for(int j=i+1;j<median.length;j++){
                if(median[i]>median[j]){
                    temp=median[i];
                    median[i]=median[j];
                    median[j]=temp;
                }
            }

        }
        int i;
        for( i=0;i<median.length;i++){
            System.out.println(median[i]);
        }
        if(median.length%2!=0){
            total=(median.length+1)/2;
        }else {
            total=(median.length/2 + (median.length+1)/(2-1))/2;

        }
        System.out.println("Median: " + total);

    }
}
