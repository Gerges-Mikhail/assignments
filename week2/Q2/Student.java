
package lab2_q2;
public class Student {
    String name ;
    private int id;
    int gpa;
    public Student(String name , int id , int gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
