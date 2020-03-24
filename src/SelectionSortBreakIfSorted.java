
public class SelectionSortBreakIfSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {6,3,9,4,7,5,8,2,1,10};		
		
			// Check each successive value to the next:
			for(int i = 0; i < myArray.length - 2; i++) {
				
				int lowestValue = myArray[i];	// grab the first value fo the comparison group
				int lowestIndex = i;	
				
				for(int j = i + 1; j < myArray.length; j++) {
					
					// if element at myArray[j] is smaller, swap my element at myArray[i]
					if(myArray[j] < lowestValue) {
						lowestValue = myArray[j];
						lowestIndex = j;
					}
		
				}// end inner loop
				
				// swap (if necessary)
				// if the lowestValue is on the left
				if(lowestValue == myArray[i]) {
					System.out.println("--lowest value is on the left; no swap occurred");
				}
				else {
					// if the lowest value is one of the 'j' values
					// swap
					int temp = myArray[i];
					myArray[i] = lowestValue;
					myArray[lowestIndex] = temp;
				}
				
				printArray(myArray);
				
				// check for sorted				
				// then, break if it is sorted:
				if(checkForSorted(myArray)) {
					System.out.println("array is sorted; breaking");
					break;
				}
				
			}// end outer loop
					
	}// end main

	public static void printArray(int[] myArray) {
		for(int i : myArray) {
			System.out.print(i + " ");	// keep all output on one line
		}
		// newline
		System.out.println();	// blank
		
		
	}

	public static boolean checkForSorted(int[] myArray) {
		
		// compare the first value to the second;
		// if all values on the left are less than the element on the left,
		// we are sorted
		for(int i = 0; i < myArray.length - 1; i++) {
			if(myArray[i] > myArray[i + 1]) {
				return false;
			}
		}
		
		// if all values on the left are less than the next higher element,
		// we are sorted
		return true;
	}
}
