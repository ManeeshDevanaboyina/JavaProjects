package overrideexample;

public class BeeClass extends InsectClass {

    private boolean hasWings;
    private String Breed;

    // super class constructor
    public BeeClass(String name, String color, int nbLegs, int noOfWings) {
        super(name, color, nbLegs, noOfWings);
    }
    
    public BeeClass() {
    }

    // This is sub class Constructor
    public BeeClass(boolean hasWings, String Breed) {
        System.out.println("in the constructor of Bee Class");
        this.hasWings = hasWings;
        this.Breed = Breed;
    }

   

    public boolean canSting(String name) {
        System.out.println("we are in subClass");
        return name == "Bee" ? true : false;
    }

}
