package basicJava;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        // swich can use these data types: byte, short, int, char, String, enum

        Scanner s = new Scanner(System.in);
        System.out.println(" What is your input?  ");
        String value = s.nextLine();


        switch (value) {
            case "one":
                System.out.println(" the number is one");
                break;
            case " two":
            case "three":
            case "four":
                System.out.println("the number is " + value);
                break;
            default:
                System.out.println(" Number was not 1,2,3 or 4");

        }

        System.out.println(" What is month? ");
        String month = s.nextLine();
        System.out.println(" checking month that you provided and " + springOrSummerMonth(month));



    }

    public static String springOrSummerMonth(String month) {
        switch (month) {
            case "March":
            case "April":
            case "May":
                return "it is a Spring month ";
            case "June":
            case "July":
            case "August":
                return " it's sSummer month ";
            case "October":
            case "September":
            case "November":
                return " it's fall dude ";
        }
        return " it's not spring, summer or fall month ";
    }

}
