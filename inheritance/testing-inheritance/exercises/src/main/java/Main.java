public class Main {
    public static void main(String[] args) {
        Cat basedCat = new Cat();
        HouseCat garfield = new HouseCat("Garfield",15);

        System.out.println(garfield.getFamily());

        garfield.sleep();
        garfield.eat();

        System.out.println(garfield.isSatisfied());

        garfield.eat();

        System.out.println(garfield.getName() + " is satisfied? " + garfield.isSatisfied());

        HouseCat lebowski = new HouseCat("Lebowski", 12, true);

        System.out.println(lebowski.getName() + " is hungry? " + lebowski.isHungry() +
                "\n" + lebowski.getName() + " is always hungry.");

        HouseCat ninePoundCat = new HouseCat();

        System.out.println(ninePoundCat.getName() + " weighs " + ninePoundCat.getWeight() + " lbs.");

        // Method overriding example
        System.out.println(basedCat.noise()); // Base class Cat's .noise() method
        System.out.println(lebowski.noise()); // Subclass HouseCat .noise() method

        HouseCat chonkers = new HouseCat("Chonkers", 24.0);
        System.out.println(chonkers.noise()); // Subclass overrides .noise() method calls super.noise() if HouseCat.name equals "Chonkers"

    }
}
