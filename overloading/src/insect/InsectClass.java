package insect;

public class InsectClass {

    protected String name;
    private String color;
    private int noOfLegs;
    private int noOfWings;

    public InsectClass(String name, String color, int nbLegs, int noOfWings) {
        System.out.println("in the constructor of Insect Class");
        this.name = name;
        this.color = color;
        noOfLegs = nbLegs;
        this.noOfWings = noOfWings;
    }

    public InsectClass() {
        System.out.println("Construtor with no org in insect Class");
    }

   // overloading
   public void displayNoofLegs(int nbLegs){
       System.out.println("number of legs: "+ nbLegs);
   }
    
   public void displayNoofLegs(int nbLegs, int noOfWings){
       System.out.println("number of legs: "+ nbLegs);
   }
    

}
