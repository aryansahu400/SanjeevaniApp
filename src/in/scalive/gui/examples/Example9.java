
package in.scalive.gui.examples;

import java.awt.Frame;


class MyFrame2 extends Frame{
    public MyFrame2(){
        super.setSize(400,400); //or this.setSize(400,400); //or super.setSize() kyunki parent calss ki hai//or direct bhi calling is allowed
        super.setVisible(true);
    }
}
public class Example9 {
    public static void main(String[] args) {
        Frame fr=new MyFrame2();
    }
    
}
