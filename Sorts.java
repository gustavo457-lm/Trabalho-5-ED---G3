
public class Sorts {

    static void bubble(String[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    static void selection(String[] arr) {

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

    static void MergeSort(String[] arr, int inicio, int fim){
		int meio;
		int n = arr.length;
		
        if (fim == 0){
            fim = n;
        }
        
        if (fim - inicio > 1){
        	
            meio = (fim+inicio)/2;
            MergeSort(arr, inicio, meio);
            MergeSort(arr, meio, fim);
            String[] left = new String[meio - inicio];
    		String[] right = new String[fim - meio];
            
    		int j = 0;
    		int p = 0;
    		
            for (int i = inicio; i < fim; i++) {
            	if (i < meio) {
            		left[j] = arr[i];
            		j++;
            	}else {
            		right[p] = arr[i];
            		p++;
            	}
            }
            
            int top_left = 0;
            int top_right = 0;
            
            for (int i = inicio; i < fim; i++) {
                if (top_left >= left.length) {
                	arr[i] = right[top_right];
                    top_right+=1;
                }else if (top_right >= right.length){
                	arr[i] = left[top_left];
                    top_left+=1;
                    
                }else if (left[top_left].compareToIgnoreCase(right[top_right]) < 0){
                	arr[i] = left[top_left];
                    top_left+=1;
                    
            	}else {
            		arr[i] = right[top_right];
                    top_right+=1;
            	}
            }
        }
    }

    
    static void ShellSort(String[] a) {
        int n = a.length;
        
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && a[j].compareTo(a[j - h]) < 0; j -= h) {
                    String t = a[j];
                    a[j] = a[j - h];
                    a[j - h] = t;
                }
            }
            h = h / 3;
        }
    }
    
   
    public static void InsertionSort(String[] a) {
        int n = a.length;
        
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && a[j].compareTo(a[j - 1]) < 0; j--) {
                String swap = a[j];
                a[j] = a[j - 1];
                a[j - 1] = swap;
            }
        }
    }
    static void QuickSort(String[] arr, int inicio, int fim) {

	    if (inicio < fim) {

	        String pivo = arr[inicio];

	        int i = inicio + 1;
	        int j = fim;

	        while (i <= j) {

	            while (i <= fim && arr[i].compareToIgnoreCase(pivo) <= 0) {
	                i++;
	            }

	            while (j > inicio && arr[j].compareToIgnoreCase(pivo) > 0) {
	                j--;
	            }

	            if (i < j) {

	                String temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;

	            }
	        }

	        String temp = arr[inicio];
	        arr[inicio] = arr[j];
	        arr[j] = temp;

	        QuickSort(arr, inicio, j - 1);
	        QuickSort(arr, j + 1, fim);
	    }

	}

    static void HeapSort(String[] arr) {
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

    static void heapify(String[] arr, int n, int i) {
        while (true) {
            int maior = i;
            int l = 2 * i + 1, r = 2 * i + 2;
            if (l < n && arr[l].compareTo(arr[maior]) > 0) maior = l;
            if (r < n && arr[r].compareTo(arr[maior]) > 0) maior = r;
            if (maior == i)
                break;
            String tmp = arr[i]; arr[i] = arr[maior]; arr[maior] = tmp;
            i = maior;
        }
    }
}
