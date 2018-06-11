package Calendar;

import java.util.Scanner;

public class End {
	@SuppressWarnings("resource")
	public static void fun_end(){
System.out.println("\n\n返回功能菜单请按1,推出程序请按2");
Scanner in =new Scanner(System.in);
  int i =in.nextInt();
switch(i){
case 1:Start.fun_start();
	break;
case 2:{
System.out.println("-----------------------欢迎再次使用--------------------");
	System.exit(0);
}
}
}
}
