public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color, 4);
    }

    public Dog(String name) {
        this(name, "transparent");
    }

    @Override
    public void speak() {
        System.out.println("Bark!");
    }

    @Override
    public void fly() {
    }
}
