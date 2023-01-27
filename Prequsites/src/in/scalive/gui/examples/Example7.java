
package in.scalive.gui.examples;
import java.awt.Color;
import java.awt.Frame;
import java.util.Date;
import java.util.HashSet;
public class Example7 {
    public static void main(String[] args) {
        Frame fr=new Frame((new Date()).toString());
        fr.setLocation(300,300);
        fr.setSize(400, 400);
        Color color=new Color(255,255,0);
        fr.setBackground(color);

        //or you can use ounds(300,300,400,400);
        fr.setVisible(true);
    }
    
}
