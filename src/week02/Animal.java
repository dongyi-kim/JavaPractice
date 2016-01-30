package week02;

public abstract class Animal 
{		
	private int age;
	private int x, y;
	
	 public void setPosition(int x, int y)
	 {
		 this.x = x;
		 this.y = y;		 
	 }
	 
	 protected void growUp()
	 {
		 this.age ++;
	 }
	 
	 public int getAge(){
		 return age;
	 }
	 
	 
	public Animal()
	{
	    this.age = 1;
	}
	
	
	public void sleep()
	{
	    System.out.println("Animal : sleep();");
	}
}
