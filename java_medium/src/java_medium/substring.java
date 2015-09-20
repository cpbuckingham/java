package java_medium;

public class substring {

	public static void main(String[] args) {

		String s = "cameronpaulbuckingham";
		String a = "Bacon";
		String b = "Monster";
		String c = "        trim         ";
		
		//indexOf
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('a', 5));
		System.out.println(s.indexOf('x'));
		System.out.println(s.indexOf("buck"));
		
		//concat
		System.out.println(a.concat(b));
		
		//replace
		System.out.println(a.replace('B','F'));
		System.out.println(a.replace('B','7'));
		
		//toUpperCase
		System.out.println(a.toUpperCase());
		
		//trim
		System.out.println(c);
		System.out.println(c.trim());
		
		
	}
		
	
		

}
