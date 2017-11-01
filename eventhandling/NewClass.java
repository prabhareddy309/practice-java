
import java.awt.*;
import java.awt.event.*;

public class NewClass implements ActionListener {

	/**
	 * @param args
	 *
	 */
	OuterClassExample obj;
	
	NewClass(OuterClassExample obj){
		this.obj=obj;
	}
	
	public void actionPerformed(ActionEvent e){
		
		obj.jf.setText("hello");
		obj.jf1.setText("ganehs@gmail.com");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
