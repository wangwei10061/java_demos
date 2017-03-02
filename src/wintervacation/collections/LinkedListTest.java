package eightpuzzledproblem;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Person> ts =new LinkedList<>();
		
		ts.add(new Person(23,"zhangsan"));
		ts.add(new Person(23,"李四"));
		ts.add(new Person(24,"ali"));
		ts.add(new Person(23,"z2"));
		ts.add(new Person(22,"11"));
		
		Collections.sort(ts,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(o1.equals(o2))
					return 0;
				return o1.age>o2.age?1:-1;
			}
		});
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public static int getAge(Person p)
	{
		return p.age;
	}
}

class Person 
{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.age==((Person)obj).age;
	}
	
	
	
}