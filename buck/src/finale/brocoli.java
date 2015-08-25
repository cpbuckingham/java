package finale;

import javax.swing.*;

public class brocoli {
	public static void main (String[] args){
	JFrame go=new JFrame("graphics");
	go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	graphics p = new graphics();
	go.add(p);
	go.setSize(400,250);
	go.setVisible(true);
}
}



