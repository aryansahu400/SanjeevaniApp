
package in.scalive.gui.examples;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame5 extends Frame{
    Button button1,button2;
    Label l;
    public MyFrame5(String title){
        super(title);
        super.setBounds(0,0,400,400);
        this.setVisible(true);
        button1=new Button("Quit");
        super.add(button1);
        super.setLayout(new FlowLayout());
        button1.addActionListener(new Driver1());
        button2=new Button("Print Something");
        super.add(button2);
        l=new Label();
        super.add(l);
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                l.setText("Hello World");
            }
        });
    }
}

class Driver1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}

public class Example12 {
    public static void main(String[] args) {
        Frame fr=new MyFrame5("Aryan's Frame");
        
    }
    
}
