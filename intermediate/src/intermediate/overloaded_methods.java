package intermediate;

import java.util.*;

public class overloaded_methods {
  public static void main(String[] args)
{
Integer[] iray = {1,2,3,4};
Character[] cray = {'c', 'a', 'm'};

printMe(iray);
printMe(cray);
}
public static void printMe(Integer[] i ){
for (Integer x : i)
System.out.printf("%s ", x);

}
public static void printMe(Character[] i ){
for (Character x : i)
System.out.printf("%s ", x);
}
}