/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

/**
 *
 * @author braha
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
public class HighScoreFrame {
    HighScoreFrame(){
       // System.out.println("Hello World");
        JFrame score = new JFrame();
        //Connection con = null;
        //Statement  st = null;
         JTable jt = new JTable();
         jt.setBounds(0,0,400,400);
         JScrollPane scrollPane = new JScrollPane();
         scrollPane.setViewportView(jt);
        ResultSet rs = null;
        String uname = "root";
        String passoword = "root";
        String url = "jdbc:derby://localhost:1527/snakeGame";
      //  System.out.println("Hello World");
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
         //   System.out.println("Hello World");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            Connection con = DriverManager.getConnection(url,uname,passoword);
            Statement statement = con.createStatement();
            //String mike = string1;
            //System.out.println(string1);
            String qstring = "select * from snakedata1 order by score desc fetch first 3 rows only";
            rs = statement.executeQuery(qstring);
            ResultSetMetaData  rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel)jt.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[2];
            //colName = {"Name","Score"};
            for(int i = 0;i<cols;i++){
                colName[i] = rsmd.getColumnName(i+1);
            }
            //String[]
            //model.addRow({Name,Score});
            model.setColumnIdentifiers(colName);
            String[] colName1 = {"Name","Score"};
            model.addRow(colName1);
            String name;
            int pscore;
           // System.out.println("Hello World");
            while(rs.next()){
                name = rs.getString(1);
                pscore = rs.getInt(2);
                String[] row = {name,Integer.toString(pscore)};
                model.addRow(row);
                
            }
            statement.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
       // System.out.println("Hello World");
        score.add(jt);
        score.add(scrollPane);
        score.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        score.setSize(400,400);
        score.setLayout(null);
        score.setVisible(true);
        
    }
}
