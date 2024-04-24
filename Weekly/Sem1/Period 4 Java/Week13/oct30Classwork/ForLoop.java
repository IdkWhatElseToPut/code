// Replace each question with a comment that describes what the code is doing.
public class ForLoop{
	public void test1(){
		//1) Describe what is happening below
		//it prints test 1 then prints numbers between 0 and 9 because i is 0 and it prints before adding a number and stops at 9
		System.out.println("\n\nTest1");
		for(int i=0; i < 10; i++){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test2(){
		//2) Describe what is happening below
		// prints test2 then will print 15 counting down by 1 and stopping at 3 all in one line
		System.out.println("\n\nTest2");
		for(int i=15; i > 2; i--){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test3(int max){
		//3) Describe what is happening below
		//prints test3 then counts starting at 0 by incriments of 5 until the value would exceed the value of max
		System.out.println("\n\nTest3");
		for(int i=0; i <= max; i+=5){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test4(int min, int max){
		//4) Describe what is happening below
		//prints test4 then prints the value of max and subtracts 2 from that value until it no longer greater than the value of min
		System.out.println("\n\nTest4");
		for(int i=max; i > min; i-=2){
			System.out.print(i + " ");
		}
	System.out.println();
	}
	
	//5) When does it make sense to use a for loop instead of a while loop?

}

