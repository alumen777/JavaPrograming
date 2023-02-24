package animalpackage;

public class Fish extends Animal{

    String hubitat;


    public static void main(String[]args){
        Fish fish =new Fish();
        fish.type="bony fish";
        fish.age= 1;
        fish.weight=0.3;
        fish.breathing();
        fish.consumingFood();
        fish.hubitat="freshwater";
        System.out.println("I'm " + fish.hubitat+ " and "+ fish.type+" \nMy age is "+ fish.age+ " and weight is "+ fish.weight );

        fish.consumingFood("algae");
    }

    @Override
    public void consumingFood(){
        System.out.println("i prefer Fish flakes only");
    }
    public void consumingFood(String food){
        System.out.println("When i'm hungry, i'm ok to eat " +food);
    }


}
