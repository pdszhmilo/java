package Calendar;

import java.util.Scanner;

public class Start {

@SuppressWarnings("resource")
public static void fun_start() {
	// TODO Auto-generated method stub

	  
	   System.out.println("---------功能菜单---------");
	   System.out.println("一、查看当月的日历，请按1");
	   System.out.println("二、查看某个月的日历(例：2015 9)，请按2");
	   System.out.println("三、查看某一年的日历(例：2015)，请按3");
	   System.out.println("四、查看若干天前的日期，请按4");
	   System.out.println("五、查看两个日期相差的天数，请按5");
	   System.out.println("六、查看距离您出生日期的天数，请按6");
	   System.out.print("现在请输入你想使用的功能代码是(并回车)：");
	   Scanner in =new Scanner(System.in);
	   int choose=in.nextInt();
	   switch(choose){
	   case 1:{
		   One.fun_1();
		   End.fun_end();
	   }
	   break;
	   case 2:{
		   Two.fun_2();
		   End.fun_end();
	   }
	   break;
	   case 3:{
		   Three.fun_3();
		   End.fun_end();
	   }
	   break;
	   case 4:{
		   Four.fun_4();
		   End.fun_end();
	   }
	   break;
	   case 5:try {
			Five.fun_5();
			 End.fun_end();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   break;
	   case 6:try {
			Six.fun_6();
			 End.fun_end();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   break;
	   }
	
}
}
