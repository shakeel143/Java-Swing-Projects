import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.*;

class MyFrame extends JFrame implements ItemListener{
	     JRadioButton male,female;
		 Container c;
		 JTextArea ta;
		 public MyFrame(){
		
		c=this.getContentPane();
		c.setLayout(null);
		
		male=new JRadioButton("Male");
		male.setBounds(50,50,100,30);
		c.add(male);
		
		female=new JRadioButton("Female");
		female.setBounds(200,50,100,30);
		c.add(female);
		
		ButtonGroup gen=new ButtonGroup();
		gen.add(male);
		gen.add(female);
	
	    ta=new JTextArea();
		ta.setBounds(300,200,100,100);
		c.add(ta);
		
		male.addItemListener(this);
		female.addItemListener(this);
		 }

	     public void itemStateChanged(ItemEvent e){
					
			if(e.getSource()==male){
				
				ta.setText("Male is clicked");
			}
			if(e.getSource()==female){
				
				ta.setText("female is clicked");
				
				
			}
		}
		

}
class IL1{// Item listener event with Radio Button

	public static void main(String args[]){
		
		MyFrame frame = new MyFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,800,500);
		frame.setTitle("Java Button With Action Event");
		
		
		
		
		//btn.setEnabled(false); Disabled button
		
		// btn.setVisible(false); UnVisible or Hidden bUTTON
		
		//ImageIcon icon= new ImageIcon("IMG-20200208-WA0002.jpg");
		//btn.setSize(icon.getIconWidth(),icon.getIconHeight());
		
		


		frame.setVisible(true);
		
}}