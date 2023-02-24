package additionalanimals;

import animalpackage.Animal;

public class Cow extends Animal {

    public static void main(String[]args){

        Cow cow= new Cow();
        cow.breathing();
        cow.consumingFood();
        cow.animalType();
        cow.age =10;
        cow.type="cow";
        cow.breathing("15 breath per minute");
        cow.animalType("domesticated animal");

    }
@Override
 public void consumingFood(){
        System.out.println("Not today ");
    }
    public void breathing(String breathingRate){
        System.out.println("My number of breath is " + breathingRate);
    }
    public void animalType(String str){
        System.out.println( "Consider me as a " +str);
    }

}
