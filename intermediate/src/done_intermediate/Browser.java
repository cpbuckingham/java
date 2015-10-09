package done_intermediate;

import java.net.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;


public class Browser extends JFrame{
  private JTextField addressBar;
  private JEditorPane display;
  //constructor
  public Browser(){
    super("Buckwild Browser");
    addressBar= new JTextField("Enter a url please!");
    addressBar.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent event){
          load(event.getActionCommand());
        }
      }
    );
    add(addressBar, BorderLayout.NORTH);
    display = new JEditorPane();
    display.setEditable(false);
    //do you want to be able to edit the content...false, only view it
    display.addHyperlinkListener(
      new HyperlinkListener(){
        public void hyperlinkUpdate(HyperlinkEvent event){
          if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
            //did they click the link?
            load(event.getURL().toString());
          }
        }
      }
    );
    add(new JScrollPane(display), BorderLayout.CENTER);
    setSize(500,300);
    setVisible(true);
  }
  //load to display on the screen
  private void load(String userText){
    try{
        display.setPage(userText);
        addressBar.setText(userText);
        //setpage takes what is displayed and makes it a url
    }catch(Exception e){
      System.out.println("bummer");
    }
  }
}
