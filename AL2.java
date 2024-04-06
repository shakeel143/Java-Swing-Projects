import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.*;


class MyFrame extends JFrame implements ActionListener{
	
	Container c;
	//JButton btn;
	JTextField t1;
		
		
	
	MyFrame(){
		
		
	
	    c=this.getContentPane();
		c.setLayout(null);
	    t1=new JTextField();
		t1.setBounds(100,50,100,40);//width,height,location=left,top
		c.add(t1);
		
		t1.addActionListener(this);
		
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
		
		String str=t1.getText();
		t1.setText(str.toUpperCase());
		
		
		
	}
	
	
}

class AL2{// Action Listener 2 with text field

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