package caculator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;
public class calculator {
   JFrame frame=new JFrame();
   JPanel panel=new JPanel();
   JTextArea textarea=new JTextArea(2,10);
   JButton button1=new JButton();
   JButton button2=new JButton();
   JButton button3=new JButton();
   JButton button4=new JButton();
   JButton button5=new JButton();
   JButton button6=new JButton();
   JButton button7=new JButton();
   JButton button8=new JButton();
   JButton button9=new JButton();
   JButton button0=new JButton();
   JButton buttonadd=new JButton();
   JButton buttonsubtract=new JButton();
   JButton buttonmultiply=new JButton();
   JButton buttondivide=new JButton();
   JButton buttonclear=new JButton();
   JButton buttondot=new JButton();
   JButton buttonequal=new JButton();
   double number1,number2,result;
   int add=0,sub=0,mul=0,div=0;
   public calculator() {
	   frame.setSize(340,450);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setVisible(true);
	   frame.setTitle("Shashikala");
	   //frame.setResizable(false);
	   frame.add(panel);
	   panel.setBackground(Color.LIGHT_GRAY);
	   Border border=BorderFactory.createLineBorder(Color.RED,4);
	   panel.add(textarea);
	   textarea.setBackground(Color.black);
	   Border tborder=BorderFactory.createLineBorder(Color.BLUE,3);
	   textarea.setBorder(tborder);
	   Font font=new Font("arial",Font.BOLD,33);
	   textarea.setFont(font);
	   textarea.setForeground(Color.WHITE);
	   textarea.setPreferredSize(new Dimension(2,10));
	   textarea.setLineWrap(true);
	   
	   
	   
   }
   
}
