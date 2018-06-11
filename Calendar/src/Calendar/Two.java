package Calendar;

import java.util.Scanner;

public class Two {
	 @SuppressWarnings("resource")
	public static void fun_2(){
		 int year,month;
		 Scanner in =new Scanner(System.in);
		 System.out.println("请输入您想要查看的哪一年的那一个月：");
		 year=in.nextInt();
		 month=in.nextInt();
		 Get_Time.fun(year, month-1);
	 }
}
