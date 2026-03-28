import java.util.Scanner;

public class SortMenu {
    // Selection Sort
    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // Merge Sort
    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int L[] = new int[n1], R[] = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2)
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Quick Sort
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++)
            if (arr[j] < pivot) {
                i++;
                int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
            }
        int t = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = t;
        return i + 1;
    }

    // Display function
    static void display(int arr[]) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int choice;
        do {
            System.out.println("\n1.Selection Sort\n2.Merge Sort\n3.Quick Sort\n4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            int copy[] = arr.clone();

            switch (choice) {
                case 1 -> { selectionSort(copy); System.out.print("After Selection Sort: "); display(copy); }
                case 2 -> { mergeSort(copy, 0, n - 1); System.out.print("After Merge Sort: "); display(copy); }
                case 3 -> { quickSort(copy, 0, n - 1); System.out.print("After Quick Sort: "); display(copy); }
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
