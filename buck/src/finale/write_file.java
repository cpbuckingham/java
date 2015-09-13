package finale;

import java.io.*;
import java.lang.*;
import java.util.*;

public class write_file {
		
		private Formatter x;
		
		public void openFile(){
			try{
				x = new Formatter("scala.txt");
			}
			catch (Exception e){
				System.out.println("you have an error");
			}
		}
		
		public void addRecords(){
			x.format("%s%s%s", "20 ", "Cam ", "Buckingham "+"\n");
			x.format("%s%s%s", "21 ", "Lindsey ", "Buckingham "+"\n");
			x.format("%s%s%s", "22 ", "Jenna ", "Buckingham "+"\n");
		}
		public void closeFile(){
			x.close();
		}
		
	}

