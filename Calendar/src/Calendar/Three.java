package Calendar;

import java.util.Scanner;

public class Three {
	 public static void fun_3(){
		 int year;
		 @SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		 System.out.println("请输入您想要查看的年份：");
	    while(true){
		 if(in.hasNextInt()){
		 year=in.nextInt();
		 	break;
		 }
		 else{
			 System.out.println("请输入正确的数据（年份必须是数字且大于0）：");
		 }
	    }
		for(int i=0;i<12;i++)
		 Get_Time.fun(year, i);
	 }
	}
