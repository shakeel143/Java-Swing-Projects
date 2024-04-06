import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.*;

class MyFrame extends JFrame implements ItemListener{
	     JComboBox combo;
		 Container c;
		 JTextArea ta;
		 public MyFrame(){
		
		c=this.getContentPane();
		c.setLayout(null);
		
		String values[]={"a","b","c","d","e"};
	    combo=new JComboBox(values);
		combo.setBounds(50,50,100,30);
		c.add(combo);
	
	    ta=new JTextArea();
		ta.setBounds(200,200,100,100);
		c.add(ta);
		
		combo.addItemListener(this);
		 }

		public void itemStateChanged(ItemEvent e){
					String str=combo.getSelectedItem().toString();
					ta.setText(str);
		
			
		}
		

}
class IL{// Item listener event with JComboBox

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