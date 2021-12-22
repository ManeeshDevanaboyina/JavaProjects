
package abstractexample;

// sub class
public class MSISClass extends DepartmentAbstarctClass{
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

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public int getNoOfSections() {
        return noOfSections;
    }
    //abstract method
    @Override
    public void courseAssign(String courseName){
        if(this.courseName==courseName){
            System.out.println(courseName+" included in department");
        }
        else{
            System.out.println("course is not included in department"); 
        }
    } 

}
