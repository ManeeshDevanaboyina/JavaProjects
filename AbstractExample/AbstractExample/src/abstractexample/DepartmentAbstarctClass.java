
package abstractexample;

/**
 * Super class
 */
public abstract class DepartmentAbstarctClass {

    String nameOfProfessor;
    String courseID;

    //default const
    public DepartmentAbstarctClass() {
        System.out.println("Department default const");
    }

    //parameterized const
    public DepartmentAbstarctClass(String nameOfProfessor, String courseID) {
        System.out.println("Department paramter const");
        this.nameOfProfessor = nameOfProfessor;
        this.courseID = courseID;
    }

    // this is abstract method only header no body
    public abstract void courseAssign(String courseName);

    // this is a regular method
    public String getCourseID() {
        return courseID;
    }

}
