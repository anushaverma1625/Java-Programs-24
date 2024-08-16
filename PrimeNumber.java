// Natural NUMBER > 1
// Which has only two factors 1 and itself

public class PrimeNumber {
	
public static void main(String[] args) {
		
		int num  = 7;
		int count = 0;
		
		if(num>1) {
			
			for(int i=1; i<=num; i++) {
				if(num%i == 0)
					count++;
			}
		    if(count == 2) {
			     System.out.println("Number is Prime");
		    } 
		else {
				System.out.println("Number is not Prime");
			}
		}    
	}
}


// But this is not an optimal solution because its 

// Time complexity is -  O(n) n is num

//SPACE COMPLEXITY
// Space complexity is  - O(1)

// The code uses only a few integer variables (num and count), which occupy constant space.
//No additional space is required that depends on the size of the input.


//This code effectively checks if a number is prime by counting its divisors, but it's not the most efficient algorithm for large numbers. There are more efficient methods, such as checking divisibility up to the square root of num, that could reduce the time complexity.







