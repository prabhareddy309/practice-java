import java.util.*;
class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList<String> lst=new LinkedList<String>();
		lst.add("200");
		lst.add("stign");
		lst.add("10.5");
		ListIterator itr=lst.listIterator();
		//while(itr.hasNext())
		//	System.out.println(itr.next());
		//list.reverse();
		//System.out.println(list);
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}
}
