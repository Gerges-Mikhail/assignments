
package lab2_q2;
public class Subject {
    String name ;
    private int id;
    int hours;
    public Subject(String name , int id , int hours){
        this.name = name;
        this.id = id;
        this.hours = hours;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
