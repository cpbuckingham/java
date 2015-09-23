package intermediate;

import java.util.*;

public class generic_methods {
  public static void main(String[] args)
{
Integer[] iray = {1,2,3,4};
Character[] cray = {'c', 'a', 'm'};

printMe(iray);
printMe(cray);
}
//generic method
public static <T> void printMe(T[] x){
for (T b : x)
System.out.printf("%s ", b);
}
}