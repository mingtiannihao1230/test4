package demo1;

public class Test1 {
	public static void main(String[] args) {
		//����ֵ�ͷ���ֵ
		int m=3;
		int d=8;
		System.out.println(m+" "+d);
		String msg="HAPPY";
		System.out.println(msg);
		//ԭ��������
		char[][] arr=new char[][]{{'A','B','C','D','E','F','G','H','I'},
									{'J','K','L','M','N','O','P','Q','R'},
									{'S','T','U','V','W','X','Y','Z','*'}};
		//ת���������
		char[][] newArr=new char[3][9];
		char[][] new2Arr=new char[3][9];
		//����������
		//������
		for(int i=0;i<arr.length;i++){
			//�ڲ����
			for(int j=0;j<arr[i].length;j++){
				//�ƶ�d-1�Σ��ҵھŴ��ƶ��͸�ԭ��Ҳ����10�·�,
				int dd=(d-1)%9;//�ƶ�λ��
				//�ж���û�е���������
				if(j+dd<=arr[i].length-1){
					newArr[i][j]=arr[i][j+dd];
				}else{
					newArr[i][j]=arr[i][j+dd-arr[i].length];
				}
			}
			//������
			//�ƶ�m-1�Σ�����ƶ�3�ξ͸�ԭ�������¸�ԭ
			int mm=(m-1)%3;
			if(i+mm<=newArr.length-1){
				new2Arr[i]=newArr[i+mm];
			}else{
				new2Arr[i]=newArr[i+mm-newArr.length];
			}
		}
		//ȫ���������
		//���Խ��������ɵ�
		/*for (int x = 0; x < new2Arr.length; x++) {  
            for (int y = 0; y < new2Arr[x].length; y++) {  
                System.out.print(new2Arr[x][y] + "��");  
            }  
            System.out.println("");  
        } */ 
		//��ʼ���ҽ��
		char[] arrMsg=msg.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arrMsg.length;i++){
			for (int x = 0; x < new2Arr.length; x++) {  
	            for (int y = 0; y < new2Arr[x].length; y++) {  
	            	if(arrMsg[i]==new2Arr[x][y]){
	            		//ƴ�ӽ����
	            		sb.append((x+1)+""+(y+1)+" ");
	            	}
	               // System.out.print(new2Arr[x][y] + "��");  
	            }  
	             
	        }  
		}
		System.out.println(sb.toString().trim());
		
	}
}
