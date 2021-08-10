
public class Exercise4 {
	/* QUESTION
	Trace through each iteration of the algorithm, writing the number that will be the middle
	element and the left and right bounds (indexes), when searching for the number 73.
	*/
	
	int[] arr = {1, 14, 15, 24, 55, 59, 73, 90, 94, 99};
	   //indexes{0,  1,  2,  3,  4,  5,  6,  7,  8,  9}
	
	// first iteration will check middle number 55 (index 4) with left and right bounds being indexes 0 and 9.
	// second iteration will check middle number 90 (index 7) with left and right bounds being indexes 5 and 9.
	// third iteration will check middle number 59 (index 5) with the left and right bounds being indexes 5 and 6.
	// fourth iteration will check middle number 73 (index 6) with the left and right bounds being indexes 6 and 6.
}
