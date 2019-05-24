// This module was created by Quentin Snow

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

    public static void begin(Graphics g){
        road(g);
        LRbtn(g);
        //project.Sprites.NPC.NPC(g,Expo.random(110,390));
    }

    public static void end(Graphics g){
        Expo.setBackground(g,Colors.red);
        Expo.setColor(g,Colors.endGreen);
        Expo.drawString(g,"YOU DIED",100,100);
    }


    public static void LRbtn(Graphics g){
        Expo.setFont(g,"Default",1,100);
        Expo.setColor(g,Colors.startBlue);
        Expo.drawString(g,"<=",480,300);
        Expo.drawString(g,"=>",620,300);
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
