public class Walrus extends Animal {
    public Walrus(String name, String colour) {
        super(name, colour, 0);
    }
    public Walrus (String name) {
        this (name, "blue-grey");
    }

    @Override
    public void speak() {
        System.out.println("roar");
    }
    @Override
    public void fly() {
    }
}