/**
 * Created by sam on 10/17/16.
 */
public class Kata {

    public static void main(String[] args) {
        explode("example");
        notstring("happening");
        missingChar("puppy", 3);
    }




    //need to figure out how to get rid of the trailing space

    public static void explode(String data){
        System.out.print("Kata.explode(\""+data+"\") -> ");
        System.out.print("\"");
        // work
        char[] letters = data.toCharArray();
       // String delete = data.replaceAll("\\s+$", "");


        /*System.out.print(letters.length);*/

        for(int i=0; i<letters.length; i++){
            System.out.print(letters[i]);
            System.out.print(" ");
          //  System.out.print(delete);

        }

        System.out.print("\"");

    }





    //this works do not TOUCH

    public static void notstring(String data){
        System.out.print("\nKata.notstring(\""+data+"\") -> ");


        System.out.print("\"not " +data);

        System.out.print("\"");
    }




    //works, DON'T TOUCH

    public static void missingChar(String data, int pos){
        System.out.print("\nKata.missingChar(\""+data+","+pos+"\") -> ");


        System.out.print(removeCharAt(data, 0));

        System.out.print("\"");
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }



    }
