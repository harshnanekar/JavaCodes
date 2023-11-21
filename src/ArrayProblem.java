public class ArrayProblem {

    public static void main(String[] args) {

        int[] a={16,17,4,3,5,2};

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int max;
                if(a[j]>a[i]){
                    System.out.println(a[j]);
                }else{
                    if(a[i]>=a[j]){

                        max=a[j];
                    }
                }

            }
        }
    }
}
