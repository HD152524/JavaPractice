package org.dimigo.inheritance;

/**
 * Created by pc on 2017-05-12.
 */
public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone[] arrays= {new IPhone("iPhone 7","애플",900000), new Galaxy("갤럭시 S8", "삼성", 800000)};
        for(SmartPhone tmp : arrays){
            System.out.println(tmp);
            tmp.turnOn();
            tmp.pay();
            tmp.useSpecialFunction(tmp);
            tmp.turnOff();
        }
    }
}
