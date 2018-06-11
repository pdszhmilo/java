package Calendar;

import java.util.Calendar;

public class Get_Time{
	 
	public static void fun(int year,int month){
		System.out.println("\n-----------------------"+year+"年"+(month+1)+"月"+"--------------------");
		   System.out.println("一\t二\t三\t四\t五\t六\t日");
		Calendar ca=Calendar.getInstance();
		ca.set(Calendar.YEAR,year);
		ca.set(Calendar.MONTH,month);	
		ca.set(Calendar.DAY_OF_MONTH,1);
		//西方把星期日当做每星期第一天
		int week=ca.get(Calendar.DAY_OF_WEEK)-1;
		// 下段代码防止当每月第一天为星期一的时候不进行for直接while换行
		if(week==0)
		{   
			System.out.print("\t\t\t\t\t\t");
		}
	for(int i=1;i<week;i++){
			System.out.print("\t");
	}
	
	while(ca.get(Calendar.MONTH)== month){
			System.out.print(ca.get(Calendar.DAY_OF_MONTH)+"\t");
			if((ca.get(Calendar.DAY_OF_WEEK)-1)==0){
				System.out.print("\n");
			}
			ca.add(Calendar.DAY_OF_MONTH,1);
	}
	}
}

