public class Hailstone
{
	/** Returns the length of a hailstone sequence that starts with n,
	* as described in part (a).
	* Precondition: n>0
	*/
	public static int hailstoneLength(int n)
	{ /* to be implemented in part (a) */ 

		if(n == 1){
			return 1;
		}else if(n % 2 == 0){
			return 1 + hailstoneLength(n/2);
		}else if(n % 2 != 0){
			return 1 + hailstoneLength(3*n + 1);
		}
		return 0;
		
	}
	
	
	/** Returns true if the hailstone sequence that starts with n is considered long
	* and false otherwise, as described in part (b).
	* Precondition: n>0
	*/
	public static boolean isLongSeq(int n)
	{ /* to be implemented in part (b) */
		
		if(hailstoneLength(n) > n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/** Returns the proportion of the first n hailstone sequences that are considered long,
	* as described in part (c).
	* Precondition: n>0
	*/
	public static double propLong(int n)
	{ /* to be implemented in part (c) */ 
	int count = 0;
		for(int i = 1; i <= n; i++) {
			if(isLongSeq(i)) {
				count++;
			}
		}
		return count/n;
		
	}
	// There may be instance variables, constructors, and methods not shown.
}
