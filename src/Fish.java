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
        System.out.println(" i'm " + fish.hubitat+ " and "+ fish.type+" my age is "+ fish.age+ " and weight "+ fish.weight );


    }

    @Override
    public void consumingFood(){
        System.out.println("i prefer Fish flakes only");
    }


}
