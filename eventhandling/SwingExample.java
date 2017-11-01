
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class SwingExample {

	/**
	 * @param args
	 */
	public void sample(){
		
		JFrame jf=new JFrame();
		TextField tf=new TextField("Hello");
		
		Button bt=new Button("Click");
		
		tf.setBounds(30, 50, 100, 30);
		bt.setBounds(100, 90, 120, 30);
		jf.setSize(300,300);
		jf.add(tf);jf.add(bt);
		
		jf.setTitle("Sample");
		jf.setLayout(null);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingExample obj=new SwingExample();
		obj.sample();

	}

}
