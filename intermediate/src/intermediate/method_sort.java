package intermediate;

import java.util.*;

public class method_sort {
  public static void main(String[] args)
{
String[]stuff = {"apples", "lemons", "geese", "bacon", "youtube"};
List<String> l1 = Arrays.asList(stuff);

Collections.sort(l1);
System.out.printf("%s\n", l1);

Collections.sort(l1, Collections.reverseOrder());
System.out.printf("%s\n", l1);

}
}