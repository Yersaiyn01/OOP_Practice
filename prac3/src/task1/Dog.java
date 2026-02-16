package task1;
public class Dog extends Animal {

    private String breed;

    public Dog(String breed) {
        super();
        this.breed = breed;
        System.out.println("Dog no-arg super constructor used");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("Dog parameterized super constructor used");
    }

    public String makeSound() {
        return "Woof! Woof!";
    }

    public String makeSound(int volume) {
        String parentVersion = super.makeSound(volume);
        return parentVersion + " ... but actually: " + makeSound() + "!!!";
    }

    public String toString() {
        return "Dog [breed=" + breed + "] → " + super.toString();
    }
}