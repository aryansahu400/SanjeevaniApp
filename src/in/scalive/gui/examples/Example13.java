
package in.scalive.gui.examples;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame6 extends Frame implements ActionListener{
    Button button1,button2;
    public MyFrame6(String title){
        super(title);
        super.setBounds(0,0,400,400);
        this.setVisible(true);
        button1=new Button("Quit");
        button2=new Button("Change color");
        super.add(button1);
        super.add(button2);
        super.setLayout(new FlowLayout());
        button1.addActionListener(new Driver1());
        button2.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        super.setBackground(new Color(251, 255, 214));
    }
}

class Driver1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}


public class Example13 {
    public static void main(String[] args) {
        Frame fr=new MyFrame6("Aryan's Frame");
        
    }
    
}

