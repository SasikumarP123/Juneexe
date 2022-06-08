package June;
import java.util.Scanner;

		interface Surface 
		{
		  public void Area(int length, int bredth);
		}
		
		
		class Rectangle 
		{
			Surface surf=new Surface()
			{
				
				public void Area(int length, int bredth) 
				{
					System.out.println("The area of the rectangle is " + length * bredth);
					
					
				}		    
			};
		 
		  
		}
		
		class Area
		{
			Scanner in=new Scanner(System.in);	
			
				public void show(Surface s) 
				{
					
					int length;
					int bredth;
					System.out.println("Enter length");
					length=in.nextInt();
					System.out.println("Enter bredth");
					bredth=in.nextInt();
					s.Area(length,bredth);
					
				}	
			
		}
		
		public class Interface extends Rectangle
		{
		  public static void main(String[] args) 
		  {
				    Rectangle r = new Rectangle();
				    Area a=new Area();
				   a.show(r.surf);
		   
		  }
		}
		
