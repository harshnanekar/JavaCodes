import java.util.*;

public class Hashmap {

    public static void main(String[] args) {

     HashMap<Character,Integer> hash=new HashMap<>();
       hash.put('a',5);
       hash.put('b',89);
       hash.put('c',65);
       hash.put('d',21);

       Iterator<Map.Entry<Character, Integer>> i=hash.entrySet().iterator();
       while(i.hasNext()){
           System.out.println(i.next());
       }

     /*    HashMap<Character,Integer> hashs=new HashMap<>();

       hashs.put('z',22);
       hashs.put('x',12);
       hashs.put('v',11);
        System.out.println(hashs.containsValue(11));
        System.out.println(hashs.containsKey('x'));
        System.out.println(hash.getOrDefault('c',45));
        System.out.println(hash.putIfAbsent('m',00));
        hash.replace('m',23);
        hash.replaceAll((key,value)-> (value + value));
        hash.compute('d',(key,val)-> val*val);
        hash.computeIfAbsent('s',k-> 34);
        hash.clear();
        System.out.println(hashs.keySet());
       hash.putAll(hashs);
        System.out.println(hash);
        for(Map.Entry m:hashs.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
*/
        //Problem-1
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size for hashmap");
        int num=sc.nextInt();

        HashMap<Integer,String> hash=new HashMap<>();
        for(int i=0;i<num;i++){
            System.out.println("Enter the key");
            int key=sc.nextInt();
            System.out.println("Enter the value");
            String value=sc.next();
            hash.put(key,value);
        }
        System.out.println("Enter the key to find");
        int fkey=sc.nextInt();
           System.out.println(hash.getOrDefault(fkey,"-1"));*/
/*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=0;
        int smax=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]>smax && max!=arr[i]){
                smax=arr[i];
            }
        }
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]>smax && max!=arr[i]){
//                smax=arr[i];
//            }
//        }

        System.out.println("the max is "+max);
        System.out.println("Second max " + smax);

        int smin=arr[0];

     for(int i=0;i< arr.length;i++){
         if(min>=arr[i]){
             min=arr[i];
         }
     }
        for(int i=0;i< arr.length;i++){
            if(smin>=arr[i] && min!=arr[i]){
                smin=arr[i];
            }
        }
        System.out.println("the min is "+min);
        System.out.println("Second min " + smin);*/
    }
}
