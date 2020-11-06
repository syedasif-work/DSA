import java.util.*;


public class InsertionSort {
    
    public static void InsertionSort(int[] a){
        
       for (int i = 1; i < a.length ; i++){
           int key = a[i];
           int j = i - 1;
           while (j>=0 && a[j] > key){
               a[j+1] = a[j];
               j -= 1;
           }
           a[j+1] = key;
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
        InsertionSort(arr);
        System.out.println();

        System.out.println("After Sorting\n");
        for (int i = 0; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}