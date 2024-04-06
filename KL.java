import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.*;

class MyFrame extends JFrame implements KeyListener{

		 Container c;
		 JTextArea ta;
		 
		 
		 public MyFrame(){
		
		c=this.getContentPane();
		c.setLayout(null);
		
		
	    ta=new JTextArea();
		ta.setBounds(300,200,100,100);
		c.add(ta);
		
		ta.addKeyListener(this);
		
		
		 
}
	   /* public void keyPressed(KeyEvent arg0){
					
			ta.setText(ta.getText()+"\n"+"Key Is Pressed");
		}
		
		public void keyReleased(KeyEvent arg0){
			
			ta.setText(ta.getText()+"\n"+"key is relesed");
		}
		public void keyTyped(KeyEvent arg0){
			ta.setText(ta.getText()+"\n"+"Key is Typed");
			
			
		}*/
		
	    public void keyPressed(KeyEvent e){
					
			ta.setText(ta.getText()+"\n"+"Key Is Pressed "+e.getKeyChar());
		}
		
		public void keyReleased(KeyEvent e){
			
			ta.setText(ta.getText()+"\n"+"key is relesed " +e.getKeyChar());
		}
		public void keyTyped(KeyEvent e){
			ta.setText(ta.getText()+"\n"+"Key is Typed " +e.getKeyChar());
			
			
		}
}


class KL{//Key Listener

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