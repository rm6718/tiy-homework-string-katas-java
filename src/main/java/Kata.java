/**
 * Created by sam on 10/17/16.
 */
public class Kata {

    public static void main(String[] args) {
        explode("example");
        notstring("happening");
        missingChar("puppy", 3);
        frontBack("chocolate");
        frontThree("birthday");
        backAround("dog");
        front22("lazy");
        delDel("adelete");
        startOz("ozymandias");
        endUp("hi there");
    }


    // a public static method that doesn't return anything called explode
    public static void explode(String data) {
        System.out.print("Kata.explode(\"" + data + "\") -> ");
        System.out.print("\"");
        // work

        //created a reference called letters of type charArray
        char[] letters = data.toCharArray();


        //assign an integer of a value of 0; if the integer number is less than the numbers of letters it will go through the loop;  i++ = incrementing by steps of 1;
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
            // as long as the length is not in the last element then print out a space
            if (letters.length != i + 1) {
                System.out.print(" ");
            }
        }
        System.out.print("\"");
    }


    public static void notstring(String data) {
        System.out.print("\nKata.notstring(\"" + data + "\") -> ");

        if (data.startsWith("not")) {
            System.out.print(data);
        } else {
            System.out.print("\"not " + data);
        }
        System.out.print("\"");
    }


    public static void missingChar(String data, int pos) {
        System.out.print("\nKata.missingChar(\"" + data + "," + pos + "\") -> ");
        System.out.print("\"");

        System.out.print(removeCharAt(data, 0));

        System.out.print("\"");
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }


    public static void frontBack(String data) {
        System.out.print("\nKata.frontBack(\"" + data + "\") -> ");
        System.out.print("\"");

        int fB = data.length();

        if (fB > 1) {
            System.out.print(data.charAt(fB - 1) + data.substring(1, fB - 1) + data.charAt(0));
        }
        System.out.print("\"");
    }


    public static void frontThree(String data) {
        System.out.print("\nKata.front3(\"" + data + "\") -> ");
        System.out.print("\"");

        int f3 = data.length();

        if (f3 >= 3) {
            System.out.print(data.substring(0, 3));
            System.out.print(data.substring(0, 3));
            System.out.print(data.substring(0, 3));
        } else {
            System.out.print(data);
        }
        System.out.print("\"");
    }


    public static void backAround(String data) {
        System.out.print("\nKata.backAround(\"" + data + "\") -> ");
        System.out.print("\"");

        int bA = data.length();

        if (bA >= 1) {
            System.out.print(data.charAt(bA - 1) + data.substring(0, bA) + data.charAt(bA - 1));
        }
        System.out.print("\"");
    }


    public static void front22(String data) {
        System.out.print("\nKata.front22(\"" + data + "\") -> ");
        System.out.print("\"");

        int f22 = data.length();

        if (f22 >= 2) {
            System.out.print(data.substring(0, 2) + data.substring(0, f22) + data.substring(0, 2));
        } else {
            System.out.print(data.charAt(0) + data.substring(0, f22) + data.charAt(0));
        }
        System.out.print("\"");
    }


    public static void delDel(String data) {
        System.out.print("\nKata.delDel(\"" + data + "\") -> ");
        System.out.print("\"");

        int dD = data.length();

        if (data.substring(1, 4).equalsIgnoreCase("del")) {
            System.out.print(data.charAt(0) + data.substring(4, dD));
        } else {
            System.out.print(data);
        }
        System.out.print("\"");
    }



    // not working yet

    public static void startOz(String data) {
        System.out.print("\nKata.startOz(\"" + data + "\") -> ");
        System.out.print("\"");

        int sO = data.length();

        if (sO >= 1 && data.charAt(0) == "o") {

        }

    }


    public static void endUp(String data) {
        System.out.print("\nKata.endUp(\"" + data + "\") -> ");
        System.out.print("\"");

        int eU = data.length();
        int up = data.length() - 3;
        String uC = data.substring(up, eU).toUpperCase();

        if (eU >= 3) {
            System.out.print(data.substring(0, up) + uC);
        } else {
            System.out.print(data.toUpperCase());
        }
    }
}