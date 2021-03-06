/**
	演示变量的初始化顺序
	涉及到5种方式：
	对于非静态变量(VarInitOrderTest0)：
		显示初始化，构造代码块初始化，构造方法初始化

	对于静态变量(StaticVarInitOrderTest1)：
		显示初始化，静态代码块初始化
*/
public class VarInitOrderTest0 
{
	public static void main(String[] args) 
	{
		Person zhangsan = new Person("张三",21);
		System.out.println(zhangsan);
	}
}

class Person 
{
	private String name;
	private int age;
	private double height = 170;
	{
		System.out.println("---------------构造代码块执行--------------");
		height = 175;
	}
	
	public Person(String name,int age)
	{
		System.out.println("---------------构造方法执行--------------");
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "["+this.getClass().getName()+":name = "+name+",age = "+age+",height = "+height+"]";
	}
}















































/**
	构造代码块以及直接初始化先于构造方法执行，二者的顺序与在程序中的先后顺序有关

	实质：都是放在构造器中执行的，显示初始化语句 double height = 170;
		被分割为：double height;
				  height = 170;
	
*/