import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = {9, 7, 5, 4, 2, 1, 10};

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array: ");
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
