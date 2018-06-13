package Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Four {
		@SuppressWarnings("resource")
		public static void fun_4() {
			 Calendar c =Calendar.getInstance();
		Scanner in =new Scanner(System.in);
		System.out.println("请输入要查看多少天前的日期：");
		int day=in.nextInt();
		day=0-day;
		 c.add(Calendar.DAY_OF_MONTH,day);
		 day=0-day;
	 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");    
	 System.out.println(day+"天前的日期是:"+format.format(c.getTime()));  		
		 }
		
	}

