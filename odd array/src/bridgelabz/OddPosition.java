package bridgelabz;
public class OddPosition {  
    public static void main(String[] args) {  
        //Initialize array  
       int [] arr = new int [] {7, 10, 25, 27, 41};  
        System.out.println("Elements of given array present on odd position: ");  
        //Loop through the array by incrementing value of i by 2  
        for (int i = 0; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }  
    }  
}  