/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakegame;

/**
 *
 * @author braha
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
public class Menu extends JFrame{
    Menu(){
        //System.out.println("Hello World");
    JFrame f1 = new JFrame("Menu");
    JButton b1 = new JButton("Play");
    JButton b2 = new JButton("HighScore");
    f1.add(b1);
    b1.setBounds(50, 50, 100, 30);
    f1.add(b2);
    b2.setBounds(100, 100, 100, 30);
    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            new NameField();
        }
    });
    b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            new HighScoreFrame();
        }
    });
    f1.setSize(400,400);
    f1.setLayout(null);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setVisible(true);
    }
}
