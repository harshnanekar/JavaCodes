import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*System.out.println("Enter the string");
       String ij=sc.next();
       char[] ch=ij.toCharArray();
       String k="";
       char chars = 0;
       int max=0;
       int smax=0;;
       for(int i=0;i<ch.length;i++){
           int count=1;
           if(!k.contains(""+ch[i])){
               for(int j=i+1;j< ch.length;j++){
                   if(ch[i]==ch[j]){
                       count++;
                       k=k+ch[i];
                   }
               }
               if(count>max){
                   max=count;
                  // chars=ch[i];
               }
               if(count>smax && count!=max){
                  smax=count;
                   chars=ch[i];
               }
              
           }
       }
        System.out.println("Maximum character is " + chars + " with repeated number " + smax);
    */
     /*  String j=new String("harsh");
        System.out.println(i.equals(j));*/
/*
        int[] ar={3,4,2,1,34,5};
        int temp=0;
        int n=4;
        for(int i=0;i< ar.length;i++){
            if(n>0) {
                for (int j = i + 1; j < ar.length; j++) {
                  temp=ar[i];
                  ar[i]=ar[j];
                   ar[j]=temp;
                }
                n--;
            }
        }
        System.out.println(Arrays.toString(ar));*/

        //Rotate Array
       /*ArrayList<Integer> ar=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();
        ArrayList<Integer> ar3=new ArrayList<>();
       ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        int n=5;

           for(int j=0;j<ar.size();j++){
            if(j<n){
                ar2.add(ar.get(j));
            }else {
                ar3.add(ar.get(j));
            }
           }
       ar3.addAll(ar2);
        System.out.println(ar3);
*/


       /* ArrayList<Integer> a=new ArrayList<>();
        a.add(34);
        a.add(14);
        a.add(34);
        a.add(3);
        a.add(21);
        a.add(21);
        System.out.println(a);
        Practice p=new Practice();
        p.arr(sc,p,a);*/
    //    p.update(sc,p);
      //  p.hash(p,sc);
        //p.removedup(p,a);
      //  System.out.println("Enter the number");
        //int num=sc.nextInt();
        //p.removes(a,num);

    }

    private void arr(Scanner sc, Practice p,ArrayList<Integer> a) {
        ArrayList<Integer> ar=new ArrayList<>();
        int tem=0;
        for(int i=0;i<a.size();i++){
            int as= a.get(i);
            for(int j=i+1;j<a.size();j++){

                int bs=a.get(j);
                if(as<bs) {
                    tem = as;
                    as = bs;
                    bs = tem;
                }
            }
        }
        System.out.println(a);
    }

   /* private void update(Scanner sc, Practice p) {
        HashMap<Integer,String> hash=new HashMap<Integer,String>();
        hash.put(4,"harsh");
        hash.put(6,"nanekar");
        hash.put(113,"vishal");
        hash.put(18,"nayan");
        System.out.println(hash);
        System.out.println("Enter the 1st key to find value");
        int keys=sc.nextInt();
        String name=sc.next();
       // System.out.println("Enter the 2nd key to update");
        //int key=sc.nextInt();
      HashMap<Integer,String> a=new HashMap<>();
       /*   for(Map.Entry e : hash.entrySet()){
            int num=(int) e.getKey();
            String s=(String)e.getValue();
            if(num>=keys && num<=key){
                a.put(num,s);
            }
        }*/
      //  hash.computeIfAbsent(keys,val-> "Nayan");

     /*  for(Map.Entry e:hash.entrySet()){
          //  int num=(int)e.getKey();
            String n=(String)e.getValue();
           if(name.contains(n)){
               System.out.println( e.getKey() + "" + e .getValue());
           }
        }
        System.out.println(hash);
        HashMap<Integer,String> ha=new HashMap<>();
        ha= (HashMap<Integer, String>) hash.clone();
        System.out.println(ha);
        ha.clear();
        System.out.println(ha);
    }*/
  /*  private void hash(Practice p, Scanner sc) {

        HashMap<Integer,String> hash=new HashMap<Integer,String>();
        hash.put(4,"harsh");
        hash.put(6,"nanekar");
        hash.put(113,"vishal");
        hash.put(18,"nayan");
        HashMap<Integer,String> a=new HashMap<>();
        HashMap<Integer,String> ae=new HashMap<>();
        HashMap<Integer,String> as=new HashMap<>();
        System.out.println("Enter the 1 key");
        int keys=sc.nextInt();


        for(Map.Entry e:hash.entrySet()){
            int num=(int)e.getKey();
            String fet=(String) e.getValue();
            if(num >= keys){
              a.put(num,fet);
            }
        }
        System.out.println("Hashmap " + hash);
        System.out.println("Map" + a );

    }*/

   /* private void removedup(Practice p,ArrayList<Integer> ns) {
       ArrayList<Integer> ar=new ArrayList<>();
       /*  for(int i=0;i<ns.size();i++){
            if(!ar.contains(ns.get(i))){
                ar.add(ns.get(i));
            }
        }
        System.out.println("original " + ns);
        System.out.println(" duplicate removed " + ar);*/
     /*   for(int i=0;i<ns.size();i++){
            if(ns.get(i)%2==0){
               ar.add(ns.get(i));
            }
        }
        System.out.println("Sorted Even " + ar);
    }*/

  /*  private void removes(ArrayList<Integer> a,int num) {

        for(int i=0;i<a.size();i++){
            if(num==a.get(i)){
                a.remove(num);
            }
        }
        System.out.println(a);*/
    }
