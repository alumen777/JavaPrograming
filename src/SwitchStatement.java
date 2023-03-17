import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        System.out.println(" What is your input?  ");
        String value = s.nextLine();


        switch (value) {
            case "one":
                System.out.println(" the number is one");
                break;
            case " two":
                System.out.println("the number is two");
                break;
            default:
                System.out.println(" Number was not one or two ");
        }


    }
}
