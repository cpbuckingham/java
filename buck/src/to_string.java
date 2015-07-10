
public class to_string {
	private int month;
	private int day;
	private int year;
	private static to_string to_stringObject;
	
	public to_string(int m, int d, int y){
		month= m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this);
	}
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
	public static void main(String[] args){
		to_stringObject = new to_string(4,5,6);
	}
}
