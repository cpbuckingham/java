package mid_intermediate;

import java.net.*;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class sites_applet extends JApplet{

  private HashMap<String, URL> websiteInfo;
  private ArrayList<String> titles;
  private JList mainList;

  //init
  public void init(){
  websiteInfo = new HashMap<String, URL>();
  titles = new ArrayList<String>();

  grabHTMLInfo();
  add(new JLabel("What site do you want to visit?"), BorderLayout.NORTH);
  mainList = new JList(titles.toArray());

  mainList.addListSelectionListener(
  new ListSelectionListener(){
    public void valueChanged(ListSelectionEvent event){
      Object object = mainList.getSelectedValue();
      URL newDocument = websiteInfo.get(object);
      AppletContext browser = getAppletContext();
      browser.showDocument(newDocument);
    }
  }
  );
}
}