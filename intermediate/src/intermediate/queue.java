package intermediate;

import java.util.*;

public class queue {
  public static void main(String[] args)
{
PriorityQueue<String> q = new PriorityQueue<String>();
q.offer("first");
q.offer("second");
q.offer("third");
System.out.printf("%s ", q);
System.out.printf("%s ", q.peek());

q.poll();

System.out.printf("%s ", q);
}
}