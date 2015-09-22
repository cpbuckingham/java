package intermediate;

import java.util.*;

public class frequency_disjoint {
  public static void main(String[] args)
{
String[] food= {"peas", "corn", "beets", "apples"};
List<String> list1 = Arrays.asList(food);

String[] sites= {"linkedin", "google", "galvanize", "youtube"};
List<String> list2 = Arrays.asList(sites);
System.out.println(Collections.frequency(list2,"youtube"));

boolean tof = Collections.disjoint(list1, list2);
System.out.println(tof);
if(tof)
System.out.println("these lists do not have anything in common");
else
System.out.println("these lists must had something in common");
}
}
