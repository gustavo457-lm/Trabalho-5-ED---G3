
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
    double bubble5x(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.bubble(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU BUBBLE " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        return tempo/num;
    }



    double selection5x(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            Sorts.selection(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU SELECTION " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        return tempo/num;

    }


    double insertion5x(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            //Sorts.insertion(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU INSERTION " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        return tempo/num;

    }


    double shell5x(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            //Sorts.shell(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU SHELL " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        return tempo/num;

    }


    double merge5x(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            //Sorts.mergeSort(novo, 0, n-1);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU MERGE " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        return tempo/num;

    }


    double quick5x(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            //Sorts.quickSort(novo, 0, n-1);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU QUICK " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        return tempo/num;

    }


    double heap5x(String[] arr, int num)
    {
        double tempo = 0;
        int n = arr.length;
        String[] novo = new String[n];

        for (int i = 0; i < num; i++)
        {
            novo = criarNovoArr(arr);
            inicio = System.nanoTime();

            //Sorts.heapSort(novo);

            fim = System.nanoTime();
            tempo += (fim - inicio)/1e9;
            System.out.println("TERMINOU HEAP " + (i+1) +": "+ (fim-inicio)/1e9 + "s");
        }
        return tempo/num;

    }


}
