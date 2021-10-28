
package lab2.q1;
public class Lab2Q1 {
    public static void main(String[] args) {
        Person p = new Person("Gerges", "Matay",1111618689, "gergesmikhail999@gmail.com");
        Student s = new Student("Mikhail", "Matay", 1064311915, "m088@gmail.com", 1555);        
        Employee em = new Employee("joe", "minia", 115878999,"joe0@gmail.com", 852910, 78000);
	Faculty f = new Faculty("mena", "beni mazar", 1138655233,"mena8@gamil.com", 10791, 540000, "10pm to 5pm", "Student");
        Staff staff = new Staff("Mesbah", "minya", 11357485,"mesbah@gmail.com", 1888, 66600, "Assistant");
		
        System.out.println(p.toString());
        System.out.println(s.toString());
	System.out.println(em.toString());
	System.out.println(f.toString());
	System.out.println(staff.toString());
    }
}
