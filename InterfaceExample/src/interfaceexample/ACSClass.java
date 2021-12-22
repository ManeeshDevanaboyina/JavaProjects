
package interfaceexample;

public class ACSClass implements DepartmentInterface {
    private int noOfStudents;
    private int noOfSections;
    private String courseName;
    
    //default const
    public ACSClass() {
        System.out.println("ACS class default const");
    }
    
    //paramterized const
    public ACSClass(int noOfStudents, int noOfSections, String courseName) {
        System.out.println("ACs parameterized const");
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
