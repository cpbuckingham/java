package done_intermediate;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame{
  //gui and connection
  private JTextField userText;
  private JTextArea chatWindow;
  private ObjectOutputStream output;
  private ObjectInputStream input;
  private String message = "";
  private String serverIP;
  private Socket connection;

  //constructor
  public Client(String host){
    //client is different from server class
    //client is just on the local computer
    //server is sitting on an accessable port
    super("Clients' Instant Messanger");
    serverIP = host;
    userText = new JTextField();
    userText.setEditable(false);
    userText.addActionListener(
    new ActionListener(){
      public void actionPerformed(ActionEvent event){
        sendData(event.getActionCommand());
        userText.setText("");
      }
    }
    );
    add(userText, BorderLayout.NORTH);
    chatWindow = new JTextArea();
    add(new JScrollPane(chatWindow), BorderLayout.CENTER);
    setSize(300,150);
    setVisible(true);
  }
  public void startrunning(){
    try{
          connectToSever();
          setupStreams();
          whileChatting();
        }catch(EOFException eofException){
          showMessage("\n Client ended connection");
        }catch(IOException IOException){
          IOException.printStackTrace();
        }finally{
          closeIt();
        }
        }
        //connect to server
        public void connectToSever() throws IOException{
          showMessage("Attempting connection . . . \n");
          connection = new Socket(InetAddress.getByName(serverIP), 6789);
          showMessage("Connected to: "+connection.getInetAddress().getHostName());
        }

        //set up streams to send and recevie messages
        private void setupStreams()throws IOException{
          output = new ObjectOutputStream(connection.getOutputStream());
          output.flush();
          input = new ObjectInputStream(connection.getInputStream());
          showMessage("\n You are connected");
        }
        //while chatting with server
        private void whileChatting() throws IOException{
            ableToType(true);
            do{
              try{
                message=(String) input.readObject();
                showMessage("\n " +message);
              }catch(ClassNotFoundException ClassNotFoundException){
                showMessage("\n hacked");
              }
            }while(!message.equals("SERVER-END"));
        }
        //closing sockets and servers
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
        //send message to SERVER
        private void sendData(String message){
          try{
            output.writeObject("CLIENT - "+message);
            output.flush();
            showMessage("\n CLIENT - "+message);
            //method that sends message through the output
          }catch(IOException IOException){
            chatWindow.append("\n ERROR - MESSAGE NOT DELIVERED");
          }
        }
        // update chatWindow
        private void showMessage(final String m){
          SwingUtilities.invokeLater(
            new Runnable(){
              public void run(){
                chatWindow.append(m);
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
