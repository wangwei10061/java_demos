public class ConstuctOrderTest 
{
	public static void main(String[] args) 
	{
		new Dog("˾��");
	}
}
class Creature
{
	{
		System.out.println("Creature�Ĺ�������ִ��");
	}

	public Creature()
	{
		System.out.println("Creature���޲ι��캯��ִ��");
	}

	public Creature(String name)
	{
		this();
		System.out.println("Creature�Ĺ��캯��ִ��,��������ֽУ�"+name);
	}
}

class Animal extends Creature
{
	{
		System.out.println("Animal�Ĺ�������ִ��");
	}

	public Animal()
	{
		System.out.println("Animal���޲ι��캯��ִ��");
	}

	public Animal(String name)
	{
		super(name);
		this();
		System.out.println("Animal�Ĺ��캯��ִ��,��������ֽУ�"+name);
	}
}

class Dog extends Animal
{
	{
		System.out.println("Dog�Ĺ�������ִ��");
	}

	public Dog()
	{
		System.out.println("Dog���޲ι��캯��ִ��");
	}

	public Dog(String name)
	{
		this();
		super(name);
		System.out.println("Dog�Ĺ��캯��ִ��,�������ֽУ�"+name);
	}
}