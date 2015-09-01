package finale;

import java.util.*;

public class create_file {
	public static void main(String[] args){
		final Formatter x;
		
		try{
			x = new Formatter("go.txt");
			System.out.println("you created a file");
		}
		catch(Exception e ){
			System.out.println("you got an error");
		}
	}
}
