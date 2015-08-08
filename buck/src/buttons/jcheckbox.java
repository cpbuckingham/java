package buttons;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class jcheckbox extends JFrame {
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	
	public jcheckbox(){
		super("the title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("This is a sentence", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));
		add(tf);
		
		
		boldbox= new JCheckBox("bold");
		italicbox= new JCheckBox("italic");
		add(boldbox);
		add(italicbox);
		

	}
}
