/**
	��ʾ�����ĳ�ʼ��˳��
	�漰��5�ַ�ʽ��
	���ڷǾ�̬����(VarInitOrderTest0)��
		��ʾ��ʼ�������������ʼ�������췽����ʼ��

	���ھ�̬����(StaticVarInitOrderTest1)��
		��ʾ��ʼ������̬�����ʼ��
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
	���ߵ�ִ��˳������������Դ���������е�˳���й�
*/