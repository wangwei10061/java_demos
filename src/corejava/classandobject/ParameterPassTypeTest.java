import java.util.Arrays;

/**
	演示Java中到底传递的是值还是引用
*/
public class ParameterPassTypeTest
{
	public static void main(String[] args)
	{
		int num = 5;
		square(num);
		System.out.println(num);

		int[] array = new int[]{2,4,5,7,8,32,1,0,9};
		sort(array);
		System.out.println(Arrays.toString(array));

		int[] array1 = new int[]{1,2,3};
		int[] array2 = new int[]{0,1,2};
		swap(array1,array2);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

//		String haha = "abcdefghijklmn";
//		judgeString(haha);
//		System.out.println(haha);
//
//		String hiahia = new String("abcdefghijklmn");
//		judgeString(haha);
//		System.out.println(hiahia);
		
	}
	public static void square(int a)
	{
		a = a*a;
	}
	public  static void sort(int[] a)
	{
		Arrays.sort(a);
	}
	public  static void swap(int[] a,int[] b)
	{
		int[] temp = a;
		a = b;
		b = temp;
	}
	
	
	public static void judgeString(String str)
	{
		//如果字符串长度大于10
		if(str.length()>10)
			str = "error";
	}
}