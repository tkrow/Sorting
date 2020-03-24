
public class FindMedianInBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {6,3,9,4,7,5,8,2,1,};
		
		int k = 0;
		
		// change the outer loop LCV so that we are making one fewer pass
		for(int i = myArray.length - 1; i > 0; i--) {
			
			for(int j = 0; j < i; j++) {
				// Compare current element to next highest
			
				// if the second element is greater than the first
				if(myArray[j] < myArray[j + 1]) {
				
					// swap
					// (hold onto the element so we don't lose it!)
					int temp = myArray[j + 1];
					// assign lower element:
					myArray[j + 1] = myArray[j];	// at this point, both array elements hold the same value
					// assign higher element:
					myArray[j] = temp;
				}	
				
			}// inner loop ends		
			
			printArray(myArray);
			
			if(k < myArray.length - 2) {
				k++;
			}
			else {
				median(myArray);
			}
			
		}// outer loop ends	
		
	}
	
	public static void median(int[] myArray) {
		
		int midIndexOdd = (myArray.length + 1) / 2;
		double midIndexEven = (((double)myArray.length / 2) + ((double)myArray.length + 1 / 2)) / 2;			
		
		if(myArray.length % 2 == 0) {		
			System.out.println("Median: " + midIndexEven);		
		}
		else {		
			System.out.println("Median: " + midIndexOdd);
		}
	}
	
	public static void printArray(int[] myArray) {
		for(int i : myArray) {
			System.out.print(i + " ");	// keep all output on one line
		}
		// newline
		System.out.println();	// blank	
	}

}
