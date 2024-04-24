import box.*;
/* or
import box.StandardBox;
import box.ShippingBox;
*/

public class Runner{
	public static void main (String[] args){
		
		ShippingBox obj = new ShippingBox();
		obj.printInfo();
		
				
		System.out.println("\nRunning inside Runner: ");
		
		
		StandardBox obj2 = new StandardBox();
		
		//Uncomment the code and answer. 
		
		//(5) Does it print? Why or why not?

		//yes 
		
		System.out.println( obj2.companyName );
		
		//(6) Does it print? Why or why not?

		//no because password is private

		System.out.println( obj2.password);
		
		//(7) Does it print? Why or why not?

		//it isnt visible becasue it is protected

		System.out.println( obj2.streetAddress);
		
		//(8) Does it print? Why or why not?

		// it isnt visible because it is defualt constructor

		System.out.println(obj2.city);
		
		
		
	}
}