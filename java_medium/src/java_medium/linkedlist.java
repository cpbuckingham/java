package java_medium;
import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
			
		String[] things1={" apples", " noobs"," pwnge", " bacon"," goATS"};
		List<String> list1= new LinkedList<String>();
		for (String x : things1)
			list1.add(x);
		
		String[] things2={" sausage", " bacon"," goats", " harrypotter"};
		List<String> list2= new LinkedList<String>();
		for (String x : things2)
			list2.add(x);
		
		list1.addAll(list2);
		list2=null;
		
		printMe(list1);
		removeStuff(list1,2,5);
		printMe(list1);
		reverseMe(list1);
		
	}
		private static void printMe(List<String>l){
			for (String b:l)
				System.out.printf("%s ", b);
				System.out.println();
		}
		
		private static void removeStuff(List<String> l, int from, int to){
			l.subList(from,to).clear();
		}
		private static void reverseMe(List<String>l){
			ListIterator<String> cam = l.listIterator(l.size());
			while(cam.hasPrevious())
				System.out.printf("%s", cam.previous());
		}
		
	

}
