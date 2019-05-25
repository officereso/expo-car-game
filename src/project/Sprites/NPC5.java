package project.Sprites;

import project.Draw;
import project.Expo;

import java.applet.Applet;
import java.awt.*;

public class NPC5 extends Applet {
    public static boolean ended = false;
    private static int x = Expo.random(100, 400);
    private static int y = -15;
    private static int speed = Expo.random(10, 40);

    public NPC5(Graphics g, int Px) {
        make(g, Px);
    }

    public static void make(Graphics g, int Px) {
        if (!(y >= 250 && y <= 350 && x >= Px - 40 && x <= Px + 43) && !ended) {
            y += speed;
            Expo.setColor(g, SpriteColors.NPC1Body);
            Expo.fillRectangle(g, x, y + 110, x + 35, y + 170);
            Expo.setColor(g, SpriteColors.Tires);
            Expo.fillRectangle(g, x + 5, y + 118, x - 5, y + 138);
            Expo.fillRectangle(g, x + 5, y + 145, x - 5, y + 165);
            Expo.fillRectangle(g, x + 30, y + 118, x + 40, y + 138);
            Expo.fillRectangle(g, x + 30, y + 145, x + 40, y + 165);
        } else {
            Draw.end(g);
            ended = true;
        }
        if (y > 350) {
            x = Expo.random(100, 400);
            y = 25;
            speed = Expo.random(10, 40);
        }
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
