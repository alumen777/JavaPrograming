package additionalanimals;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {


        int a =19;
        boolean bool=true;
        String name ="My name is Andrii";
       // equals method returns true ot false
        // name.equals("My name is Andrii");

        System.err.println(name.equals("My name is Andrii"));
        System.err.println(name.equalsIgnoreCase("My name is andrii"));
       //if String starts with specific characters
        //name.startsWith()
        System.err.println(name.startsWith("M"));
        // endsWIth
        //toUpperCase
        System.out.println(name.toUpperCase());
        //toLowerCase
        System.out.println(name.toLowerCase());
        //replace
        System.out.println(name.replace('m','d'));

        // trim
        name.trim().equalsIgnoreCase("My name is Andrii");
        //name.isEmpty() be carefull with spacing
        System.out.println(name.isEmpty());
        // isBlank
        System.out.println( name.isBlank());
        System.out.println(name.contains("andrii"));
        //replace
        System.out.println( name.replace(" ",""));
        // name.substring()

        System.err.println(name.substring(1,5));

        //



    }
}
