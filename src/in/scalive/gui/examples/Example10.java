
package in.scalive.gui.examples;
import java.awt.Color;
import java.awt.Frame;
import java.util.Date;

class MyFrame2 extends Frame{
    public MyFrame2(String title,Color c){
        super(title);
        this.setSize(400,400);
        this.setVisible(true);
        super.setTitle(title);
        super.setBackground(c);
    }
}
public class Example10 {
    public static void main(String[] args) {
        Frame fr=new MyFrame2("Aryan's Frame", Color.cyan);
        Frame fr2=new MyFrame2((new Date()).toString(), Color.blue);
    }
    
}
