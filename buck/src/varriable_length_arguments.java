
public class varriable_length_arguments {
	public static void main(String [] args){
		System.out.println(average(4,6,8,123,45,63));
	}
	public static int average(int...numbers){
		//you don't know how many arguments you need^: elipse
		int total = 0;
		for(int x:numbers)
			total+=x;
		
		return total/numbers.length;
		
	}
}
