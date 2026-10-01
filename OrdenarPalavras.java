import Sorts;

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

    double bubble250(String[] arr)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < 5; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.bubble(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU BUBBLE " + (i+1));
        }
        return tempo/5;
    }



    double selection1000(String[] arr)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < 5; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.selection(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU SELECTION " + (i+1));
        }
        return tempo/5;

    }


    double insertion1000(String[] arr)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < 5; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.insertion(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU INSERTION " + (i+1));
        }
        return tempo/5;

    }


    double shell1000(String[] arr)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < 5; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.shell(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU SHELL " + (i+1));
        }
        return tempo/5;

    }


    double merge1000(String[] arr)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < 5; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.mergeSort(novo, 0, n-1);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU MERGE " + (i+1));
        }
        return tempo/5;

    }


    double quick1000(String[] arr)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < 5; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.quickSort(novo, 0, n-1);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU QUICK " + (i+1));
        }
        return tempo/5;

    }


    double heap1000(String[] arr)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < 5; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.heapSort(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU HEAP " + (i+1));
        }
        return tempo/5;

    }


}
