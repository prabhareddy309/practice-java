public class GenericClass<T>{
	private T t;
	public void add(T key){
		this.t=key;
	}
	
	public T get(){
		return t;
	}
	public static void main(String args[]){
		GenericClass<Integer> integerBox=new GenericClass<Integer>();
		GenericClass<String>	stringBox=new GenericClass<String>();
		integerBox.add(new Integer(20));
		stringBox.add(new String("hello world"));
		System.out.printf("%d\n\n",integerBox.get());
		System.out.printf("%s\n",stringBox.get());
		//System.out.println(k);
	}
}
 
