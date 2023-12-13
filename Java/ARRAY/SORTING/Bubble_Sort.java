class Main{
    static void bubblesort(int arr[], int size){
        int i;
        int temp = 0;
        int counter = 1;
        while(counter < size){
            for(i = 0; i < size-1; i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            counter++;
        }
    }

    static void printarray(int arr[], int size){
        int i;
        for(i = 0; i < size-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {32, 12, 65, 78, 10, 1, 20};
        int size = arr.length;
        bubblesort(arr, size);
        System.out.println("Sorted array is: ");
        printarray(arr, size);
    }
}
  
.........................................................................................
.........................................................................................
.........................................................................................                                                          
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        int i;
        System.out.println("Enter your array: ");
        for(i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }

        int counter = 1;
        int temp = 0;
        while(counter < size){
            for(i = 0; i < size - 1; i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            counter++;
        }
        System.out.println("Sorted array: ");
        for(i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
  }
