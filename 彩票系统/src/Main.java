import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
        import java.util.Scanner;

public class Main {
    static int[] num =new int[7];
    static  int[] num2=new int[3];
    static int sum1=0,sum2=0;
    static LinkedList<String> res = new LinkedList<>();
    static LinkedList<String> res2 = new LinkedList<>();
    public static void main(String[] args)
    {
        System.out.println("                                                        欢迎进入彩票系统                         ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        while (true) {
            fun();
        }
    }
    static void fun(){
        System.out.println("                                             排列3玩法请按1");
        System.out.println("                                             双色球玩法请按2");
        System.out.println("                                                退出请按3");
        Scanner put=new Scanner(System.in);
             int k,i;
        switch(k=put.nextInt()){
            case 1:{
                System.out.println("您选择了排列3玩法");
                talk();
                xuanhao(3);
                break;
            }
            case 2:{
                System.out.println("您选择了双色球玩法");
                talk();
                xuanhao(7);
                break;
            }
            case 3:System.exit(0);
            default:System.out.printf("您输入错误，请重新选择功能:");
        }
        System.out.println("--------------------返回主菜单请按1--------------------------");
        System.out.println("----------------------退出请按2--------------------------------");
        System.out.printf("请选择您需要的功能：");
            switch (i=put.nextInt()){
               case 1:fun();break;
                case 2:{System.out.println("欢迎下次使用，再见。");System.exit(0   );}
              default:System.out.printf("您输入错误，请重新选择功能:");
                                    }
    }
    static void xuanhao(int o){
        Scanner put =new Scanner(System.in);
        int i=put.nextInt();
        switch (i){
            case 1:{
                System.out.print("您选择了自己选号,");
                count(o);
                rengong(o);
                kaijiang(o);
            } break;
            case 2: {
                System.out.println("您选择了机器帮您选号:");
                count(o);
                jixuan(o);
                kaijiang(o);
            } break;
            case 3: {
                check(o);
            } break;
            case 4:{System.out.println("欢迎下次使用，再见。");
                System.exit(0);
            }

            default:  System.out.println("您输入错误，请重新选择功能:");
        }
    }
    static void rengong(int o) {
        System.out.println("请输入您要选择的"+o+"位号码（以空格隔开）:");
        Scanner in = new Scanner(System.in);
        for(int i=0;i<o;i++) {
                int j=in.nextInt();
            if(o==7)num[i] = j;
            else  num2[i]  =j;
        }
    }
    static void  jixuan(int o){
        Random random = new Random();
        while(true) {
            for (int i = 0; i < o; i++) {
                if(o==7) num[i] = random.nextInt(34);
                else num2[i] = random.nextInt(10);
           }
            for (int i = 0; i < o; i++){
                if(o==7)  System.out.printf("%d ",num[i]);
               else System.out.printf("%d ",num2[i]);
            }

            System.out.println("\n您对本组号码满意吗？不满意可重新生成：Yes/No");
            System.out.println("--------------------------------------------------------------");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            String yes ="Yes";
            String no ="No";
                /*while(str!=yes|str!=no)
                {
                    System.out.println("\n输入有误，请重新输入：");
                        str = in.nextLine();
                }
                */
            if (str.equals(yes)){
                break;
            }
            else  if (str.equals(no)){
                continue;
            }

        }
    }
   static void  kaijiang(int o){
        Random random = new Random();
        int[] ran = new int[o];
         int Count1=0,Count2=0;
        String str="";
        for (int i = 0; i < o; i++) {
            if(o==7) ran[i] = random.nextInt(34);
           else ran[i] = random.nextInt(10);
          str = str + ran[i]+" ";
        }
        if(o==7) res.add(str);
        else  res2.add(str);
        System.out.println("--------------------------------------------------------------");
        System.out.println("您的号码为：");
        for (int i = 0; i < o; i++) {
            if (o == 7) System.out.printf("%d ", num[i]);
            else System.out.printf("%d ", num2[i]);
        }
        if(o==7)  System.out.println("\n第"+sum1+"期开奖号码为：");
        else System.out.println("\n第"+sum2+"期开奖号码为：");

        for (int i = 0; i < o; i++)
            System.out.printf("%d ",ran[i]);
        System.out.println("\n--------------------------------------------------------------");
        for(int i=0;i<o;i++) {
            if (o==7){
                if (num[i] == ran[i]) Count1++;}
                else{
                if (num2[i] == ran[i]) Count2++;
            }
        }
        if(o==7) {
            switch (Count1) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("很遗憾！您没有中奖。");
                    break;
                case 5:
                    System.out.println("恭喜您中了三等奖！");
                    break;
                case 6:
                    System.out.println("恭喜您中了二等奖！");
                    break;
                case 7:
                    System.out.println("恭喜您中了一等奖！");
                    break;
            }
        }
        else {
            switch (Count2) {
                case 0:
                    System.out.println("很遗憾！您没有中奖。");
                    break;
                case 1:
                    System.out.println("恭喜您中了三等奖！");
                    break;
                case 2:
                    System.out.println("恭喜您中了二等奖！");
                    break;
                case 3:
                    System.out.println("恭喜您中了一等奖！");
                    break;
            }
        }
    }
    static void check(int o){
        Scanner in =new Scanner(System.in);
        System.out.print("\n请输入要查询第几期的中奖号码：");
        int m = in.nextInt();
       System.out.println("\n"+"第"+m+"期中奖号码：");
        if(o==7)  System.out.print(res.get(m-1)+"\n");
        else System.out.print(res2.get(m-1)+"\n");

    }
    static void count(int i){
        if(i==7)sum1++;
       else  sum2++;
    }
    static void talk(){
        System.out.println("                                                     手动选号请按1");
        System.out.println("                                                     机器选号请按2");
        System.out.println("                                                     查看往期开奖号码请按3");
        System.out.println("                                                     退出请按4");
        System.out.printf("请选择您需要的功能：");
    }


}
