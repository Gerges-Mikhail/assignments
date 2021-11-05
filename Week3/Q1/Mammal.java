
package pkg03;
public class Mammal implements animal {
    public void eat(){
        System.out.println("Mammal eats stems"); 
    }
    public void travel(){
        System.out.println("\nMammal  travels"); 
    }
    public int NoOfLegs (){
        return 0; 
    }
    public void FavFood(){
        System.out.println("\nthe favorite food such as leaves, stems, roots and nuts"); 
    }
}
