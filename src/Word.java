public class Word {

    public static void main(String[] args) {
        String s1 = "Java is a good programing language but Java is hard to study";
        String[] str =s1.split("");
        String k = "";
int  counter=0;

//Number of occurrences of word in a String
       /* for (int i = 0; i < str.length; i++) {
            int counter = 1;
            if (!k.contains("" + str[i])) {
                for (int j = i + 1; j < str.length; j++) {
                    if (str[i].equals(str[j])) {
                        counter++;
                        k = k + str[i];
                    }
                }
                System.out.println(str[i] + "---->" + counter);
            }
*/

        //Number of occurrences of whitespaces in a string
        for(int i=0;i< str.length;i++){
            if (str[i].equals(" ")) {
            counter++;
            }
        }
       System.out.println("The number of spaces in a string are " + counter );


    }
    }


