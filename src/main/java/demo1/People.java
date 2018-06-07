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
		System.out.println("父类的静态代码块");
	}
	{
		System.out.println("父类的代码块");
	}
	public static void say(){
		System.out.println("父类的静态方法");
	}
	public  void say2(){
		System.out.println("父类的方法");
	}
	public People() {
		System.out.println("父类的构造器");
	}
	
}
