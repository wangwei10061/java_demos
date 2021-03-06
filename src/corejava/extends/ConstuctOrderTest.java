public class ConstuctOrderTest 
{
	public static void main(String[] args) 
	{
		new Dog("司狗");
	}
}
class Creature
{
	{
		System.out.println("Creature的构造代码块执行");
	}

	public Creature()
	{
		System.out.println("Creature的无参构造函数执行");
	}

	public Creature(String name)
	{
		this();
		System.out.println("Creature的构造函数执行,生物的名字叫："+name);
	}
}

class Animal extends Creature
{
	{
		System.out.println("Animal的构造代码块执行");
	}

	public Animal()
	{
		System.out.println("Animal的无参构造函数执行");
	}

	public Animal(String name)
	{
		super(name);
		this();
		System.out.println("Animal的构造函数执行,动物的名字叫："+name);
	}
}

class Dog extends Animal
{
	{
		System.out.println("Dog的构造代码块执行");
	}

	public Dog()
	{
		System.out.println("Dog的无参构造函数执行");
	}

	public Dog(String name)
	{
		this();
		super(name);
		System.out.println("Dog的构造函数执行,狗的名字叫："+name);
	}
}