import java.util.*;
class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList<String> aobj=new ArrayList<String>();
		aobj.add("gani");
		aobj.add("hi");
		aobj.add("hello");
		//System.out.println(aobj[1]);
		//Iterator itr=aobj.iterator();
		//while(itr.hasNext())
		//	System.out.println(itr.next());
		for(String obj:aobj)
			System.out.printl(obj);
			
	}
}
