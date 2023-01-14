
package in.scalive.gui.examples;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame8 extends Frame implements ActionListener{
    Button button1,button2,button3,button4;
    public MyFrame8(String title){
        super(title);
        super.setBounds(0,0,400,400);
        this.setVisible(true);
        button1=new Button("Quit");
        button2=new Button("Red");
        button3=new Button("Blue");
        button4=new Button("Green");
        super.add(button1);
        super.add(button2);
        add(button3);
        add(button4);
        super.setLayout(new FlowLayout());
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()){
            case ("Blue") ->{
                setBackground(Color.BLUE);
            }
            case ("Green") ->{
                setBackground(Color.green);
            }
                
            case ("Red")->{
                setBackground(Color.red);
            }
                
            default ->{
                System.exit(0);
            }
        }
    }
}

public class Example15 {
    public static void main(String[] args) {
        Frame fr=new MyFrame8("Aryan's Frame");
    }
    
}

