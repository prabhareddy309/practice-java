import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassExample implements ActionListener {

	/**
	 * @param args
	 */
	TextField jf,jf1;
	
	public void getValues(String n,String e){
		
		JFrame f2=new JFrame();
		TextField t1=new TextField();
		TextField t2=new TextField();
		t1.setBounds(20, 50, 100, 40);
		t2.setBounds(20, 100, 160, 40);
		t1.setText(n);
		t2.setText(e);
		f2.setTitle("Value");
		f2.add(t1);f2.add(t2);
		f2.setSize(300,300);
		f2.setLayout(null);
		f2.setVisible(true);
	}
	public void createWindow(){
		
		JFrame f = new JFrame();
		
		jf = new TextField("Enter Name");
		jf1 = new TextField("Email");
		Button btn = new Button("submit");
		
		jf.setBounds(30,30,150,40);
		jf1.setBounds(30, 100, 150, 40);
		
		btn.setBounds(60, 150, 120, 30);
		
		f.add(jf);
		f.add(jf1);
		f.add(btn);
		f.setTitle("InnerClass");
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		
		btn.addActionListener(this);	
			
	}
	
	public void actionPerformed(ActionEvent e){
		String name=jf.getText();
		String email=jf1.getText();
		
		getValues(name,email);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassExample ex=new InnerClassExample();
		ex.createWindow();
	}

}
