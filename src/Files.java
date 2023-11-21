import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Files {

    public static void main(String[] args) throws IOException {

        /*FileOutputStreams
      FileOutputStream file=new FileOutputStream("D:\\file.txt");
        int a=90;
        char ch='a';
        String s="This is FileOutputStream";
        byte b[]=s.getBytes();
        file.write(b);
        file.close();
        System.out.println("File inserted successfully");*/

       /*FileInputStream
        FileInputStream file=new FileInputStream("D:\\file.txt");
      int i=0;
      int m=4;
     file.skip(4);
       while((i=file.read())!=-1){
           System.out.print((char)i);
       }*/

       /* BufferedOutputStrem
        FileOutputStream file=new FileOutputStream("D:\\file.txt");
        BufferedOutputStream buff=new BufferedOutputStream(file);
        String s="Hello , I am harsh";
        byte b[]=s.getBytes();
        buff.write(b);
        buff.flush();
        System.out.println("File uploaded");
        buff.close();
        file.close();*/

        //BufferedInputStream
      /*  FileInputStream file=new FileInputStream("D:\\file.txt");
        BufferedInputStream buff=new BufferedInputStream(file);
        int i=0;
        while((i=buff.read())!=-1){
            System.out.print((char)i);
        }
        System.out.println((char)buff.read());
        System.out.println((char)buff.read());
        System.out.println((char)buff.read());
        System.out.println((char)buff.read());
        buff.mark(0);
        System.out.println((char)buff.read());
        buff.reset();
        System.out.println((char)buff.read());
        System.out.println((char)buff.read());


        buff.close();
        file.close();
*/
        int [] ar={3,4,6,2,89,11};
        List<Integer> li=new ArrayList<>();

        for(int i=0;i<ar.length;i++){
            li.add(ar[i]);
        }
        System.out.println(li);
        Iterator<Integer>  i=li.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
