package demo1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// ����Ԥ��300���Լ���Ʒ���д�����Ʒ��ÿ���۸�������ʾ
		int money = 300;
		System.out.println(money);
		String price = "12 52 14 69 52 48 32 48 522";
		System.out.println(price);
		// ת������
		String[] s = price.split("\\s+");
		int[] arr = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		// �������������
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
		//˼·��������ɺ󡣣���ȫ����ӣ�Ȼ���𼶵ݼ���ȥĩβ�Ǹ�
		
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
