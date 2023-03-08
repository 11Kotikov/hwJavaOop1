public class Duck extends Animal {
    public Duck(String name, String color) {
        super(name, color, 2);
    }

    public Duck(String name) {
        this(name, "transparent");
    }

    @Override
    public void speak() {
        System.out.println("quack!");
    }

}
