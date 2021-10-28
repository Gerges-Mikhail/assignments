
package lab2.q1;
public class Person {
    private String name;
    private String address;
    private int phoneNumber;
    private String email;
    public Person(String name , String address , int phoneNumber , String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public Person(String name){
        this.name = name;
    }
    
    //get name
   public String getName(){
       return name;
   }
    //get address
   public String getAddress(){
       return address;
   }
   //get phoneNumber
   public int getPhoneNumber(){
       return phoneNumber;
   }
   //get email
   public String getEmail(){
       return email;
   }
   //sets methods 
   public void setName(String name){
       this.name = name;
   }
   
   public void setAddress(String address){
       this.address = address;
   }
   
   public void setPhonenumber(int phoneNumber){
       this.phoneNumber = phoneNumber;
   }
   
   public void setEmail(String email){
       this.email = email;
   }
   @Override
    public String toString() {
        return "Name: " + getName() + "  Address: " + getAddress() + "  Phone Number: " + getPhoneNumber() + " Email:" + getEmail() ;
    }
}
