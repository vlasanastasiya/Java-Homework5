public class task3 {
    public void sort(int arr[]) {
        int size = arr.length;

        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(arr, size, i);

        for (int i = size - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest])
            largest = left;

        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int tem = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tem;

            heapify(arr, size, largest);
        }
    }

    static void printArray(int arr[]) {
        int size = arr.length;

        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 56, 3, 67, 22, 15 };
        

        task3 ob = new task3();
        ob.sort(arr);

        printArray(arr);
    }
}
