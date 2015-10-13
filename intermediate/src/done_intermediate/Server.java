package done_intermediate;

import java.io.*;
import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Server extends JFrame{
  //server = computer that anyone can access
  private JTextField userText;
  private JTextArea chatWindow;
  private ObjectOutputStream output;
  private ObjectInputStream input;
  private ServerSocket server;
  private Socket connection;
  //socket = connection between your computer and other computer
  public Server(){
    super("Cameron's Instant Messanger");
    userText = new JTextField();
    userText.setEditable(false);
    userText.addActionListener(
    new ActionListener(){
      public void actionPerformed(ActionEvent event){
        sendMessage(event.getActionCommand());
        userText.setText("");
      }
    }
    );
    add(userText, BorderLayout.NORTH);
    chatWindow = new JTextArea();
    add(new JScrollPane(chatWindow));
    setSize(300,150);
    setVisible(true);
  }
//set up and run the server
    public void startrunning(){
      try{
        server = new ServerSocket(6789,100);
        while(true){
          try{
            waitforConnection();
            setupStreams();
            whileChatting();
          }catch(EOFException eofException){
            showMessage("\n Server ended connection");
          }finally{
            closeIt();
          }
          }
      }catch(IOException IOException){
        IOException.printStackTrace();
      }

    }
  //wait for connection, then display connection info
  private void waitforConnection() throws IOException{
    showMessage("Waiting for someone to connect . . . \n");
    connection = server.accept();
    showMessage("Now connected to "+connection.getInetAddress().getHostName());
  }
  //get stream to send and receive data
  private void setupStreams() throws IOException{
    output = new ObjectOutputStream(connection.getOutputStream());
    output.flush();
    input = new ObjectInputStream(connection.getInputStream());
    showMessage("\n Streams are setup");
  }
  //during the conversation
  private void whileChatting() throws IOException{
    String message = "You are now connected";
      sendMessage(message);
      ableToType(true);
      do{
        //have a conversation
        try{
          message=(String) input.readObject();
          showMessage("\n" + message);
        }catch(ClassNotFoundException ClassNotFoundException){
          showMessage("\n hacked");
        }
      }while(!message.equals("CLIENT-END"));
  }
  //closing sockets and ServerSocket
  private void closeIt(){
    showMessage("\n Closing Connections");
    ableToType(false);
    try{
      output.close();
      input.close();
      connection.close();
    }catch(IOException IOException){
      IOException.printStackTrace();
    }
  }
  //send message to CLIENT
  private void sendMessage(String message){
    try{
      output.writeObject("SERVER - "+message);
      output.flush();
      showMessage("\n SERVER - "+message);
      //method that sends message through the output
    }catch(IOException IOException){
      chatWindow.append("\n ERROR - MESSAGE NOT DELIVERED");
    }
  }
  // update chatWindow
  private void showMessage(final String text){
    SwingUtilities.invokeLater(
      new Runnable(){
        public void run(){
          chatWindow.append(text);
        }
      }
    );
      }
    //allows the user to type text into their area
    private void ableToType(final boolean tof){
      SwingUtilities.invokeLater(
      new Runnable(){
        public void run(){
          userText.setEditable(tof);
        }
      }
      );
    }

}
