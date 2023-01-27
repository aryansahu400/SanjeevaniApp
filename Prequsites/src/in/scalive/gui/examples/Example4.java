
package in.scalive.gui.examples;
import java.awt.Frame;
import java.util.Date;
public class Example4 {
    public static void main(String[] args) {
        Frame fr=new Frame((new Date()).toString());
        fr.setLocation(300,300);
        fr.setSize(400, 400);
        //or you can use ounds(300,300,400,400);
        fr.setVisible(true);
    }
    
}
