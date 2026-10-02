
public class OrdenarPalavras {

    long inicio;
    long fim;

    //Copia o array desordenado para realizar as ordenações
    String[] criarNovoArr(String[] arr)
    {
        int n = arr.length;
        String[] novo = new String[n];
        for(int i = 0; i < n; i++)
        {
            novo[i] = arr[i];
        }

        return novo;
    }

    //Cada algoritmo possui 2 parâmetros: o array de ordenação e a quantidade de repetições
    double Bubblex(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.BubbleSort(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU BUBBLE " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        System.out.println("MÉDIA: " + tempo/num + "s");
        return tempo/num;
    }



    double Selectionx(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.SelectionSort(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU SELECTION " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        System.out.println("MÉDIA: " + tempo/num + "s");
        return tempo/num;

    }


    double Insertionx(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.InsertionSort(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU INSERTION " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        System.out.println("MÉDIA: " + tempo/num + "s");
        return tempo/num;

    }


    double Shellx(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.ShellSort(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU SHELL " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        System.out.println("MÉDIA: " + tempo/num + "s");
        return tempo/num;

    }


    double Mergex(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.MergeSort(novo, 0, n-1);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU MERGE " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        System.out.println("MÉDIA: " + tempo/num + "s");
        return tempo/num;

    }


    double Quickx(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.QuickSort(novo, 0, n-1);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU QUICK " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        System.out.println("MÉDIA: " + tempo/num + "s");
        return tempo/num;

    }


    double Heapx(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.HeapSort(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU HEAP " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        System.out.println("MÉDIA: " + tempo/num + "s");
        return tempo/num;
    }
}
