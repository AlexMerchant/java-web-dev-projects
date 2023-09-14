public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    // Added second subclass constructor to test using super() to target a different base class constructor based on the arguments passed to the super()
    public HouseCat(String aName, double aWeight, boolean isHungry) {
        super(aWeight, isHungry);
        name = aName;
    }

    public HouseCat() {
        name = "Nine-Pound Cat";
    }

    public String getName() {
        return this.name;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        if(name.equals("Chonkers")) {
            return super.noise();
        }
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}