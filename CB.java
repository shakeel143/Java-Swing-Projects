import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Container;

class CB{
	public static void main(String args[]){
		
		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,800,500);
		frame.setTitle("Java Checkbox");
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JLabel l1=new JLabel("When pakistan was established?");
		l1.setBounds(100,100,300,20);//location=left,top,width,height
		c.add(l1);
		
		JCheckBox cb1= new JCheckBox("a>- 1956");
		cb1.setBounds(100,150,100,20);//location=left,top,width,height
		c.add(cb1);
		JCheckBox cb2= new JCheckBox("b>- 1947");
		cb2.setBounds(100,200,100,20);//location=left,top,width,height
		c.add(cb2);
		JCheckBox cb3= new JCheckBox("c-> 1950");
		cb3.setBounds(100,250,100,20);//location=left,top,width,height
		c.add(cb3);
		JCheckBox cb4= new JCheckBox("d-> None");
		cb4.setBounds(100,300,100,20);//location=left,top,width,height
		c.add(cb4);
		
		cb1.setSelected(true);
		
				
		
		
		 
		 Cursor cur=new Cursor(Cursor.HAND_CURSOR);//CROSSHAIR_CURSOR    //WAIT
		 cb1.setCursor(cur);

		 
		
		//btn.setEnabled(false); Disabled button
		
		// btn.setVisible(false); UnVisible or Hidden bUTTON
		
		//ImageIcon icon= new ImageIcon("IMG-20200208-WA0002.jpg");
		//btn.setSize(icon.getIconWidth(),icon.getIconHeight());
		
		


		frame.setVisible(true);

}}