package wintervacation.reflect;

import java.lang.reflect.*;

public class TwoAndTwoIsFive
{
	public static void main(String[] args) throws Exception
	{
		int a = 2;
		int b = a;
		System.out.printf("%d+%d=%d",a,b,a+b);
		System.out.println();
		Class cacheClazz = Integer.class.getDeclaredClasses()[0];
		Field cacheField = cacheClazz.getDeclaredField("cache");

		cacheField.setAccessible(true);
		Integer[] cache = (Integer[])cacheField.get(cacheClazz);
		cache[132] = cache[133];

		System.out.printf("%d+%d=%d",a,b,a+b);
	}
}
