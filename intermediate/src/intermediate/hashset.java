package intermediate;

import java.util.*;

public class hashset {
  public static void main(String[] args)
{
//set is a collection but it cannot contain dups
String[] food= {"peas", "corn", "beets", "apples", "corn"};
List<String> list = Arrays.asList(food);

System.out.printf("%s ", list);
Set<String> set = new HashSet<String>(list);
System.out.printf("%s ", set);
}
}