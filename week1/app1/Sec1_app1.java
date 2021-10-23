
package sec1_app1;
public class Sec1_app1 {

    public static void main(String[] args) {
        //test tv1
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(22);
        tv1.setVolume(2);
        //test tv2
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        System.out.println("channel is :" + tv1.channel + " volume level is " + tv1.volumeLevel);
        System.out.println("channel is " + tv2.channel + " volume level is " + tv2.volumeLevel);
    }
    
}
