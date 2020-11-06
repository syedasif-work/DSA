import java.util.*;


public class BubbleSort {
    
    public static void BubbleSort(int[] arr){
        
        for (int i = 0; i < arr.length; i++){
            Boolean noswap = true;
            for (int j = 0; j < arr.length - i - 1 ;j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    noswap = true;
                }
            }
            if (noswap){
                System.out.println("BIG OH (N)");
                break;
            }
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
        BubbleSort(arr);
        System.out.println();

        System.out.println("After Sorting\n");
        for (int i = 0; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}