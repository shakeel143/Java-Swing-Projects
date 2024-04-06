import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.*;


class MyFrame extends JFrame implements ActionListener{
	
	Container c;

	JTextField tf = new JTextField();

	
	JButton n1 =new JButton("1");
	JButton n2 =new JButton("2");
	JButton n3 =new JButton("3");
	JButton n4 =new JButton("4");	
	JButton n5 =new JButton("5");
	JButton n6 =new JButton("6");
	JButton n7 =new JButton("7");
	JButton n8 =new JButton("8");
	JButton n9 =new JButton("9");
	JButton n0 =new JButton("0");
	JButton div =new JButton("/");
	JButton mul =new JButton("*");	
	JButton add =new JButton("+");
	JButton sub =new JButton("-");
	JButton mod =new JButton("%");
	JButton eq =new JButton("=");
	JButton clear =new JButton("<-");
	int flag=0; 
			
	

	
	MyFrame(){
		
		
	
	    c=this.getContentPane();
		c.setLayout(null);
		
	    tf.setBounds(2,10,234,50);//location=left,top,width,height
		
	    clear.setBounds(2,90,50,40);//location=left,top,width,height
	    n0.setBounds(62,90,50,40);//location=left,top,width,height
		div.setBounds(186,90,50,40);//location=left,top,width,height
		mod.setBounds(124,90,50,40);//location=left,top,width,height
		
	    n7.setBounds(2,140,50,40);//location=left,top,width,height
	    n8.setBounds(62,140,50,40);//location=left,top,width,height
		n9.setBounds(124,140,50,40);//location=left,top,width,height
		mul.setBounds(186,140,50,40);//location=left,top,width,height
		
	    n4.setBounds(2,190,50,40);//location=left,top,width,height
	    n5.setBounds(62,190,50,40);//location=left,top,width,height
		n6.setBounds(124,190,50,40);//location=left,top,width,height
		sub.setBounds(186,190,50,40);//location=left,top,width,height
		
		n1.setBounds(2,240,50,40);//locations=left,top,width,height
	    n2.setBounds(62,240,50,40);//location=left,top,width,height
		n3.setBounds(124,240,50,40);//location=left,top,width,height
		add.setBounds(186,240,50,40);//location=left,top,width,height
        
		eq.setBounds(2,290,234,30);
		
		


		n1.addActionListener(this);
		n2.addActionListener(this);
		n3.addActionListener(this);
		n4.addActionListener(this);
		n5.addActionListener(this);
		n6.addActionListener(this);
		n7.addActionListener(this);
		n8.addActionListener(this);
		n9.addActionListener(this);
		n0.addActionListener(this);
		clear.addActionListener(this);
		mod.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		sub.addActionListener(this);
		add.addActionListener(this);
		eq.addActionListener(this);
		
		
		
		c.add(tf);
		c.add(n1);
        c.add(n2);
		c.add(n3);
		c.add(n4);
		c.add(n5);
        c.add(n6);
		c.add(n7);
		c.add(n8);
		c.add(n9);
		c.add(n0);
		c.add(clear);
		c.add(mod);
		c.add(add);
        c.add(sub);
		c.add(div);
		c.add(mul);
		c.add(eq);
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
		        if(e.getSource()==n1){
	
			tf.setText(tf.getText()+"1");	
        }
			    if (e.getSource()==n2){
	
			tf.setText(tf.getText()+"2");	
        }
				 if (e.getSource()==n3){
	
			tf.setText(tf.getText()+"3");	
        }
				 if (e.getSource()==n4){
	
			tf.setText(tf.getText()+"4");	
        }
				 if (e.getSource()==n5){
	
			tf.setText(tf.getText()+"5");	
        }
				 if (e.getSource()==n6){
	
			tf.setText(tf.getText()+"6");	
        }
				 if (e.getSource()==n7){
	
			tf.setText(tf.getText()+"7");	
        }		 if (e.getSource()==n8){
	
			tf.setText(tf.getText()+"8");	
        }		 if (e.getSource()==n9){
	
			tf.setText(tf.getText()+"9");	
        }	     if (e.getSource()==n0){
	
			tf.setText(tf.getText()+"0");	
        }		 if (e.getSource()==add){
	
			tf.setText(tf.getText()+" + ");
			flag=4;
			
        }		 if (e.getSource()==sub){
			
			tf.setText(tf.getText()+" - ");
			flag=3;	
        }
		         if (e.getSource()==mul){
	
			tf.setText(tf.getText()+" * ");
			flag=2;
			
        }		 if (e.getSource()==div){
	
			tf.setText(tf.getText()+" / ");
			flag=1;
        }		 if (e.getSource()==eq){
	
			tf.setText(tf.getText()+"=");
            String str=tf.getText();
            String []	substr=str.split("\\s");
            float num1=Float.parseFloat(substr[0]);
			float num2=Float.parseFloat(substr[2]);
			
			if(flag==1){
				tf.setText(tf.getText()+" "+(num1/num2));
			}
			if(flag==2){
				tf.setText(tf.getText()+" "+(num1*num2));
			}
			if(flag==3){
				tf.setText(tf.getText()+" "+(num1-num2));
			}
			if(flag==4){
				tf.setText(tf.getText()+" "+(num1+num2));
			}
			if(flag==5){
				tf.setText(tf.getText()+" "+(num1%num2));
			}
			if(flag==0){
				tf.setText(" ");
			}
			
        }
			if(e.getSource()==mod){
	
			tf.setText(tf.getText()+" % ");
			flag=5;	
        }
		        
		    if(e.getSource()==clear){
	
			tf.setText(" ");
			flag=0;
		}			
        }
		        
	}

class CAL{
	public static void main(String args[]){
		
		MyFrame frame = new MyFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,246,362);//location=left,top,width,height
		frame.setTitle("Java Button With Multiple Action Event");
			frame.setResizable(false);

		
		
		
		//btn.setEnabled(false); Disabled button
		
		// btn.setVisible(false); UnVisible or Hidden bUTTON
		
		//ImageIcon icon= new ImageIcon("IMG-20200208-WA0002.jpg");
		//btn.setSize(icon.getIconWidth(),icon.getIconHeight());
		
		


		frame.setVisible(true);
	}
}