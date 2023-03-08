public class Wolf extends Animal {
    public Wolf(String name, String colour) {
        super(name, colour, 4);
    }

    public Wolf(String name) {
        this(name, "grey");
    }

    @Override
    public void speak() {
        System.out.println("A-u-u-u-f");
    }

    @Override
    public void swim() {
    }

    @Override
    public void fly() {
    }
}
