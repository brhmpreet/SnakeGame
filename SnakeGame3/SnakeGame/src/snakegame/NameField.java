/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author braha
 */

public class NameField {
    public String nameOfPlayer;
//    public String getName(){
//        
//        return nameOfPlayer;
//    }
    NameField(){
        
        JFrame frame3 = new JFrame("Enter Name");
        JTextField field3 = new JTextField();
        JButton b4 = new JButton("Okay");
        frame3.add(b4);
        frame3.add(field3);
        b4.setBounds(50, 50, 100, 30);
        field3.setBounds(100, 100, 100, 30);
        frame3.setSize(400,400);
        frame3.setLayout(null);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setVisible(true);
        b4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            nameOfPlayer = field3.getText();
//            System.out.println(nameOfPlayer);
//            System.out.println(nameOfPlayer);
//            System.out.println(nameOfPlayer);
            //GamePanel obj1 = new GamePanel();
            //obj1.my_update(nameOfPlayer);
            
            new GameFrame(nameOfPlayer);
            frame3.dispose();
            
        }
        
        
    });
        //System.out.println(nameOfPlayer);
    }
}
