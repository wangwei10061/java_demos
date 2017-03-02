package corejava.basegrammar;

import java.util.Scanner;
public class SwitchTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		switch(str)
		{
			case "add": System.out.println("������Ӳ���"); break;
			case "delete": System.out.println("����ɾ������");break;
			case "update": System.out.println("���и��²���");break;
			default: System.out.println("���в�ѯ����");break;
		}
	}
}
