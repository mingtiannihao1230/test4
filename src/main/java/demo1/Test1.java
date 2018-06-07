package demo1;

public class Test1 {
	public static void main(String[] args) {
		//传入值和返回值
		int m=3;
		int d=8;
		System.out.println(m+" "+d);
		String msg="HAPPY";
		System.out.println(msg);
		//原来的数组
		char[][] arr=new char[][]{{'A','B','C','D','E','F','G','H','I'},
									{'J','K','L','M','N','O','P','Q','R'},
									{'S','T','U','V','W','X','Y','Z','*'}};
		//转化后的数组
		char[][] newArr=new char[3][9];
		char[][] new2Arr=new char[3][9];
		//遍历旧数组
		//外层遍历
		for(int i=0;i<arr.length;i++){
			//内层遍历
			for(int j=0;j<arr[i].length;j++){
				//移动d-1次，且第九次移动就复原，也就是10月份,
				int dd=(d-1)%9;//移动位置
				//判断有没有到索引最大端
				if(j+dd<=arr[i].length-1){
					newArr[i][j]=arr[i][j+dd];
				}else{
					newArr[i][j]=arr[i][j+dd-arr[i].length];
				}
			}
			//外层遍历
			//移动m-1次，最大移动3次就复原，及四月复原
			int mm=(m-1)%3;
			if(i+mm<=newArr.length-1){
				new2Arr[i]=newArr[i+mm];
			}else{
				new2Arr[i]=newArr[i+mm-newArr.length];
			}
		}
		//全部排序完成
		//测试结果排序完成的
		/*for (int x = 0; x < new2Arr.length; x++) {  
            for (int y = 0; y < new2Arr[x].length; y++) {  
                System.out.print(new2Arr[x][y] + "、");  
            }  
            System.out.println("");  
        } */ 
		//开始查找结果
		char[] arrMsg=msg.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arrMsg.length;i++){
			for (int x = 0; x < new2Arr.length; x++) {  
	            for (int y = 0; y < new2Arr[x].length; y++) {  
	            	if(arrMsg[i]==new2Arr[x][y]){
	            		//拼接结果集
	            		sb.append((x+1)+""+(y+1)+" ");
	            	}
	               // System.out.print(new2Arr[x][y] + "、");  
	            }  
	             
	        }  
		}
		System.out.println(sb.toString().trim());
		
	}
}
