package project.Sprites;

import project.Colors;
import project.Expo;
import java.applet.Applet;
import java.awt.*;

public class NPC3 extends Applet {
    public static void NPC3(Graphics g) {
        Expo.setColor(g,colorsTemp.NPC3Body);
        Expo.fillRectangle(g, 100, 100, 135, 160);
        Expo.setColor(g,colorsTemp.Tires);
        Expo.fillRectangle(g, 105, 108, 95, 128);
        Expo.fillRectangle(g, 105, 135, 95, 155);
        Expo.fillRectangle(g, 130, 108, 140, 128);
        Expo.fillRectangle(g, 130, 135, 140, 155);
    }
}
