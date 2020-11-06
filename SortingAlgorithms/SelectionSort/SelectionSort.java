import java.util.*;


public class SelectionSort {
    
    public static void SelectionSort(int[] arr){
        
        
        for (int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            int min_index = i;
            for (int j = i; j < arr.length; j ++){
                if (arr[j] < min){
                    min = arr[j];
                    min_index = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
            
        }
    }
    
    
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i ++){
            arr[i] = s.nextInt();
        }
                System.out.println();

        System.out.println("Before Sorting\n");
        for (int i = 0; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        SelectionSort(arr);
                System.out.println();

        System.out.println("After Sorting\n");
        for (int i = 0; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}