package intermediate;

import java.util.*;

public class add_all {
  public static void main(String[] args)
{
//convert stuff array to a list

String[] food= {"peas", "corn", "beets", "apples"};
List<String> list1 = Arrays.asList(food);

ArrayList<String> list2 = new ArrayList<String>();
list2.add("youtube");
list2.add("google");
list2.add("galvanize");
list2.add("linkedin");

for(String x : list2)
System.out.printf("%s\n",x);
System.out.println();
Collections.addAll(list2, food);
System.out.println();

for(String x : list2)
System.out.printf("%s\n",x);

}
}