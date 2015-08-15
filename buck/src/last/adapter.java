package last;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JPanel;

public class adapter extends JFrame {
	private String details;
	private JLabel statusbar;
	
	public adapter(){
		super("adapter");
		
		statusbar= new JLabel("this is default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
		
		
	}
	private class Mouseclass extends MouseAdapter{
		public void mouseCLicked(MouseEvent event){
			details = String.format("You clicked %d", event.getClickCount());
			
			if(event.isMetaDown())
				details += "with right mouse button";
			else if(event.isAltDown())
				details += "either center mouse button";
			else
				details += "with left mouse button";
			statusbar.setText(details);
			}
	}
}
