
package in.scalive.gui.examples;
import java.awt.Color;
import java.awt.Frame;
import java.util.Date;

class MyFrame3 extends Frame{
    public MyFrame3(String title,Color c){
        super(title);
        this.setSize(400,400);
        this.setVisible(true);
        super.setTitle(title);
        super.setBackground(c);
    }
}
public class Example10 {
    public static void main(String[] args) {
        Frame fr=new MyFrame3("Aryan's Frame", new Color(0,51,153));
        Frame fr2=new MyFrame3((new Date()).toString(), new Color(194, 204, 196));
        Frame fr3=new MyFrame3((new Date()).toString(), new Color(155, 185, 202));
    }
    
}
