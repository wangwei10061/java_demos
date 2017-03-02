package corejava.basegrammar;

/**
 * final修饰的引用变量不能再指向其他对象，但是指向的对象的内容可以改变
 */
class FinalObject
{
	
	public static void main(String[] args) 
	{
		final Person P = new Person("张三",56);
		Person p1 = new Person("李四",23);
//		P = p1;
		//P.setName("haha");
		System.out.println(P);
	}
}
class Person
{
	private String name;
	private int age;

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return name+age;
	}
}