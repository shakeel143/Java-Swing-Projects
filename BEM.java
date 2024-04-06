import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.*;


class MyFrame extends JFrame implements ActionListener{
	
	Container c;
	JButton btn1 =new JButton("YELLOW");
	JButton btn2 =new JButton("GREEN");
	JButton btn3=new JButton("PINK");
		
	
	MyFrame(){
		
		
	
	    c=this.getContentPane();
		c.setLayout(null);
		
	    
		btn1.setBounds(100,50,100,40);//location=left,top,width,height
	    btn2.setBounds(200,50,100,40);//location=left,top,width,height
		btn3.setBounds(300,50,100,40);//location=left,top,width,height
		

			
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		/*Font font= new Font("Arial",Font.PLAIN,20);
		btn.setFont(font);
		
		btn.setForeground(Color.RED);
		btn.setBackground(Color.YELLOW);
		 
		 Cursor cur=new Cursor(Cursor.HAND_CURSOR);//CROSSHAIR_CURSOR    //WAIT
		 btn.setCursor(cur);
		
		*/
		
	}
	public void actionPerformed(ActionEvent e){
		//if we click this button it set bc green
		if(e.getSource()==btn1){
			c.setBackground(Color.YELLOW);
		}
			if(e.getSource()==btn2){
			c.setBackground(Color.GREEN);
			}
			if(e.getSource()==btn3){
			c.setBackground(Color.PINK);
			}

					
	}
	
	
}

class BEM{
	public static void main(String args[]){
		
		MyFrame frame = new MyFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,800,500);
		frame.setTitle("Java Button With Multiple Action Event");
		
		
		
		
		//btn.setEnabled(false); Disabled button
		
		// btn.setVisible(false); UnVisible or Hidden bUTTON
		
		//ImageIcon icon= new ImageIcon("IMG-20200208-WA0002.jpg");
		//btn.setSize(icon.getIconWidth(),icon.getIconHeight());
		
		


		frame.setVisible(true);

}}