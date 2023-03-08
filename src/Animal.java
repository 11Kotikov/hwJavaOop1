public class Animal {
    private String name;
    private String colour;
    private int legsCount;

    public Animal(String name, String colour, int legsCount) {
        this.name = name;
        this.colour = colour;
        this.legsCount = legsCount;
    }

    public Animal(String name) {
        this("Undefined", "transparent", 0);
    }

    public Animal() {
        this("devil");
    }

    public void speak() {
        System.out.println("Yarr!!");
    }

    public void toGo() {
        System.out.printf("(%s) %s is moving now; \n", getType(), name);
    }

    public void fly() {
        System.out.printf("(%s) %s is flying now; \n", getType(), name);
    }

    public void swim() {
        System.out.printf("(%s) %s is swimming now; \n", getType(), name);
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format(":Animal %s, Name: %s, Colour: %s", this.getType(), this.name, this.colour);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }
}