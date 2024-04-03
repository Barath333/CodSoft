/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author 32
 */
public class Login extends JFrame implements ActionListener {
     JButton rules,back;  
     JTextField tfname;
    Login(){
          
           getContentPane().setBackground(Color.WHITE);
           setLayout(null);  
           ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
           JLabel image = new JLabel(i1);
           image.setBounds(0,0,600,500);
           add(image);
           setSize(1200,500);
           setLocation(200,150);
           
           JLabel heading = new JLabel("Quiz Time");
           heading.setBounds(750,60,300,45);
           heading.setFont(new Font("Viner Head ITC", Font.BOLD,40));
           heading.setForeground(new Color(30,144,254));
           add(heading);
           
           JLabel name = new JLabel("Enter your name");
           name.setBounds(810,150,300,20);
           name.setFont(new Font("Mongolian Balti", Font.BOLD,18));
           name.setForeground(new Color(30,144,254));
           add(name);
           
           tfname = new JTextField();
           tfname.setBounds(735,200,300,25);
           tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
           add(tfname);
           
           rules= new JButton("Rules");
           rules.setBounds(735,270,120,25);
           rules.setBackground(new Color(30,144,254));
           rules.setForeground(Color.WHITE);
           rules.addActionListener(this);
           add(rules);
           
           back= new JButton("Back");
           back.setBounds(915,270,120,25);
           back.setBackground(new Color(30,144,254));
           back.setForeground(Color.WHITE);
           back.addActionListener(this);
           add(back);
           
           
           
           
           
           setVisible(true);
       } 
       public void actionPerformed(ActionEvent e){
           if (e.getSource() == rules){
               String name= tfname.getText(); 
               setVisible(false);
               new Rules(name);
           } 
           else if (e.getSource() == back ){
               setVisible(false);
           }
       }
       public static void main(String[] args){
              new Login();
       }
   
}
