package animalpackage;

public class Cat extends Animal{
    public void zoneType(){
        System.out.println(" tropical zone");
    }
    public void animalType(){
        System.out.println("amphibians");
    }
    int animalQuantity;

    public static void main(String[]args){
        Cat zoo= new Cat();
        zoo.zoneType();
        zoo.animalType();
        zoo.animalQuantity= 20;


    }
}
