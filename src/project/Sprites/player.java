package project.Sprites;

import project.Colors;
import project.Expo;
import java.applet.Applet;
import java.awt.*;

public class player extends Applet {
    public static void make(Graphics g, int x, int y) {
        Expo.setColor(g,colorsTemp.playerBody);
        Expo.fillRectangle(g, x, y, x+35, y+60);
        Expo.setColor(g,colorsTemp.Tires);
        Expo.fillRectangle(g, x+5, y+8, x-5, y+28);
        Expo.fillRectangle(g, x+5, y+35, x-5, y+55);
        Expo.fillRectangle(g, x+30, y+8, x+40, y+28);
        Expo.fillRectangle(g, x+30, y+35, x+40, y+55);
    }
}
//        Expo.setColor(g,colorsTemp.playerBody);
//        Expo.fillRectangle(g, 100, 100, 135, 160);
//        Expo.setColor(g,colorsTemp.Tires);
//        Expo.fillRectangle(g, 105, 108, 95, 128);
//        Expo.fillRectangle(g, 105, 135, 95, 155);
//        Expo.fillRectangle(g, 130, 108, 140, 128);
//        Expo.fillRectangle(g, 130, 135, 140, 155);