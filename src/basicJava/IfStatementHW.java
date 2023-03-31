package basicJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatementHW {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" How many pizzas you'd like to buy?");

        int pizzaQuantity  = scanner.nextInt();
        System.out.println(" Would yo like to get cola or sprite today?");
        String s =scanner.nextLine();
         String SodaType = scanner.nextLine();


         if( pizzaQuantity<=2 && pizzaQuantity>0 ){
             System.out.println(" Regular pizza price ");
         } else if  (pizzaQuantity>=3 && SodaType.equalsIgnoreCase("cola" )|| pizzaQuantity>=4 && SodaType.equalsIgnoreCase("cola" )){
             System.out.println(" you get 5% discount and " + SodaType +" for free");
        } else if (pizzaQuantity>=3 && SodaType.equalsIgnoreCase("no")|| pizzaQuantity>=4 && SodaType.equalsIgnoreCase("no")) {
            System.out.println("you get 5% discount today and coupon for next drink ");
        } else if (pizzaQuantity>=3 && SodaType.equalsIgnoreCase("sprite" )|| pizzaQuantity>=4 && SodaType.equalsIgnoreCase("sprite" )){
             System.out.println(" you get 5% discount and " + SodaType +" for free");
         }else{
             System.out.println( " we are working on your order");
         }

    }
}
