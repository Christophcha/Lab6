
public class timeComplexity {

	// Find the time complexity of the following Java method:

	int bar(int N) {
		int result = 1;
		for (int i = 1; i < N; i *= 2) // runs n times
			result += 2;

		return result;
	}

}
// The time complexity of this method is also O(n).