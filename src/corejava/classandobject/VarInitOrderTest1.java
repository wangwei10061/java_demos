/**
	演示变量的初始化顺序
	涉及到5种方式：
	对于非静态变量(VarInitOrderTest0)：
		显示初始化，构造代码块初始化，构造方法初始化

	对于静态变量(StaticVarInitOrderTest1)：
		显示初始化，静态代码初始化
*/

public class VarInitOrderTest1
{
	static {
		bookname = "Thinking in java";
	}

	private static String bookname = "core java";

	public static void main(String[] args) 
	{
		System.out.println(VarInitOrderTest1.bookname);
	}
}























/**
	两者的执行顺序与在它们在源程序中排列的顺序有关
*/