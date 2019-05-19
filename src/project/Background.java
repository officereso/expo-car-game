package project;

import java.applet.Applet;
import java.awt.*;

public class Background extends Applet {
    public static void create(Graphics g){
        Expo.fillRoundedRectangle(g,100,100,410,500,6);
        Expo.setColor(g,Expo.gray);
    }
}
