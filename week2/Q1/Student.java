
package lab2.q1;
public class Student extends Person{
    private static int status;
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    
    public Student(String name , String address , int phoneNumber , String email , int status) {
	super(name, address, phoneNumber, email);
        Student.status = status;
    }
    
    public Student(String name , int status){
        super(name);
        Student.status = status;
    }
    @Override
    public String toString() {
        return super.toString() + "\nStatus: " + status;
    }
}
