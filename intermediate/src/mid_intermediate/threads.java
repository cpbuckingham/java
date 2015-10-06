package mid_intermediate;

import java.util.*;
//runnable interface contains run()method
public class threads implements Runnable{
String name;
int time;
Random r = new Random();

public threads(String x){
  name = x;
  time = r.nextInt(999);
}
public void run(){
  try{
    System.out.printf("%s is sleeping for %d\n", name, time);
    Thread.sleep(time);
    System.out.printf("%s is done\n", name);
  }catch(Exception e){}
}
}