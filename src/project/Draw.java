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
        moveTest(g);
    }
    public static void moveTest(Graphics g){
        int x = 0;
        while (true){
            player(g,x,200);
            Expo.delay(1);
            x ++;
        }
    }
    public static void player(Graphics g, int x, int y){
        Expo.drawPoint(g,x,y);
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
