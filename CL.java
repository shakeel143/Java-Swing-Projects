import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.*;


class MyFrame extends JFrame implements ActionListener{
	
	Container c;
	JLabel l1=new JLabel("First Number");
	JLabel l2=new JLabel("Second Number");
	JLabel result= new JLabel("Result");
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	
	JButton add =new JButton("Addition");
	JButton sub =new JButton("Subtraction");
		
	JButton div =new JButton("Division");
	JButton mul =new JButton("Multiplication");

	
	MyFrame(){
		
		
	
	    c=this.getContentPane();
		c.setLayout(null);
		
	    
	    l1.setBounds(20,50,100,40);//location=left,top,width,height
	    l2.setBounds(20,100,100,40);//location=left,top,width,height
		tf1.setBounds(150,50,100,40);//location=left,top,width,height
		tf2.setBounds(150,100,100,40);//location=left,top,width,height
	    add.setBounds(10,200,100,40);//location=left,top,width,height
	    sub.setBounds(120,200,100,40);//location=left,top,width,height
		div.setBounds(230,200,100,40);//location=left,top,width,height
		mul.setBounds(350,200,100,40);//location=left,top,width,height
        result.setBounds(20,250,600,40);//location=left,top,width,height
		
		


		mul.addActionListener(this);
		div.addActionListener(this);
		sub.addActionListener(this);
		add.addActionListener(this);
		
		
		
		c.add(l1);
        c.add(l2);
		c.add(tf1);
		c.add(tf2);
		c.add(add);
        c.add(sub);
		c.add(div);
		c.add(mul);
		c.add(result);
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
		if(e.getSource()==add){
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a+b;
			result.setText("Result :Addition of two numbers  :"+c);
			
			}
		if(e.getSource()==sub){
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a-b;
			result.setText("Result :Subtraction of two numbers  :"+c);
			
		}
		if(e.getSource()==div){
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a/b;
			result.setText("Result :Division of two numbers  :"+c);
			
			}
		if(e.getSource()==mul){
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int c=a*b;
			result.setText("Result :Multiplication of two numbers  :"+c);
			
			}		  
			
		
	
	}
	
	
}

class CL{
	public static void main(String args[]){
		
		MyFrame frame = new MyFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,500,400);//location=left,top,width,height
		frame.setTitle("Java Button With Multiple Action Event");
		
		
		
		
		//btn.setEnabled(false); Disabled button
		
		// btn.setVisible(false); UnVisible or Hidden bUTTON
		
		//ImageIcon icon= new ImageIcon("IMG-20200208-WA0002.jpg");
		//btn.setSize(icon.getIconWidth(),icon.getIconHeight());
		
		


		frame.setVisible(true);

}}