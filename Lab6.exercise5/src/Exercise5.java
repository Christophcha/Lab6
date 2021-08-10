
public class Exercise5 {
	/* QUESTION
	 * Trace the execution of the insertion and selection sort algorithms when
	 * executed on the following array of integers:
	 * Show how the array will look like after each iteration of the outer loop.
	 */

	int[] arr = { 1, 29, 14, 15, 94 };

	/*
	 * SELECTION SORT (scans entire list to find the smallest number then exchanges it.)
	 * first iteration : {1, 29, 14, 15, 94} 
	 * second iteration : {1, 14, 29, 15, 94} 
	 * third iteration : {1, 14, 15, 29, 94}
	 * fourth iteration : {1, 14, 15, 29, 94} 
	 */
	
	/*
	 * INSERTION SORT (sorts 1 digit at a time and places it into the correct position in relation to the number it already sorted until it gets to the end of the list)
	 * first iteration : { 1, 29, 14, 15, 94}
	 * second iteration : { 1, 14, 29, 15, 94}
	 * third iteration : { 1, 14, 15, 29, 94}
	 * fourth iteration : { 1, 14, 15, 29, 94}
	 */
}
