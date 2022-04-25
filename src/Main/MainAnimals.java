package Main;
import Animals.Animal;
import Animals.Tiger ;
public class MainAnimals {
    public static void main(String[] args) {
        Animal anm = new Tiger();
        anm.run();
        anm.eat();
        anm.sleep();
    }
}
