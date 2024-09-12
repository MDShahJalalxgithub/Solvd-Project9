enum Animal {
    DOG("Bark", 4),
    CAT("Meow", 4),
    BIRD("Chirp", 2);

    private final String sound;
    private final int legs;

    Animal(String sound, int legs) {
        this.sound = sound;
        this.legs = legs;
    }

    public String getSound() {
        return sound;
    }

    public int getLegs() {
        return legs;
    }

    public String description() {
        return "A " + this.name().toLowerCase() + " has " + legs + " legs and makes a " + sound + " sound.";
    }

    static {
        System.out.println("Animal enum loaded.");
    }
}

public class AnimalExample {
    public static void main(String[] args) {
        for (Animal animal : Animal.values()) {
            System.out.println(animal.description());
        }
    }
}