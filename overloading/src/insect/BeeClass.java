package insect;

public class BeeClass extends InsectClass{
   private boolean hasWings;
   private String Breed;

   // Constructor of subclass
    public BeeClass(String name, String color, int nbLegs, int noOfWings) {
        super(name, color, nbLegs, noOfWings);
        System.out.println("++++++++++++");
    }

    public BeeClass() {
    }

   // This is sub class Constructor
    public BeeClass(boolean hasWings, String Breed) {
        System.out.println("in the constructor of Bee Class");
        this.hasWings = hasWings;
        this.Breed = Breed;
    }
    
    public String honeyTypeCollected(String Breed){
        return Breed=="YellowOne"?"Flowers Honey":"CedarHoney";
    }

    
  
   
   
}
