package June;

interface Banana
{
	 default void eat()
	{
		System.out.println("I Eat");
	}
}
class Apple 
{

	  // field and method of the parent class
	  String name;
	  
	   void eat() 
	  {
	    System.out.println("I can eat");
	  }
}

	// inherit from Apple

	class Orange extends Apple implements Banana
	{
	  // new method in subclass
	  public void eat() 
	  {
	    System.out.println("I Eat " + name);
	  }

}
	class InheritanceInterface
	{
	  public static void main(String[] args) 
	  {

	    // create an object of the subclass
	    Orange d1 = new Orange();

	    // access field of superclass
	    d1.name = "Orange";
	    

	    // call method of superclass
	    // using object of subclass
	    d1.eat();

	  }
	
	}