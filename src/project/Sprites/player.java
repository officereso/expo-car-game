package project.Sprites;

import project.Expo;
import java.applet.Applet;
import java.awt.*;

public class player extends Applet {
    public static void draw(Graphics g, int x1, int y1){
        Expo.fillRectangle(g,100,100,125,150);
        Expo.fillRectangle(g,105,110,95,120);
    }
}
