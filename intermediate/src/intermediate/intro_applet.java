package intermediate;

import java.awt.*;
import javax.swing.*;

//applet - a way of using a java program through your browser (jdk applets exmaples)

public class intro_applet extends JApplet{
public void paint(Graphics g){
super.paint(g);
g.drawString("wow this actually worked?", 25, 25);
}

}