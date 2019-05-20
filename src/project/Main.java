package project;

import java.applet.Applet;
import java.awt.*;


public class Main extends Applet {
    public static boolean start = false;
    private Rectangle startBtn = new Rectangle(100,100,340,600);

    public void paint(Graphics g){
        Expo.drawHeading(g, "Quentin Snow and Alekkai", "Final Project");

        if (start){
            Draw.begin(g);
        }
        else{
            Draw.startScreen(g);
        }

    }

    public boolean mouseDown(Event e, int x, int y){
        if (startBtn.inside(x,y)){
            start = true;
            repaint();
        }

        return true;
    }
}
