import java.util.Arrays;

public class class2 {  // first class creation for CSF. With help from google

	public static void main(String[] args) {
		int shortArray [] = {1, 2, 3, 4, 5, 6}; // create array
		int arrayPos = shortArray.length;  // get length
		// System.out.println("Length is " + arrayPos); // test
		float sumArray = 0;  // create variable // float to get average
		float sumSqArray = 0; // create variable // float for consistent print
		// int pos; // to track array position
		
		for (int i = 0; i < arrayPos; i++) { //loop through array
			
			sumArray = sumArray + shortArray[i];  
		    sumSqArray = sumSqArray + (shortArray[i] * shortArray[i]);
		    // System.out.println(shortArray[i]); // test
		    
		} 
		float arrayAvg = sumArray / arrayPos; // get average
		System.out.println(Arrays.toString(shortArray) + " is the list"); // convert list to string for print
		System.out.println(sumArray + " is the sum of the list");
		System.out.println(sumSqArray + " is the sum of squares of the list");
		System.out.println(arrayAvg + " is the average of the numbers in list");

		
	
	}

}
