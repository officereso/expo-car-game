package project;

import java.applet.Applet;
import java.awt.*;

public class Draw extends Applet {
    public static void startScreen(Graphics g){
        for (int i = 0; i <= 20; i++) {  // Draws the word START in a fall to the bottom left style.
            Expo.setRandomColor(g);
            Expo.setFont(g, "Arial", 1, 100 - i);
            Expo.drawString(g,"START",100+i*5,200+i*7);
        }
    }

    public static void begin(Graphics g, int score, boolean powerUsed) {
        road(g);
        btns(g);
        if (score % 50 == 0 || !powerUsed) {
            pBtn(g);
        }
        Expo.setFont(g, "Arial", 1, 15);
        Expo.setColor(g, Colors.startBlue);
        Expo.drawString(g, "Your score is " + score, 600, 100);  // Draws score
    }

    public static void end(Graphics g, int score) {  // Draws screen that is shown on collision with another car or road shoulder
        Expo.setBackground(g,Colors.red);
        Expo.setColor(g,Colors.endGreen);
        Expo.setFont(g, "Arial", 1, 100);
        Expo.drawString(g,"YOU DIED",100,100);
        Expo.setFont(g, "Arial", 1, 20);
        Expo.drawString(g, "Score = " + score, 100, 200);
    }


    public static void btns(Graphics g) {  // Draws buttons responsible the user presses for player locomotion
        Expo.setFont(g, "Arial", 1, 100);
        Expo.setColor(g,Colors.startBlue);
        Expo.drawString(g,"<=",480,300);
        Expo.drawString(g, "=>", 660, 300);
    }

    public static void pBtn(Graphics g) {
        Expo.setFont(g, "Arial", 1, 100);
        Expo.setColor(g, Colors.pBtn);
        Expo.drawString(g, "<=", 480, 700);
        Expo.drawString(g, "=>", 660, 700);
        Expo.setFont(g, "Arial", 1, 20);
        Expo.drawString(g, "Power move! Click the buttons bellow to move five times as far!", 450, 635);
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
