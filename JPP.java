import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.*;


class MyFrame extends JFrame{

		 Container c;
		 JPanel panel,panel2;
		 JButton btn;
		
		 
		 public MyFrame(){
		
		c=this.getContentPane();
		c.setLayout(null);
		panel=new JPanel();
		c.add(panel);
		panel.setBackground(Color.ORANGE);
		panel.setBounds(40,40,200,200);
		
		btn=new JButton("Click Me");
		panel.add(btn);
		

		panel2=new JPanel();
	    panel.add(panel2);
		panel2.setBackground(Color.BLACK);
		panel2.setBounds(40,40,100,100);
		
		
	
		
		
}}


class JPP{//JPanel

	public static void main(String args[]){
		
		MyFrame frame = new MyFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,800,500);
		frame.setTitle("JPanel");
		frame.setBackground(Color.WHITE);

		frame.setVisible(true);
		
}}