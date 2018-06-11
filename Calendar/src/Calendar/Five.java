package Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Five {
	
	
	public static void fun_5() throws Exception {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("请输入第一个的时间点（yyyy-MM-dd）：");
		String a =in.nextLine();
		System.out.println("请输入第二个时间点（yyyy-MM-dd）：");
		String b =in.nextLine();
		 Date beginDate = format.parse(a);   
		 Date endDate = format.parse(b);   
		long day=(endDate.getTime()-beginDate.getTime())/(24*60*60*1000);
		System.out.println("相隔的天数是"+Math.abs(day)+"天");   
	}   
	
}
