import org.w3c.dom.ls.LSOutput;

public class Zoo extends Bird{
    public void zoneType(){
        System.out.println(" tropical zone");
    }
    public void animalType(){
        System.out.println("amphibians");
    }
    int animalQuantity;

    public static void main(String[]args){
        Zoo zoo= new Zoo();
        zoo.zoneType();
        zoo.animalType();
        zoo.animalQuantity= 20;
        zoo.foodPerDay=30;

    }
}
