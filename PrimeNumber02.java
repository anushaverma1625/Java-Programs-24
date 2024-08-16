//Improved Prime Check : Checking up to the Square Root 
public class PrimeNumber02 {

	public static void main(String[] args) {
		
	int num = 4;
	boolean isPrime = true;
	
	if(num >1) {
		//Only check the divisors up to the square root of num 
		for (int i =2; i <= Math.sqrt(num); i++) {
			if(num%i == 0) {
				isPrime = false; //num is divisible by i,so it's not prime
				break; //No need to check further, exit the loop 		
						
				
			}
		}
	}else {
		isPrime = false; //Numbers less than or equal to 1 are not prime
	}
		
    //Print the result
	
	if(isPrime) {
		System.out.println("Number is Prime");
	}else {
		System.out.println("Number is not prime");
	}
	}

}

// Time Complexity

//The loop now runs from 2 to sqrt(num), so it has O(sqrt(n)) iterations where n is the value of num.
// Each iteration involves a constant time operation (modulus operation and conditional check).


//Space Complexity - O(1)
