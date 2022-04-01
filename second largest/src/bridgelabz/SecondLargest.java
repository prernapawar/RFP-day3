package bridgelabz;
public class SecondLargest {
	 public static void main(String[] args) {
	//initialize the array 
	    int arr[] = { 9, 14, 20, 18, 28, 30, 36, 5, 10, 50 };
	    int largest = arr[0];
	    int secondLargest = arr[0];
	//printing the message
	    System.out.println("The given array is:" );
	//Execute the for loop till the total array length
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i]+"\t");
	    }
	    for (int i = 0; i < arr.length; i++) {
	 //sort the elements of the array 
	      if (arr[i] > largest) {
	        secondLargest = largest;
	        largest = arr[i];
	 
	      } else if (arr[i] > secondLargest) {
	        secondLargest = arr[i];
	 
	      }
	    }
	 //printing the second largest Number
	    System.out.println("\nSecond largest number is:" + secondLargest);
	 
	  }
	}