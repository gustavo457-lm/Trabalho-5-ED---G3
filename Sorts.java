
public class Sorts {


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
