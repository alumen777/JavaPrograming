package basicJava;

public class LoopStatement {

    // for loop - when you are iterating over set of values
    // while - is  iterating  until specific condition becomes false
    // do while - executes at least one iteration and then iterating until specific condition becomes false
    //

    public static void main(String[] args) {

        for (int count = 0; count < 5; count++) {
            System.out.println( count);
        }
        for (int count = 0; count <= 10; count+=2) {
            System.out.println( " SECOND LOOP " + count);
        }


    }

}
