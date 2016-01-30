package week02;

public class Main {

	
	public static void main(String[] args){
//		EP e = new EP();
//		Bird b = new Bird();
//		feed(e);
//		feed(b);
//		Eatable eatable = new Bird();
//		
//		
		EmptyClass e = new EmptyClass();
		if( e instanceof Object)
		{
			
		}
		
	}
	
	
	public static void feed(Eatable e)
	{
		e.eat();
	}
	
	public static void move(Animal animal, int x, int y)
	{
		animal.setPosition(x, y);
	}
	
	
	
	
	
	
	
	
}
