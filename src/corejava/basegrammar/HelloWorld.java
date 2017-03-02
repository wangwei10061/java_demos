package corejava.basegrammar;

/**
 * char类型可以用来存储一个中文字符
 */
class HelloWorld
{
	public static void main(String[] args)
	{
		char[] a = {'网'};
		System.out.println(Character.codePointAt(a,0));
	}
}
