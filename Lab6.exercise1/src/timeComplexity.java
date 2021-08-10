
public class timeComplexity {

	int foo(int n) {

		int result = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					result++;
				}
			}
		}
		return result;
	}
}
// Time complexity for this simple method would be O(n^3)