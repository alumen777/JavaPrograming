public class Dog extends Animal{
    String breed;
    String furType;
    public void barks(){
        System.out.println("Dog is barking");
    }
    public void goingForWalk(){
        System.out.println(" I am digester i like going for a walk ");
    }
@Override
public void breathing(){
    System.out.println("i am dog and i'm breathing fresh air");
}

    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.age=5;
        animal.weight=7.9;
        animal.type="dog";

        animal.breathing();
        animal.consumingFood();

        System.out.println("This animal age is " + animal.age + " years");

        Dog dog= new Dog();
        dog.breathing();
        dog.barks();
        dog.age=2;
        dog.weight=63.5;
        dog.breed= "shepherd";
        dog.furType=" long-coated";
        dog.type="service dog";
        dog.goingForWalk();

        System.err.println(" we got ourselves a "+ dog.breed+", he is "+ dog.age+ " years old and"+ dog.furType+ ", and a good "+ dog.type);

    }
}
