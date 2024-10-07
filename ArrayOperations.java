import java.util.Arrays;
import java.util.Scanner;

public class arrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Linear Search
        System.out.print("Enter the value to search using Linear Search: ");
        int target = sc.nextInt();
        int linearResult = linearSearch(array, target);
        System.out.println("Linear Search result: " + (linearResult != -1 ? "Found at index " + linearResult : "Not found"));

        // Binary Search (Sorted Array)
        Arrays.sort(array);
        System.out.println("Sorted array for binary search: " + Arrays.toString(array));
        System.out.print("Enter the value to search using Binary Search: ");
        target = sc.nextInt();
        int binaryResult = binarySearch(array, target, 0, array.length - 1);
        System.out.println("Binary Search result: " + (binaryResult != -1 ? "Found at index " + binaryResult : "Not found"));

        // Sorting
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Bubble Sort\n2. Insertion Sort\n3. Selection Sort\n4. Merge Sort\n5. Quick Sort");
        int choice = sc.nextInt();

        int[] sortedArray = Arrays.copyOf(array, array.length);
        switch (choice) {
            case 1:
            bubbleSort(sortedArray);
            break;
            case 2:
            insertionSort(sortedArray);
            break;
            case 3:
            selectionSort(sortedArray);
            break;
            case 4:
            mergeSort(sortedArray, 0, sortedArray.length - 1);
            break;
            case 5:
            quickSort(sortedArray, 0, sortedArray.length - 1);
            break;
            default:
            System.out.println("Invalid choice");
            break;
        }

        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    // 1. Linear Search
    public static int linearSearch(int[] array, int target) {
        // Implement linear search here
        for (int i = 0; i <= array.length; i++) {
			if (array [i] == target) {
				return i;
			}
		}
			return -1; // Placeholder
    }

    // 2. Binary Search (works only on sorted arrays)
    public static int binarySearch(int[] array, int target, int low, int high) {
        while (low <= high) {
			int mid = low + (high - low) /2;
			if (array [mid] == target) {
				return mid;
			}
			if (array [mid] < target){
				low = mid + 1;
			} else{
				high = mid -1;
			}
		}
        return -1; // Placeholder
    }

    // 3. Bubble Sort
    public static void bubbleSort(int[] array) {
        // Implement bubble sort here
        int n = array.length;
        boolean swapped;
        for (int a = 0; a < n -1; a++) {
			swapped = false;
			for (int b = 0; b < n-a-1; b++){
				if (array[b] > array[b + 1]) {
					int temp = array [b];
					array [b] = array [b+1];
					array [b+1] = temp;
					swapped = true;
				}
			}
			if (!swapped) break;
		}
	}


    // 4. Insertion Sort
    public static void insertionSort(int[] array) {
        // Implement insertion sort here
        for (int a = 1; a < array.length; a++){
			int c = array[a];
			int b = -1;

			while (b >= 0 && array [b]>c){
				array [b+1] = array [b];
				b = b-1;
			}
			array [b+1] = c;
		}
    }

    // 5. Selection Sort
    public static void selectionSort(int[] array) {
        // Implement selection sort here
        int n = array.length;
		        for (int i = 0; i < n - 1; i++) {
		            int min = i;
		            for (int j = i + 1; j < n; j++) {
		                if (array[j] < array[min]) {
		                    min = j;
		                }
		            }
		            int temp = array[min];
		            array[min] = array[i];
		            array[i] = temp;
        }
    }

    // 6. Merge Sort
    public static void mergeSort(int[] array, int left, int right) {
        // Implement merge sort here
        if (left < right) {
		            int mid = left + (right - left) / 2;

		            mergeSort(array, left, mid);
		            mergeSort(array, mid + 1, right);

		            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        // Implement merging logic here
        int n1 = mid - left + 1;
		        int n2 = right - mid;

		        int[] leftArray = new int[n1];
		        int[] rightArray = new int[n2];

		        for (int i = 0; i < n1; i++) {
		            leftArray[i] = array[left + i];
		        }
		        for (int j = 0; j < n2; j++) {
		            rightArray[j] = array[mid + 1 + j];
		        }

		        int i = 0, j = 0;
		        int k = left;
		        while (i < n1 && j < n2) {
		            if (leftArray[i] <= rightArray[j]) {
		                array[k] = leftArray[i];
		                i++;
		            } else {
		                array[k] = rightArray[j];
		                j++;
		            }
		            k++;
		        }

		        while (i < n1) {
		            array[k] = leftArray[i];
		            i++;
		            k++;
		        }

		        while (j < n2) {
		            array[k] = rightArray[j];
		            j++;
		            k++;
        }
    }

    // 7. Quick Sort
    public static void quickSort(int[] array, int low, int high) {
        // Implement quick sort here
        if (low < high) {
		            int pi = partition(array, low, high);

		            quickSort(array, low, pi - 1);
		            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        // Implement partition logic here
        int pivot = array[high];
		        int i = (low - 1);

		        for (int j = low; j < high; j++) {
		            if (array[j] < pivot) {
		                i++;

		                int temp = array[i];
		                array[i] = array[j];
		                array[j] = temp;
		            }
		        }

		        int temp = array[i + 1];
		        array[i + 1] = array[high];
        array[high] = temp;
        return -1; // Placeholder
    }
				    }
