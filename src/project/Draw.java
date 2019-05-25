package project;

import java.applet.Applet;
import java.awt.*;

public class Draw extends Applet {
    public static void startScreen(Graphics g){

        for(int i=0;i<=20;i++){
            Expo.setRandomColor(g);
            Expo.setFont(g,"Default",1,100-i);
            Expo.drawString(g,"START",100+i*5,200+i*7);
        }
    }

    public static void begin(Graphics g, int score) {
        road(g);
        btns(g);
        Expo.setFont(g, "Default", 1, 15);
        Expo.drawString(g, "Your score is " + score, 600, 100);
    }

    public static void end(Graphics g){
        Expo.setBackground(g,Colors.red);
        Expo.setColor(g,Colors.endGreen);
        Expo.setFont(g, "Default", 1, 100);
        Expo.drawString(g,"YOU DIED",100,100);
    }


    public static void btns(Graphics g) {
        Expo.setFont(g,"Default",1,100);
        Expo.setColor(g,Colors.startBlue);
        Expo.drawString(g,"<=",480,300);
        Expo.fillCircle(g, 650, 271, 20);
        Expo.drawString(g, "=>", 660, 300);
    }


    public static void road(Graphics g){
        Expo.fillRoundedRectangle(g,100,100,410,500,6);
        Expo.setColor(g,Colors.roadGrey);
        Expo.fillRoundedRectangle(g,110,110,400,490,6);
        Expo.setColor(g,Colors.lineWhite);
        Expo.fillRectangle(g,190,110,200,490);
        Expo.fillRectangle(g,300,110,310,490);
    }
}
