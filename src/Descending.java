public class Descending {

    public static void main(String[] args){
        System.out.println("Descending order of an given array is");
        int [] a =  {5, 2, 8, 7, 1};
        int temp = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i:a){
            System.out.print(i);
        }
    }
}
