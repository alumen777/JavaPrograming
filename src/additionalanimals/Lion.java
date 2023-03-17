package additionalanimals;

public class Lion extends AbstractAnimal{

    @Override
    public void move() {
        System.out.println(" lion is moving ");
    }

    @Override
    public void eat() {
        System.out.println(" Lion is eating");
    }
    public static void main (String[]args){
        Lion lion =new Lion();
        lion.move();
        lion.eat();

    }

    public static class ifStatmentHW {
    }
}
