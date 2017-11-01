import java.util.*;
class Array{
	public static void main(String args[]){
		
	HashSet ar=new HashSet();
	ar.add(new Integer(100));
	ar.add(new String("ganesh"));
	ar.add(new Character('A'));
	ar.add(new Float(100.4));
	System.out.println(Collections.sort(ar));	
	}
}
