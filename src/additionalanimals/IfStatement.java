package additionalanimals;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please wright a day of the week:");
        String dayOfTheWeek = scanner.nextLine();

        if(dayOfTheWeek.equalsIgnoreCase("Monday")){
            System.out.println("Happy Monday!");

        }
        else if (dayOfTheWeek.equalsIgnoreCase("Tuesday")){
            System.out.println(" Happy Tuesday");
        }
        else if(dayOfTheWeek.equalsIgnoreCase("Friday")){
            System.out.println("Happy friday");
        }
        else if (dayOfTheWeek.equalsIgnoreCase("Saturday")|| dayOfTheWeek.equalsIgnoreCase("Sunday")){
            System.out.println("happy weekend. lets party ");
        }
        else {
            System.out.println(" there is no such day of the week ");
        }





    }
}
