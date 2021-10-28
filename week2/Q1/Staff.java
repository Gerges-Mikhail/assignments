package lab2.q1;
public class Staff extends Employee{
    private String title;
    public Staff(String name , String address , int phoneNumber , String email , int office, double salary, String title) {
	super(name, address, phoneNumber, email, office, salary);
	this.title = title;
    }

	/** Return title */
	public String getTitle() {
		return title;
	}

	/** Set new title */
	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return super.toString() + "Title: " + title;
	}
}
