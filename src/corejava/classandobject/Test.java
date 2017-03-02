/**
	变量的初始化是先分配内存空间再初始化
*/

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println(Price.INSTANCE.currentPrice);

		Price p = new Price(2.8);
		System.out.println(p.currentPrice);

		System.out.println(Price.INSTANCE.currentPrice);
	}
}

class Price
{
	final static Price INSTANCE = new Price(2.8);
	static double initPrice = 20;
	
	double currentPrice;
	public Price(double discount)
	{
		currentPrice = initPrice - discount;
	}
}



//Java源文件

