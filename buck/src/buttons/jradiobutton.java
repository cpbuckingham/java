package buttons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jradiobutton extends JFrame{
	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public jradiobutton(){
		super("the title");
		setLayout(new FlowLayout());
		
		tf= new JTextField("Bucky is cool", 25);
		add(tf);
		
		pb= new JRadioButton("plain", true);
		bb= new JRadioButton("hold", false);
		ib= new JRadioButton("italic", false);
		bib= new JRadioButton("bold and italic", false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
	
		pf= new Font("Serif", Font.PLAIN, 14);
		bf= new Font("Serif", Font.BOLD, 14);
		itf= new Font("Serif", Font.ITALIC, 14);
		bif= new Font("Serif", Font.BOLD + Font.ITALIC, 14);
	
	
	}
	

}
