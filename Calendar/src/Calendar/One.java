package Calendar;

import java.util.Calendar;

public class One {
 public static void fun_1(){
	 Calendar ca=Calendar.getInstance();
	 int year=ca.get(Calendar.YEAR);
	 int month =ca.get(Calendar.MONTH);
	
	 Get_Time.fun(year, month);
 }
}
