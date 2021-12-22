
package abstractexample;

// sub class
public class ACSClass extends DepartmentAbstarctClass {

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

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public int getNoOfSections() {
        return noOfSections;
    }
    //abstract method
    public void courseAssign(String courseName){
        if(this.courseName==courseName){
            System.out.println("course included in department");
        }
        else{
            System.out.println("course is not included in department"); 
        }
    } 
    
     @Override
    public String toString() {
        return "ACSClass{" + "noOfStudents=" + noOfStudents + ", noOfSections=" + noOfSections + ", courseName=" + courseName + '}';
    }
}
