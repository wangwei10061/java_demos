package corejava.basegrammar;

public class StringTest
{
	public static void main(String[] args) 
	{
		String str = new String("HelloWorld");
		String str1 = "HelloWorld";
		String str2 = "HelloWorld";
		String str3 = "Hello";
		str3+="World";
		System.out.println(str == str1);
		System.out.println(str2 == str1);
		System.out.println(str2 == str3);

		//StringBuffer���̰߳�ȫ��
	}
}
