package second.Exam_12817_20161209_2;
import java.util.Scanner;
public class test02 {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);// 创建输入流扫描器
    System.out.println("请输入日期：");// 提示用户输入
    String line1 = scanner.nextLine();// 获取用户输入的一行文本
    

  int year= Integer.valueOf(line1.substring(0, 4));
    
   int mouth =  Integer.valueOf(line1.substring(5, 7));
   int day= Integer.valueOf(line1.substring(8, 10));
 
   
   
switch (mouth) {
case 1:
	System.out.println( "您输入的日期为这一年的第"+Integer.valueOf(line1.substring(8,10)));
	break;
case 2:
	int h=31+28;
	int k=31+29;
	if((year%4==0)&&(year%100!=0)||(year%400==0)){System.out.println("您输入的日期为这一年的第"+h);}
	else {
		System.out.println("您输入的日期为这一年的第"+k);
	}
	
	break;
case 3:
	int h3=31+28+day;

	System.out.println("您输入的日期为这一年的第"+h3+"天");
	break;
case 4:
	int h4=31+28+31+day;
	System.out.println("您输入的日期为这一年的第"+h4+"天");
	break;	
case 5:
	int h5=31+28+31+day+30;
	System.out.println("您输入的日期为这一年的第"+h5+"天");
	break;	
case 6:
	int h6=31+28+31+day+30+31;
	System.out.println("您输入的日期为这一年的第"+h6+"天");
	break;	
case 7:
	int h7=31+28+31+day+30+31+30;
	System.out.println("您输入的日期为这一年的第"+h7+"天");
	break;

case 8:
	int h8=31+28+31+day+30+31+30+31;
	System.out.println("您输入的日期为这一年的第"+h8+"天");
	break;
case 9:
	int h9=31+28+31+day+30+31+30+31+31;
	System.out.println("您输入的日期为这一年的第"+h9+"天");
	break;
case 10:
	int h10=31+28+31+day+30+31+30+31+31+30;
	System.out.println("您输入的日期为这一年的第"+h10+"天");
	break;
case 11:
	int h11=31+28+31+day+30+31+30+31+31+30+31;
	System.out.println("您输入的日期为这一年的第"+h11+"天");
	break;
case 12:
	int h12=31+28+31+day+30+31+30+31+31+30+31+30;
	System.out.println("您输入的日期为这一年的第"+h12+"天");
	break;
}
	
   

	}}

