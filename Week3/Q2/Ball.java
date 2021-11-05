
package pkg03;

public class Ball implements Tossable{
    String brandName;
    
    Ball(){}
    
    public Ball(String bN){
        this.brandName = bN;
    }
    
    public void toss(){}
    
    public String getBrandName(){
        return "Brand name is : " + brandName;
    }
    
    public int Bounce(int bounce){
        return bounce;
    }
}
