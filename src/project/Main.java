package project;

import project.Sprites.*;

import java.applet.Applet;
import java.awt.*;


public class Main extends Applet {
    private static boolean start = false;
    private Rectangle startBtn = new Rectangle(100,100,340,600);
    private static int score = 0;
    private Rectangle lBtn = new Rectangle(480, 240, 150, 80);
    private static int Px = 150;
    private Rectangle rBtn = new Rectangle(660, 240, 150, 80);

    public void paint(Graphics g) {
        Expo.drawHeading(g, "Quentin Snow and Alekkai", "Final Project");
        if (start && !NPC1.ended && !NPC2.ended && !NPC3.ended && !NPC4.ended && !NPC5.ended && !NPC6.ended) {
            Draw.begin(g, score);
            playerLocomotion(g);
            npcLocomotion(g);

        }
        if (!start) {
            Draw.startScreen(g);
        }

        if (NPC1.ended || NPC2.ended || NPC3.ended || NPC4.ended || NPC5.ended || NPC6.ended) {
            Draw.end(g);
        }
    }

    private static void npcLocomotion(Graphics g) {
        if (score > 3) {
            new NPC1(g, Px);
        }
        if (score > 30) {
            new NPC2(g, Px);
        }
        if (score > 35) {
            new NPC3(g, Px);
        }
        if (score > 50) {
            new NPC4(g, Px);
        }
        if (score > 70) {
            new NPC5(g, Px);
        }
        if (score > 80) {
            new NPC6(g, Px);
        }
    }


    private static void playerLocomotion(Graphics g) {
        project.Sprites.player.make(g, Px, 427);
        if (Px <= 107 || Px >= 375) {
            Draw.end(g);
            Px = 10000;
        }
    }


    public boolean mouseDown(Event e, int x, int y){
        if (startBtn.inside(x,y)){
            start = true;
        }
        if (lBtn.inside(x,y)){
            Px-=10;
        }
        if (rBtn.inside(x,y)){
            Px+=10;
        }
        score++;
        repaint();
        return true;
    }
}