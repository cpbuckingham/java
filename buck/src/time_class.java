
public class time_class {
		private int hour;
		private int minute;
		private int second;
		
		
		public void setTime(int h, int m, int s){
			hour = ((h>0 && h<23) ? h : 0);
			minute = ((m>0 && m<60) ? m : 0);
			second = ((s>0 && h<60) ? s : 0);
			
		}
		public String toMilitary(){
			return String.format("%02d:%02d:%02d", hour, minute, second );
		}
		public String toNormal(){
			return String.format("%d:%02d:%02d%s", ((hour==0||hour==12)?12: hour %12), minute, second, (hour<12? " AM": " PM"));
		}
		public static void main(String[]args){
			time_class time_classObject = new time_class();
			System.out.println(time_classObject.toMilitary());
			time_classObject.setTime(20,45,73);
			System.out.println(time_classObject.toMilitary());
			System.out.println(time_classObject.toNormal());
		}
	}
