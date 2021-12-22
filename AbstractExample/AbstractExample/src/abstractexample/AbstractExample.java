
package abstractexample;

public class AbstractExample {

    public static void main(String[] args) {        
      
      // cannot create an object from an abstract class
     // DepartmentAbstarctClass obj = new DepartmentAbstarctClass();
     
     MSISClass objName = new MSISClass(150, 5, "OOPS");
     
     objName.courseAssign("OOPS");
     
     DepartmentAbstarctClass obj2 = new MSISClass(120, 3, "PM");
     
    }
    
}
