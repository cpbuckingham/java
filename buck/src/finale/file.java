package finale;

import java.io.File;

public class file {
	public static void main(String[] args){
		File x = new File("Users\\cpbuckingham\\pp\\java\\workspace\\buck\\go.txt");
		
		if (x.exists())
			System.out.println(x.getName() + " exist!");
		else
			System.out.println("this things doesn't exist");
		
	}
}