public class Cat extends Animal {
    public Cat(String name, String colour) {
        super (name, colour, 4);
    }
    public Cat (String name) {
        this(name, "transparent");
    }

    @Override
    public void speak() {
        System.out.println("meow");;
    }

    @Override
    public void fly() {
    }

    @Override
    public void swim() {
    }
}
