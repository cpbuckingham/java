package last;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import javax.swing.JPanel;

public class mouse_events extends JFrame {
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public mouse_events(){
		super ("mouse events");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel ("default");
		add(statusbar, BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
		
	}
	
	private class Handlerclass implements MouseListener, MouseMotionListener{
		public void mouseClicked(MouseEvent event){
			statusbar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
			
		}
		public void mousePressed(MouseEvent event){
			statusbar.setText("you pressed down the mouse");
			
		}
		public void mouseReleased(MouseEvent event){
			statusbar.setText("you released the mouse");

		}
		public void mouseEntered(MouseEvent event){
			statusbar.setText("you entered the area");
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event){
			statusbar.setText("you exited the area");
			mousepanel.setBackground(Color.WHITE);
		}
		public void mouseDragged(MouseEvent event){
			statusbar.setText("you are dragging the mouse");
		}
		public void mouseMoved(MouseEvent event){
			statusbar.setText("you are moving the mouse");

		}
	}
}
