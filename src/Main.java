import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Cozy"));
        animals.add(new Dog("Mailo"));
        animals.add(new Triton("Slytherin", "red"));
        animals.add(new Walrus("Einstein"));
        animals.add(new Duck("Gerda"));
        animals.add(new Shark("Toothy"));
        animals.add(new Sparrow("Jack"));
        animals.add(new Wolf("Akela"));

        for (Animal animal : animals) animal.speak();
        System.out.println();
        for (Animal animal : animals) animal.toGo();
        System.out.println();
        for (Animal animal : animals) animal.fly();
        System.out.println();
        for (Animal animal : animals) animal.swim();
        System.out.println();

    }
}