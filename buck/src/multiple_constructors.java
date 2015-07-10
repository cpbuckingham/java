
public class multiple_constructors {
	private int hour;
	private int minute;
	private int second;
	
	public multiple_constructors(){
		this(0,0,0);
		
	}
	public multiple_constructors(int h){
		this(0,0,0);
	}
	public multiple_constructors(int h, int m){
		this(0,0,0);
	}
	public multiple_constructors(int h, int m, int s){
		setTime(0,0,0);
	}
	public void setTime(int h, int m, int s){
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	public void setHour(int h){
		hour = ((h>0&&h<24) ?h:0);
	}
	public void setMinute(int m){
		hour = ((m>0&&m<60) ?m:0);
	}
	public void setSecond(int s){
		hour = ((s>0&&s<60) ?s:0);
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
	}
	public static void main(String[] args){
		multiple_constructors multiple_constructorsObject = new multiple_constructors();
		multiple_constructors multiple_constructorsObject2 = new multiple_constructors(5);
		multiple_constructors multiple_constructorsObject3 = new multiple_constructors(5,13);
		multiple_constructors multiple_constructorsObject4 = new multiple_constructors(5,13,43);
		
		System.out.printf("%s\n", multiple_constructorsObject.toMilitary());
		System.out.printf("%s\n", multiple_constructorsObject2.toMilitary());
		System.out.printf("%s\n", multiple_constructorsObject3.toMilitary());
		System.out.printf("%s\n", multiple_constructorsObject4.toMilitary());
		
	}

}
