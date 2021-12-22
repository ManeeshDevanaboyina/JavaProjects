
package interfaceexample;

public class MSISClass implements DepartmentInterface {
     private int noOfStudents;
    private int noOfSections;
    private String courseName;
    //default const
    public MSISClass() {
        System.out.println("MSIS class default const");
    }
    
    //paramterized const
    public MSISClass(int noOfStudents, int noOfSections, String courseName) {
        System.out.println("MSIS class paramterized const");
        this.noOfStudents = noOfStudents;
        this.noOfSections = noOfSections;
        this.courseName = courseName;
    }
    //abstract method
    @Override
    public int noOfStudentsPerSection(){
        return (int) this.noOfStudents/this.noOfSections;
    } 
    
     //abstract method
    @Override
    public int noOfSections(){
        return (int) this.noOfStudents/this.noOfSections;
    } 
}
