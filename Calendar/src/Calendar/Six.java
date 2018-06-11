package Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Six {

	public static void fun_6() throws Exception {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("请输入您的出生日期（yyyy-MM-dd）：");
		String start =in.nextLine();
		Date now =Calendar.getInstance().getTime();
		 Date birsday = format.parse(start);     
		long day=(now.getTime()-birsday.getTime())/(24*60*60*1000);
		System.out.println("您已经在地球上存活了"+Math.abs(day)+"天");   
		
	}

}
