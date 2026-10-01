
public class Sorts {

    //Criar uma cópia do array desordenado para fazer as ordenações
    String[] criarNovoArr(String[] arr)
    {
        int n = arr.length;
        String[] novo = new String[n];
        novo = arr;

        return novo;
    }

    static void bubble(String[] arr){

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    static void selection(String[] arr)
    {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_indice = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min_indice]) < 0) {
                    min_indice = j;
                }
            }
            if (min_indice != i) {
                String temp = arr[i];
                arr[i] = arr[min_indice];
                arr[min_indice] = temp;
            }
        }
    }

    static void insertion(String[] arr)
    {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    static void shell(String[] arr){

        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                String key = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j].compareTo(key) > 0) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = key;
            }
        }

    }

    static void mergeSort(String[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(String[] arr, int left, int mid, int right) {
        String[] temp = new String[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i].compareTo(arr[j]) <= 0) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    static void heapSort(String[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            String tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(String[] arr, int n, int i) {
        while (true) {
            int largest = i;
            int l = 2 * i + 1, r = 2 * i + 2;
            if (l < n && arr[l].compareTo(arr[largest]) > 0) largest = l;
            if (r < n && arr[r].compareTo(arr[largest]) > 0) largest = r;
            if (largest == i) break;
            String tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            i = largest;
        }
    }

    static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(String[] arr, int low, int high) {
        String pivot = arr[low];  // pivô = primeiro elemento
        int i = low + 1;
        for (int j = low + 1; j <= high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                String tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }
        }
        String tmp = arr[low];
        arr[low] = arr[i - 1];
        arr[i - 1] = tmp;
        return i - 1;
    }
}