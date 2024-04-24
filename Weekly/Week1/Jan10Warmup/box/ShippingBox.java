package box;

public class ShippingBox{
	public void printInfo(){
		System.out.println("Running inside ShippingBox: ");
		StandardBox b = new StandardBox();
		
		//Uncomment the code and answer. 
		
		//(1) Does companyName print? Why or why not?

		//yes because it is public so it can be seen everywhere
		System.out.println( b.companyName );
		
		//(2) Does password print? Why or why not?
		//no because password is private
		System.out.println( b.password );
		
		//(3) Does streetAddress print? why or why not?

		//yes because it is protected so it can be seen in the folder

		System.out.println( b.streetAddress );
		
		//(4) Does city print? Why or why not?
		// yes becasue it is the defualt modifier
		System.out.println(b.city);
		
		
	}
}