//import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class EventSample extends Frame implements ActionListener {
	TextField tf;
	
	EventSample(){
		tf=new TextField();
		tf.setBounds(60,50,170,20);
		Button b=new Button("Submit");
		b.setBounds(100,120,80,30);
		
		b.addActionListener(this);
		
		add(b);add(tf);
		
		setSize(300,300);
		setLayout(null);
		setVisible(false);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		tf.setText("Hello World");
		System.exit(0);
	}
	public static void main(String args[]){
		
		new EventSample();
		
	}
}
