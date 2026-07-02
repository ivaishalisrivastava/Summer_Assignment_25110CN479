import java.util.Arrays;

class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9, 10};

        int[] mergedArray = merge(arr1, arr2);

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2]; 

        int i = 0;
        int j = 0; 
        int k = 0; 

        while (i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }
}