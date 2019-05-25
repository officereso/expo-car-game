package project.Sprites;

import project.Expo;

import java.applet.Applet;
import java.awt.*;

public class Player extends Applet {
    public static void make(Graphics g, int x, int y) {  // Draws player at location of passes x and y integers
        Expo.setColor(g, SpriteColors.playerBody);
        Expo.fillRectangle(g, x, y, x+35, y+60);
        Expo.setColor(g, SpriteColors.Tires);
        Expo.fillRectangle(g, x+5, y+8, x-5, y+28);
        Expo.fillRectangle(g, x+5, y+35, x-5, y+55);
        Expo.fillRectangle(g, x+30, y+8, x+40, y+28);
        Expo.fillRectangle(g, x+30, y+35, x+40, y+55);
    }
}