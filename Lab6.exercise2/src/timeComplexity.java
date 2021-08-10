
public class timeComplexity {

	// Find the time complexity of the following Java method:
	
	int foo(int N) {
		int result = 0; 
		for (int i = 0; i < N; i++) // runs n times
			result++; 
		for (int j = 0; j < 1000000; j++) // constant 1
			result += j; 

		return result;
	}

}

// The time complexity of this method is O(n).