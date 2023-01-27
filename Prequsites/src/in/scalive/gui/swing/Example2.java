/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.scalive.gui.swing;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Example2 {
    public static void main(String[] args) {
        JFrame fr=new JFrame();
        fr.setSize(400,400);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image image=tk.getImage("E:/Aryan/Project Based Learning/SEM 4/images/favicon.png");
        fr.setIconImage(image);
    }
    
}
