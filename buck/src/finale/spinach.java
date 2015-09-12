package finale;

import javax.swing.*;

public class spinach {
	public static void main (String[] args){
	
	JFrame go=new JFrame("paint");
	go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	paint p = new paint();
	go.add(p);
	go.setSize(400,250);
	go.setVisible(true);
}
}



