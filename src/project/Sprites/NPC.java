package project.Sprites;

import project.Colors;
import project.Expo;
import java.applet.Applet;
import java.awt.*;

public class NPC extends Thread {
    public NPC(Graphics g) {
        int x = Expo.random(100,400);
        Expo.setColor(g,colorsTemp.NPC1Body);
        Expo.fillRectangle(g, x, 110, x+35, 170);
        Expo.setColor(g,colorsTemp.Tires);
        Expo.fillRectangle(g, x+5, 118, x-5, 138);
        Expo.fillRectangle(g, x+5, 145, x-5, 165);
        Expo.fillRectangle(g, x+30, 118, x+40, 138);
        Expo.fillRectangle(g, x+30, 145, x+40, 165);
    }
    public static void make(Graphics g){
            int x = Expo.random(100,400);
            Expo.setColor(g,colorsTemp.NPC1Body);
            Expo.fillRectangle(g, x, 110, x+35, 170);
            Expo.setColor(g,colorsTemp.Tires);
            Expo.fillRectangle(g, x+5, 118, x-5, 138);
            Expo.fillRectangle(g, x+5, 145, x-5, 165);
            Expo.fillRectangle(g, x+30, 118, x+40, 138);
            Expo.fillRectangle(g, x+30, 145, x+40, 165);

    }
}
//        Expo.setColor(g,colorsTemp.NPC1Body);
        //        Expo.fillRectangle(g, 100, 100, 135, 160);
    //            Expo.setColor(g,colorsTemp.Tires);
  //              Expo.fillRectangle(g, 105, 108, 95, 128);
 //               Expo.fillRectangle(g, 105, 135, 95, 155);
//                Expo.fillRectangle(g, 130, 108, 140, 128);
//                Expo.fillRectangle(g, 130, 135, 140, 155);