import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
	JMenuBar mbb;
	JMenu file,edit,design;
	JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11;
	Container c;
	JTextArea ta;
	
	MyFrame(){
	
	
	
		c=this.getContentPane();
		c.setLayout(null);

        mbb = new JMenuBar();
	    file=new JMenu("File");
		edit=new JMenu("Edit");
		design=new JMenu("Design");

	     i1=new JMenuItem("New");
		 i2=new JMenuItem("Open");
		 i3=new JMenuItem("Save");
		 i4=new JMenuItem("Save as");
		 i5=new JMenuItem("Undo");
		 i6=new JMenuItem("Redo");
		 i7=new JMenuItem("Next");
		 i8=new JMenuItem("Cut");
		 i9=new JMenuItem("Copy");
		 i10=new JMenuItem("Paste");
		 i11=new JMenuItem("Select all");
		
		
		
		file.add(i1);
		file.add(i2);
		file.add(i3);
		file.add(i4);
		edit.add(i5);
		edit.add(i6);
		design.add(i7);
		design.add(i8);
		design.add(i9);
		design.add(i10);
		design.add(i11);
		edit.add(design);
		
		mbb.add(file);
		mbb.add(edit);
		this.setJMenuBar(mbb);
		
		

		
        

	    i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
		i6.addActionListener(this);
		i7.addActionListener(this);
		i8.addActionListener(this);
		i9.addActionListener(this);
		i10.addActionListener(this);
		i11.addActionListener(this);
	


		
				
	    ta = new JTextArea();
		ta.setBounds(100,100,400,200);//location=left,top,width,height
		c.add(ta);
		
	}	

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==i1){
		ta.setText("New File...");
		}
		if(e.getSource()==i2){
		ta.setText("Open File...");
		}
		if(e.getSource()==i3){
		ta.setText("Save...");
		}
		if(e.getSource()==i4){
	    ta.setText("Save as...");
		}
		if(e.getSource()==i5){
		ta.setText("Undo...");
		}
		if(e.getSource()==i6){
		ta.setText("Redo...");
		}
		if(e.getSource()==i7){
		ta.setText("Next...");
		}		
		if(e.getSource()==i8){
		ta.cut();
		}
	    if(e.getSource()==i9){
		ta.copy();
		}
	    if(e.getSource()==i10){
		ta.paste();
		}		
		if(e.getSource()==i11){
		ta.selectAll();
		}
		
			
	}
	
	
}
	
	
class AL3{// Action Listener 3 with Menu Item

	public static void main(String args[]){
		
		MyFrame f = new MyFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,100,700,600);//location=left,top,width,height
		f.setTitle("J Menu Bar");
		f.setVisible(true);

}}