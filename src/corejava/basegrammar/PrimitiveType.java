package corejava.basegrammar;

import java.math.BigDecimal;
class PrimitiveType 
{
	public static void main(String[] args) 
	{
		//float���͵�ֵ��double���͵�ֵ���ô?
		System.out.println(3.14f);
		System.out.println(3.14);
		System.out.println(3.14f==3.14);

		float a = 3.14f;
		System.out.println(a);
		double b = a;
		System.out.println(b);
		b+=1;
		System.out.println(b==4.14f);
		System.out.println(b==4.14);
		System.out.println(b);

		//�����Ϊʲô����Ϊ���ö����Ƶ���ʽ�洢�ĸ������������ܾ�ȷ�ر�ʾ0.1
		System.out.println(2.0-1.1);
		BigDecimal bd0 = new BigDecimal(2.0);
		BigDecimal bd1 = new BigDecimal(1.1);
		System.out.println(bd0.subtract(bd1));

		System.out.println(0.0/0);
		System.out.println(0.0/0);
		System.out.println(0.0/0);
		System.out.println(0.0/0);
	}
}
