import java.util.*;
public class forEach1
{
	public static void main(String args[])
	{
	 ArrayList<String> list1 = new ArrayList<>(4);
     
		list1.add("Kavya");
		list1.add("Manisha");
		list1.add("Sathya");
		list1.add("Shivani");
		System.out.println(list1);
		list1.forEach(name -> System.out.println(name));
}
}
