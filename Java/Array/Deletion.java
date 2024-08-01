import java.util.Scanner;

public class Deletion{
    static int deletelement(int arr[], int n, int key){
        int i;
        for(i = 0; i < n; i++){
            if(arr[i] == key)
                break;
        }
        
        if(i < n){
            n = n - 1;
            for(int j = i; j < n; j++){
                arr[j] = arr[j+1];
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the size of your array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array of " + size + " size");
        
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i = 0; i < size; i++){
            System.out.println(arr[i] + " ");
        }
        
        System.out.println("Enter the element you want to delete: ");
        int key = in.nextInt();
        
        size = deletelement(arr, size, key);
        
        for(int i = 0; i < size; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
