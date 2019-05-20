package project.Sprites;

import project.Expo;
import java.applet.Applet;
import java.awt.*;

public class player extends Applet {
    public static void make(Graphics g){
        Expo.fillRectangle(g,100,100,125,150);
        Expo.fillRectangle(g,105,110,95,120);

    }
}
