package mid_intermediate;

import java.awt.*;
import javax.swing.*;

public class DrawOval extends JPanel{
  private int d = 10;

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.fillOval(10,10,d,d);
  }
  public void setD(int newD){
    d= (newD>=0 ? newD : 10);
    //if its greater than 0, just set it equal to whatever is passed in
    //and if nothing is passed, just used 10
    repaint();
  }

  public Dimension getPreferredSize(){
    return new Dimension(200,200);
  }
  public Dimension getMinimumSize(){
    return getPreferredSize();
  }
}