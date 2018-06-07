package demo1;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第几个月");
		int month=sc.nextInt();
		int number=changeNum(month);
		System.out.println(number);
		
	}

	public static int changeNum(int month) {
		if(month==1||month==2){
			return 1;
		}else{
			return changeNum(month-1)+changeNum(month-2);
		}
		
	}
}
