import java.util.*;

public class Main{
    
    // public static void printArray(int arr[]){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }
    
    public static void printArray(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main (String[] args) {
        // int arr[] = {5, 4, 1,3,2};
        // Arrays.sort(arr);

        // int arr2[] = {5,4,1,3,2};
        // Will only sort array from 0 to 2nd index
        // Arrays.sort(arr2, 0, 3);
        
        // printArray(arr2);
        
        // In reverse
        Integer arr[] = {5,4,1,3,2};
        // Below is a collection which only works on objects that's why we have used 'Integer' instead of 'int'.
        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}