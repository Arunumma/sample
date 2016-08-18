import java.util.HashSet;
import java.util.Set;


public class EqualsTest {
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
 
        e1.setId(100);
        e2.setId(100);
 
        //Prints 'true'
        System.out.println(e1.equals(e2));
 
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
         
        //Prints two objects
        System.out.println(employees);
    }
}
