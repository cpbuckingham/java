package java_medium;
import java.util.*;

//it holds stuff and is dynamic, you don't have to give it a number
//set cannot contain dups
//list can contain dups

public class intro_to_collections {
	
	public static void main(String[] args){
		String[] things= {" eggs", " lasers", " hats", " pie"};
		List<String> list1 = new ArrayList<String>();
		String[] morethings = {" lasers", " hats"};
		List<String> list2 = new ArrayList<String>();
		
		
		//add array items to list
		
		for(String x:things)
			list1.add(x);
		
		//add array items to another list

		for(String x:morethings)
			list2.add(x);
		
		for(int i =0;i<list1.size();i++){
			System.out.printf("%s", list1.get(i));
		}
		
		editlist(list1,list2);
		System.out.println();
		
		for(int i =0;i<list1.size();i++){
			System.out.printf("%s", list1.get(i));
		
	}
}

	public static void editlist(Collection<String> l1, Collection<String>l2){
		Iterator<String> it = l1.iterator();
		while(it.hasNext()){
			if(l2.contains(it.next()))
			it.remove();
			
		}
	}
	}