public class Bird  extends Dog{

    int quantity;
    String cage;
    double foodPerDay;


    public static void main (String[] args){
        Bird bird= new Bird();
        bird.age=1;
        bird.furType="feather";
        bird.type ="";
        bird.weight=0.3;
        bird.breed="Owls";
        bird.cage="Cage free";
        bird.foodPerDay= 4;
        bird.breathing();
        bird.quantity=2;
        System.err.println(" i have "+ bird.quantity+ " "+bird.breed+ " with "+ bird.weight+ ", and "+ bird.furType+ " on it, they are fed " + bird.foodPerDay+ " day and "+ bird.cage
        );

    }
}

