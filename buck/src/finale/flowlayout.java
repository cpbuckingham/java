package finale;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class flowlayout extends JFrame {
	
	private JButton lb;
	private JButton cb;
	private JButton rb;
	
	private FlowLayout layout;
	private Container container;

	public flowlayout(){
		super ("flow");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		//left stuff
		lb = new JButton("left");
		add(lb);
		lb.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
				
				);
		//center stuff
				cb = new JButton("center");
				add(cb);
				cb.addActionListener(
						new ActionListener(){
							public void actionPerformed(ActionEvent event){
								layout.setAlignment(FlowLayout.CENTER);
								layout.layoutContainer(container);
							}
						}
						
						);
				//right stuff
				rb = new JButton("right");
				add(rb);
				rb.addActionListener(
						new ActionListener(){
							public void actionPerformed(ActionEvent event){
								layout.setAlignment(FlowLayout.RIGHT);
								layout.layoutContainer(container);
							}
						}
						
						);
		
		
	}
		
	

}
