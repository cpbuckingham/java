package intermediate;

import java.util.*;

public class method_reverse_copy {
  public static void main(String[] args)
{
 //create an array and convert to list
 Character[] ray = {'p', 'w', 'n'};
 List<Character> lorem = Arrays.asList(ray);
 System.out.println("List is : ");
 output(lorem);

//reverse and print out the list
Collections.reverse(lorem);
System.out.println("After reverse list is : ");
output(lorem);

 //create new a array and a new list
 Character[] newray = new Character[3];
 List<Character> listCopy = Arrays.asList(newray);

 //copy contents of list into list copy
 Collections.copy(listCopy, lorem);
 System.out.println("Copy of list is : ");
 output(listCopy);

 //fill collection with stuff
 Collections.fill(lorem,'X');
 System.out.println("After filling the list : ");
 output(lorem);
}
//output method
private static void output(List<Character> thelist){
for(Character thing: thelist)
System.out.printf("%s\n", thing);
}
}