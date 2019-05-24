package project;

import project.Sprites.NPC;

import java.applet.Applet;
import java.awt.*;


public class Main extends Applet {
    private static boolean start = false;
    private Rectangle startBtn = new Rectangle(100,100,340,600);
    private Rectangle lBtn = new Rectangle(480,220,120,80);
    private Rectangle rBtn = new Rectangle(630,220,120,80);
    private static int Px = 150;
    private static NPC npc1 = new NPC();


    public void paint(Graphics g){
        Expo.drawHeading(g, "Quentin Snow and Alekkai", "Final Project");
        if (start){
            Draw.begin(g);
            playerLocomotion(g);
            npcLocomotion(g);

        }
        else{
            Draw.startScreen(g);
        }
    }


    public static void playerLocomotion(Graphics g){
        project.Sprites.player.make(g,Px,427);
        if (Px <= 107|| Px >= 375){
            Draw.end(g);
            Px = 10000;
        }
    }

    public static void npcLocomotion(Graphics g) {
        NPC.make(g);
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
        repaint();
        System.out.println(x+" "+y);
        return true;
    }
}
