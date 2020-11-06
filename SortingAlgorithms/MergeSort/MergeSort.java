import java.util.*;


public class MergeSort {
    
    public static void MergeSort(int[] a){
        MergeSortHelper(a, 0, a.length - 1);
    }
    
    public static void MergeSortHelper(int[] a, int low , int high){
        if (low < high){
            
        int mid = (low + high )/ 2; 
            
        MergeSortHelper(a, low, mid);
        MergeSortHelper(a, mid+1, high);
        merge(a, low, mid, high);
            
        }        
    }
    
    public static void merge(int[] arr , int l, int m, int r){
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1 + j]; 
            
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
          /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
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
        MergeSort(arr);
        System.out.println();

        System.out.println("After Sorting\n");
        for (int i = 0; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}