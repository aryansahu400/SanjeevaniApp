
package in.scalive.gui.examples;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.Frame;
public class E1 {
    public static void main(String[] args) {
        Frame fr=new Frame((LocalDate.now().toString())+", "+(LocalTime.now().toString()));
        fr.setLocation(300,300);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }
    
}
