package project.Sprites;

import project.Expo;

import java.applet.Applet;
import java.awt.*;

public class NPC extends Applet {
    private static int x = Expo.random(100, 400);
    private static int y = 100;
    private static int speed = Expo.random(10, 20);

    public NPC(/*Graphics g, int x, int y*/) {
//        Expo.setColor(g, SpriteColors.NPC1Body);
//        Expo.fillRectangle(g, x, y + 110, x + 35, y + 170);
//        Expo.setColor(g, SpriteColors.Tires);
//        Expo.fillRectangle(g, x + 5, y + 118, x - 5, y + 138);
//        Expo.fillRectangle(g, x + 5, y + 145, x - 5, y + 165);
//        Expo.fillRectangle(g, x + 30, y + 118, x + 40, y + 138);
//        Expo.fillRectangle(g, x + 30, y + 145, x + 40, y + 165);
    }

    public static void make(Graphics g/*, int x, int y*/) {
        y += speed;
        Expo.setColor(g, SpriteColors.NPC1Body);
        Expo.fillRectangle(g, x, y + 110, x + 35, y + 170);
        Expo.setColor(g, SpriteColors.Tires);
        Expo.fillRectangle(g, x + 5, y + 118, x - 5, y + 138);
        Expo.fillRectangle(g, x + 5, y + 145, x - 5, y + 165);
        Expo.fillRectangle(g, x + 30, y + 118, x + 40, y + 138);
        Expo.fillRectangle(g, x + 30, y + 145, x + 40, y + 165);
    }
}

/*
    public static void make(Graphics g){
        int x = Expo.random(100,400);
        Expo.setColor(g,SpriteColors.NPC1Body);
        Expo.fillRectangle(g, x, 110, x+35, 170);
        Expo.setColor(g,SpriteColors.Tires);
        Expo.fillRectangle(g, x+5, 118, x-5, 138);
        Expo.fillRectangle(g, x+5, 145, x-5, 165);
        Expo.fillRectangle(g, x+30, 118, x+40, 138);
        Expo.fillRectangle(g, x+30, 145, x+40, 165);

    }
}*/
