import java.applet.Applet;
import java.awt.*;

public class Background extends Applet {
    public static void draw(Graphics g){
        Expo.fillRoundedRectangle(g,10,10,300,500,6);
        Expo.setColor(g,Expo.gray);
    }
}
