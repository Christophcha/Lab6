
public class Exercise5 {
	/* QUESTION
	 * Trace the execution of the insertion and selection sort algorithms when
	 * executed on the following array of integers:
	 * Show how the array will look like after each iteration of the outer loop.
	 */

	int[] arr = { 1, 29, 14, 15, 94 };

	/*
	 * SELECTION SORT (scans entire list to find the smallest number then exchanges it.)
	 * first iteration : {1, 29, 14, 15, 94}             //checks 1, no other smaller number.
	 * second iteration : {1, 14, 29, 15, 94}            //checks 29 and switches it with the next lowest 14.
	 * third iteration : {1, 14, 15, 29, 94}             //checks 29 again and switches it with the next lowest 15.
	 * fourth iteration : {1, 14, 15, 29, 94}            //checks 29 again and leaves it in the same spot. 
	 * Does not check 94 because its the last number and therefore its the highest number.
	 */ 
	
	/*
	 * INSERTION SORT (sorts 1 digit at a time and places it into the correct position in relation to the number it already sorted until it gets to the end of the list)
	 * first iteration : { 1, 29, 14, 15, 94} 			//checks 1 and 29 and leaves them.
	 * second iteration : { 1, 14, 29, 15, 94} 			//check 29 and 14 and switches them.
	 * third iteration : { 1, 14, 15, 29, 94} 			//checks 29 and 15 and switches them.
	 * fourth iteration : { 1, 14, 15, 29, 94} 			//checks 29 and 94 and leaves them.
	 */
}
