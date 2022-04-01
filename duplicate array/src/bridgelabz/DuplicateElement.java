package bridgelabz;
public class DuplicateElement {  
public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {7, 10, 3, 0, 7, 11, 17, 3, 10, 22, 26};  
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  