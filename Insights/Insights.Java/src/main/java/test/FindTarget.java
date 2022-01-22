package test;

public class FindTarget {

    static int findIndexfromArray(int[] array, int target,int first, int last )
    {
        int mid = (first+last)/2;
        if (last < first)
            return -1;
        if(target == array[mid])
            return mid;

        if(array[mid] > target )
        {
            return findIndexfromArray(array, target,(mid)+1 ,last  );
        }
        else if(array[mid] < target )
        {
            return findIndexfromArray(array, target,first ,(mid)-1  );
        }
        return -1;
    }

    static int pivotedBinarySearch(int arr[], int n, int key)
    {
        int pivot = findPivot(arr, 0, n - 1);

        // If we didn't find a pivot, then
        // array is not rotated at all
        if (pivot == -1)
            return findIndexfromArray(arr, key,0, n - 1);

        // If we found a pivot, then first
        // compare with pivot and then
        // search in two subarrays around pivot
        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return findIndexfromArray(arr, key, 0, pivot - 1);
        return findIndexfromArray(arr, key, pivot + 1, n - 1);
    }

    /* Function to get pivot. For array
       3, 4, 5, 6, 1, 2 it returns
       3 (index of 6) */
    static int findPivot(int arr[], int low, int high)
    {
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }

    public static void main(String args[])
    {
        // Let us search 3 in below array
        int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr1.length;
        int key = 3;
        System.out.println("Index of the element is : "
                + pivotedBinarySearch(arr1, n, key));
    }
}
