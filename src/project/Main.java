package project;

import java.applet.Applet;
import java.awt.*;


public class Main extends Applet {
    public static boolean start = false;
    private Rectangle startBtn = new Rectangle(100,100,340,600);
    private Rectangle Lbtn = new Rectangle(480,220,120,80);
    private Rectangle Rbtn = new Rectangle(530,220,120,80);

    public void paint(Graphics g){
        test(g);
        Expo.drawHeading(g, "Quentin Snow and Alekkai", "Final Project");
        if (start){
            Draw.begin(g);
            playerLocomotion(g);
        }
        else{
            Draw.startScreen(g);
        }
    }

    public static void playerLocomotion(Graphics g){
        project.Sprites.player.make(g,124,427);
    }

    public boolean mouseDown(Event e, int x, int y){
        if (startBtn.inside(x,y)){
            start = true;
            repaint();
        }
        if (Lbtn.inside(x,y)){
            System.out.println("inside lbtn");
        }
        System.out.println(x+" "+y);
        return true;
    }


    public static void test(Graphics g){
        // put testing code and calls here

    }
}
