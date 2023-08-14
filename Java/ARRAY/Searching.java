import java.util.Scanner;

public class Main{
    static int linearsearch(int arr[], int size, int key){
        for(int i = 0; i < size; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int size = arr.length;
        System.out.println("Enter the element you want to search: ");
        int key = in.nextInt();
        int flag = linearsearch(arr, size, key);
        if(flag == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at: " + (flag + 1));
        }
    }
}
