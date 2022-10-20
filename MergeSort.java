import java.util.Arrays;

public class MergeSort {
    public static void merge(int arr[], int l, int mid, int h) {
        int i = l, j = mid + 1, k = l;
        int array[] = new int[h + 1];
        while (i <= mid && j <= h) {
            if (arr[i] <= arr[j]) {
                array[k++] = arr[i++];
            } else {
                array[k++] = arr[j++];
            }
        }
        for (; i <= mid; i++) {
            array[k++] = arr[i];
        }
        for (; j <= h; j++) {
            array[k++] = arr[j];
        }
        for (i = l; i <= h; i++) {
            arr[i] = array[i];
        }

    }

    public static void anotherWayMergeSort(int arr[], int l, int mid, int h) {
        int len1 = mid - l + 1;
        int len2 = h - mid;
        int leftArray[] = new int[len1];
        int rightArray[] = new int[len2];
        for (int i = 0; i < len1; i++) {
            leftArray[i] = arr[l + i];
        }
        for (int i = 0; i < len2; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

    }

    public static void mergeSort(int arr[], int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 3, 7, 5, 6, 4, 8, 2 }, l = 0, h = arr.length - 1;
        mergeSort(arr, l, h);
        System.out.println(Arrays.toString(arr));
    }

}
