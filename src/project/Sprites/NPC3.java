package project.Sprites;

import project.Expo;

import java.applet.Applet;
import java.awt.*;

public class NPC3 extends Applet {
    public static boolean collision = false;
    private static int x = Expo.random(100, 350);  // Where NPC starts on road
    private static int y = -15;  // Default starting position for NPC. Negative because NPC is draw from bottom left to top right.
    private static int speed = Expo.random(10, 40); // Value to move NPC down

    public NPC3(Graphics g, int Px) {
        make(g, Px);
    }

    public static void make(Graphics g, int Px) {
        if (!(y >= 250 && y <= 350 && x >= Px - 40 && x <= Px + 43)) { // Collision detection
            y += speed; // Moves NPC down according to its speed
            Expo.setColor(g, SpriteColors.NPC3Body);
            Expo.fillRectangle(g, x, y + 110, x + 35, y + 170);
            Expo.setColor(g, SpriteColors.Tires);
            Expo.fillRectangle(g, x + 5, y + 118, x - 5, y + 138);
            Expo.fillRectangle(g, x + 5, y + 145, x - 5, y + 165);
            Expo.fillRectangle(g, x + 30, y + 118, x + 40, y + 138);
            Expo.fillRectangle(g, x + 30, y + 145, x + 40, y + 165);
        } else {
            collision = true;  // Used by Main.java to detect if game is collision
        }
        if (y > 350) {  // Used to "respawn" NPC once its y reaches a certain point. Does this by resetting all variables.
            x = Expo.random(100, 400);
            y = 25;
            speed = Expo.random(10, 40);
        }
    }
}