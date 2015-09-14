package java_medium;

public class common_string_methods {

	public static void main(String[] args) {
		String[] words ={"funk", "chunck", "furry", "baconator"};
		
		//startsWtih
		
		for (String w : words)
			if(w.startsWith("fu"))
				System.out.println(w + " starts with fu");
	
	for (String w : words)
		if(w.endsWith("unk"))
			System.out.println(w + " ends with unk");
}
}

