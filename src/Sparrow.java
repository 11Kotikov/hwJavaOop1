public class Sparrow extends Animal {
    public Sparrow(String name, String color) {
        super(name, color, 2);
    }

    public Sparrow(String name) {
        this(name, "brown-grey");
    }

    @Override
    public void speak() {
        System.out.println("tweet-tweet");
    }

    @Override
    public void swim() {
    }
}

