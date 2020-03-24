
public class SelectionSort {

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
			}// end outer loop
			
			printArray(myArray);
			
	}// end main
	
	public static void printArray(int[] myArray) {
		for(int i : myArray) {
			System.out.print(i + " ");	// keep all output on one line
		}
		// newline
		System.out.println();	// blank
		
		
	}

}
