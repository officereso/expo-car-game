package project.Sprites;

import project.Colors;
import project.Expo;
import java.applet.Applet;
import java.awt.*;

public class player extends Applet {
    public static void make(Graphics g) {
        Expo.setColor(g,colorsTemp.playerBody);
        Expo.fillRectangle(g, 100, 100, 135, 160);
        Expo.setColor(g,colorsTemp.Tires);
        Expo.fillRectangle(g, 105, 108, 90, 128);
        Expo.fillRectangle(g, 105, 108, 90, 128);
    }
}
