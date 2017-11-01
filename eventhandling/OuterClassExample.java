import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
public class OuterClassExample {

	/**
	 * @param args
	 */
	TextField jf1,jf;
public void createWindow(){
		
		JFrame f = new JFrame();
		
		jf = new TextField("Enter Name");
		jf1 = new TextField("Email");
		Button btn = new Button("submit");
		
		jf.setBounds(30,30,150,40);
		jf1.setBounds(30, 100, 150, 40);
		
		btn.setBounds(60, 150, 120, 30);
		
		NewClass obj = new NewClass(this);
		
		btn.addActionListener(obj);
		f.add(jf);
		f.add(jf1);
		f.add(btn);
		f.setTitle("OuterClass");
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClassExample ex = new OuterClassExample();
		ex.createWindow();
	}

}
