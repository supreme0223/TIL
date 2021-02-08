package client;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JCheckBox;

public class ClientUi {

	public static void main(String[] args) {

		Frame f = new Frame("My Chat");
		Panel p = new Panel();
		Panel p2 = new Panel();
		Button b1 = new Button("Send");
		Button b2 = new Button("Setting");
		Button b3 = new Button("Search");
		JCheckBox c1 = new JCheckBox ("read", false);
		JCheckBox c2 = new JCheckBox ("alarm", false);
		TextField tf = new TextField(30);
		TextArea ta = new TextArea();
		
		WindowListener fHandler = new MyFrameHandler();
		f.addWindowListener(fHandler);
		
		MyButtonHandler b1Handler = new MyButtonHandler();
		MyButtonHandler b2Handler = new MyButtonHandler();
		MyButtonHandler b3Handler = new MyButtonHandler();
		b1Handler.setTextArea(ta);
		b1Handler.setTextField(tf);
		b1.addActionListener(b1Handler);
		b2.addActionListener(b2Handler);
		b3.addActionListener(b3Handler);
		
		tf.addActionListener(b1Handler);
		
//		Button b2 = new Button("Send 2");
//		Button b3 = new Button("Send 3");
//		Button b4 = new Button("Send 4");
//		Button b5 = new Button("Send 5");
		//Color bgColor = new Color(123,24,56);
		
		//GridLayout mgr = new GridLayout(2,3);
		//FlowLayout mgr = new FlowLayout();
		//f.setLayout(mgr);
		
		f.add(ta, BorderLayout.CENTER);
		f.add(p, BorderLayout.SOUTH);
		f.add(p2, BorderLayout.EAST);
		p.add(tf);
		p.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(c1);
		p2.add(c2);
		
	//	p.add(b2);
	//	p.add(b3);
	//	p.add(b4);
	//	p.add(b5);
		p.setBackground(Color.gray);
		p2.setBackground(Color.gray);
	
		f.setBackground(Color.green);
		f.setLocation(800,200);
		f.setSize(400,500);
		f.setVisible(true);
	}

}
