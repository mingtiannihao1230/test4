package demo1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// 假设预算300，以及商品店中存在商品的每件价格如下所示
		int money = 300;
		System.out.println(money);
		String price = "12 52 14 69 52 48 32 48 522";
		System.out.println(price);
		// 转化数组
		String[] s = price.split("\\s+");
		int[] arr = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		// 对数组进行排序
		for (int i = 1; i < arr.length; i++) {
			int index = 0;
			for (int j = 1; j <= arr.length - i; j++) {
				if (arr[j] > arr[index]) {
					index = j;
				}
			}
			int temp = arr[arr.length - i];
			arr[arr.length - i] = arr[index];
			arr[index] = temp;
		}
		//思路：排序完成后。，先全部相加，然后逐级递减减去末尾那个
		
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr.length-i;j++){
				sum+=arr[j];
			}
			if(money>=sum){
				System.out.println(sum);
				break;
			}
		}
	}
}
