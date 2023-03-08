public class Shark extends Animal {
    public Shark(String name, String colour) {
        super(name, colour, 0);
    }

    public Shark(String name) {
        this(name, "blue-grey");
    }

    @Override
    public void speak() {
        System.out.println("'scary bubbles sound'");
    }

    @Override
    public void toGo() {
    }

    @Override
    public void fly() {
    }
}

