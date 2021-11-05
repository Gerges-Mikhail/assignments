
package pkg03;
public class Baseball extends Ball  implements Tossable{
    public void toss(){}
    
    public String Baseball(String brandName){
        return "Brand name is : " + brandName;
    }
    
    public int Bounce(int bounce){
        return bounce;
    }
}
