package done_intermediate;

import javax.swing.JFrame;

public class ClientTest{
  public static void main(String[] args){
      Client harry;
      harry = new Client("127.0.0.1");
      //^^your ip address for localhost
      harry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      harry.startrunning();
  }
  //exectuing the client class
}
