/**
 * Created by sam on 10/17/16.
 */
public class Kata {

    public static void main(String[] args) {
        explode("example");
        notstring("happening");
        missingChar("puppy", 3);
    }





    // a public static method that doesn't return anything called explode
    public static void explode(String data){
        System.out.print("Kata.explode(\""+data+"\") -> ");
        System.out.print("\"");
        // work

        //created a reference called letters of type charArray
        char[] letters = data.toCharArray();
       // String delete = data.replaceAll("\\s+$", "");



        //assign an integer of a value of 0; if the integer number is less than the numbers of letters it will go through the loop;  i++ = incrementing by steps of 1;
        for(int i=0; i<letters.length; i++){
            System.out.print(letters[i]);
            // as long as the length is not in the last element then print out a space
            if(letters.length!=i+1) {
                System.out.print(" ");
            }
          //  System.out.print(delete);

        }

        System.out.print("\"");

    }






    public static void notstring(String data){
        System.out.print("\nKata.notstring(\""+data+"\") -> ");

        if (data.startsWith("not")){
            System.out.print(data);
        } else {
            System.out.print("\"not " + data);
        }
        System.out.print("\"");
    }





    public static void missingChar(String data, int pos){
        System.out.print("\nKata.missingChar(\""+data+","+pos+"\") -> ");

        System.out.print(removeCharAt(data, 0));

        System.out.print("\"");
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }






    public static void frontBack(String data){
        System.out.print("\nKata.frontBack(\'"+data+"\") -> ");



    }

    }




    }