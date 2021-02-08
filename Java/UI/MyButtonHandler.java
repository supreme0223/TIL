package client;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonHandler implements ActionListener {
	
	TextArea ta;
	TextField tf;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// What you'd like to do
		
		String msg = tf.getText();
		ta.append(msg + "\n");
		tf.setText("");
		
	}

	
	public void setTextArea (TextArea ta) {
		this.ta = ta;
	}
	
	public void setTextField (TextField tf) {
		this.tf = tf;
	}
}
