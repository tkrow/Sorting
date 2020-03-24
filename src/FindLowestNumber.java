
public class FindLowestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {6,3,9,4,7,5,8,2,1,10};

		// Assuming all positive numbers in an array
		int lowestNumber = myArray[0];
				
		for(int i : myArray) {
			// If the next value in the array is lower than the current lowestNumber,
			// then set lowestNumber to be that array value.
			if(i < lowestNumber) {
				lowestNumber = i;
			System.out.println("new lower number found!: " + lowestNumber);
		}
		
		System.out.println("after all elements have been compared, lowestNumber: " + lowestNumber);
		
	}

}
	
}
