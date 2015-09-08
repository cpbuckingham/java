package finale;

import java.awt.*;
import javax.swing.*;


public class graphics extends JPanel {

	public void paintComponent(Graphics g ){
		super.paintComponent(g);
		this.setBackground(Color.CYAN);
		
		g.setColor(Color.MAGENTA);
		g.fillRect(25,25,100,30);
		
		g.setColor(new Color(190,81,215));
		g.fillRect(25,65,100,30);

		g.setColor(Color.YELLOW);
		g.drawString("this is some text",25,120);
	}
}