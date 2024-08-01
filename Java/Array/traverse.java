import java.util.Scanner;

class traverse{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if(in.hasNextInt()){
            arr_size = in.nextInt();
        }
        
        int[] arr = new int[arr_size];
        
        System.out.println("Enter the elements for your array: ");
        for(int i = 0; i < arr_size; i++){
            if(in.hasNextInt()){
                arr[i] = in.nextInt();
            }
        }
        System.out.println("The elements of the array is: ");
        for(int i = 0; i < arr_size; i++){
            System.out.println(arr[i] + " ");
        }
        in.close();
    }
}
