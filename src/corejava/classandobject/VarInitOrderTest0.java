/**
	��ʾ�����ĳ�ʼ��˳��
	�漰��5�ַ�ʽ��
	���ڷǾ�̬����(VarInitOrderTest0)��
		��ʾ��ʼ�������������ʼ�������췽����ʼ��

	���ھ�̬����(StaticVarInitOrderTest1)��
		��ʾ��ʼ������̬������ʼ��
*/
public class VarInitOrderTest0 
{
	public static void main(String[] args) 
	{
		Person zhangsan = new Person("����",21);
		System.out.println(zhangsan);
	}
}

class Person 
{
	private String name;
	private int age;
	private double height = 170;
	{
		System.out.println("---------------��������ִ��--------------");
		height = 175;
	}
	
	public Person(String name,int age)
	{
		System.out.println("---------------���췽��ִ��--------------");
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
	���������Լ�ֱ�ӳ�ʼ�����ڹ��췽��ִ�У����ߵ�˳�����ڳ����е��Ⱥ�˳���й�

	ʵ�ʣ����Ƿ��ڹ�������ִ�еģ���ʾ��ʼ����� double height = 170;
		���ָ�Ϊ��double height;
				  height = 170;
	
*/