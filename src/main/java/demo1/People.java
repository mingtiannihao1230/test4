package demo1;

public class People {
	private int i;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	static{
		System.out.println("����ľ�̬�����");
	}
	{
		System.out.println("����Ĵ����");
	}
	public static void say(){
		System.out.println("����ľ�̬����");
	}
	public  void say2(){
		System.out.println("����ķ���");
	}
	public People() {
		System.out.println("����Ĺ�����");
	}
	
}
