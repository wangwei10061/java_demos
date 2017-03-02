public class ForwardRefTest 
{
	//Java中要求变量定义时具有合法的向前引用
//	private int num0 = num1 + 20;
//	private int num1 = 30;

//	private static int num2 = num3 + 20;
//	private static int num3 = 30;
//
	private int num4 = num5 + 20;
	private static int num5 = 30;
}