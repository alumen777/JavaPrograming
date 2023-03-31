package basicJava;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        // data storage, can store any type of data

        String []templates = new String[4];
        templates [0] = "Roundups";
        templates [1] = "Review";
        templates [2] = "FPR";
        templates [3] = "CC";

        System.out.println(templates[3]);

        //another type

        String []template = {"Roundups", "Review","FPR","CC"};

        int [] templates1 ={27,8,9,5,6,};
        System.out.println(templates1[2]);

        //Array List - dont work with primitives
        ArrayList <String> listOfTemplates = new ArrayList<>(Arrays.asList("Roundups","Review","FPR","CC"));

        // print array value with index 0

        System.out.println(listOfTemplates.get(0));
        //add anothe value to Arrey list
        listOfTemplates.add(0,"List SC");
        System.out.println("add method " + listOfTemplates.get(0));

        // if we dont have index mentioned, the new value will be added to the end of the list
        listOfTemplates.add("SC");

        // remove
        listOfTemplates.remove(0);
        System.out.println("remove method " +listOfTemplates.get(0));
        listOfTemplates.remove("CC");


        // print all
        for ( String template2 : listOfTemplates){
            System.out.println(template2);
        }
        // size

        System.out.println(listOfTemplates.size());

        // contains - boolean type
        System.out.println( listOfTemplates.contains("CC"));


    }
}
