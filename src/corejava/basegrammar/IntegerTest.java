package corejava.basegrammar;

/**
 * Integer内部缓存了一个-128----127的数组
 */
public class IntegerTest
{
	public static void main(String[] args) 
	{
		Integer a = 127,b = 127,c = 128,d = 128;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(c==d);
		System.out.println(c.equals(d));
	}
}
