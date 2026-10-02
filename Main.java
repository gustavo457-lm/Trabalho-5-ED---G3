import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.axis.LogAxis;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.io.File;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    //Metodo que faz o pré-processamento das palavras, eliminando sinais de pontuação e números
    public static List preProcessamento(List nomes, List nomesProcessados) {
        for (int i = 0; i < nomes.size(); i++) {
            String nome = ((String) nomes.get(i)).toLowerCase();
            nome = nome.replaceAll("[^\\p{L} ]", "");
            nomesProcessados.add(nome);
        }
        return nomesProcessados;
    }

    public static void main(String[] args) {

        OrdenarPalavras Sort = new OrdenarPalavras();

        Path nomes250k = Path.of("C:\\Users\\Thalisson\\Documents\\vscode\\javascripit-learning\\Trabalho-5-ED---G3\\nomes250k.txt");
        Path nomes500k = Path.of("C:\\Users\\Thalisson\\Documents\\vscode\\javascripit-learning\\Trabalho-5-ED---G3\\nomes500.txt");
        Path nomes1m = Path.of("C:\\Users\\Thalisson\\Documents\\vscode\\javascripit-learning\\Trabalho-5-ED---G3\\nomes1m.txt");

        List<String> listanomes250 = new ArrayList<>();
        List<String> listanomes500 = new ArrayList<>();
        List<String> listanomes1m = new ArrayList<>();

        //Lê os arquivos e armazena o valor em Lists
        try {
            listanomes250 = Files.readAllLines(nomes250k);
            listanomes500 = Files.readAllLines(nomes500k);
            listanomes1m = Files.readAllLines(nomes1m);
        } catch (IOException e) {
            System.out.println("Não foi possível achar o arquivo");
        }

        int quantPalavrasListanomes250SemPP = listanomes250.size();
        int quantPalavrasListanomes500SemPP = listanomes500.size();
        int quantPalavrasListanomes1mSemPP = listanomes1m.size();

        //Declara os Arraylists que vão ser utilizados pra armazenar as palavras processadas
        List<String> listanomes250PreProcessados = new ArrayList<>();
        List<String> listanomes500PreProcessados = new ArrayList<>();
        List<String> listanomes1mPreProcessados = new ArrayList<>();

        //Realiza a chamada de , metodo que faz o processamento
        preProcessamento(listanomes250, listanomes250PreProcessados);
        preProcessamento(listanomes500, listanomes500PreProcessados);
        preProcessamento(listanomes1m, listanomes1mPreProcessados);

        int quantPalavrasListanomes250ComPP = listanomes250PreProcessados.size();
        int quantPalavrasListanomes500ComPP = listanomes500PreProcessados.size();
        int quantPalavrasListanomes1mComPP = listanomes1mPreProcessados.size();

        System.out.println("Quantidade de palavras no arquivo de 250k antes: " + quantPalavrasListanomes250SemPP);
        System.out.println("Quantidade de palavras no arquivo de 250k depois: " + quantPalavrasListanomes250ComPP);

        System.out.println("Quantidade de palavras no arquivo de 500k antes: " + quantPalavrasListanomes500SemPP);
        System.out.println("Quantidade de palavras no arquivo de 500k depois: " + quantPalavrasListanomes500ComPP);

        System.out.println("Quantidade de palavras no arquivo de 1000k antes: " + quantPalavrasListanomes1mSemPP);
        System.out.println("Quantidade de palavras no arquivo de 1000k depois: " + quantPalavrasListanomes1mComPP);

        //Declaração dos arrays que serão usados nas ordenações

        int quant1 = 10000;
        int quant2 = 25000;
        int quant3 = 50000;

        String[] palavras_processadas250 = new String[quant1];
        String[] palavras_processadas500 = new String[quant2];
        String[] palavras_processadas1000 = new String[quant3];

        //Copia os elementos dos Arraylist para os Arrays
        for (int i = 0; i < quant1; i++) {
            palavras_processadas250[i] = listanomes250PreProcessados.get(i);
        }

        for (int i = 0; i < quant2; i++) {
            palavras_processadas500[i] = listanomes500PreProcessados.get(i);
        }

        for (int i = 0; i < quant3; i++) {
            palavras_processadas1000[i] = listanomes1mPreProcessados.get(i);
        }

        //Cria as linhas do gráfico de linhas, cada linha referente a um algoritmo de ordenação. O metodo .add() da classe
        //XYSeries recebe, como primeiro parâmetro, a quantidade de palavras a ser representada no eixo X, e no segundo, o
        //resultado da chamada dos métodos de ordenação, que corresponde ao tempo.

        XYSeries bubble = new XYSeries("Bubble (int)");
        bubble.add(quant1, Sort.Bubblex(palavras_processadas250,5));
        bubble.add(quant2, Sort.Bubblex(palavras_processadas500,5));
        bubble.add(quant3, Sort.Bubblex(palavras_processadas1000,5));

        XYSeries selection = new XYSeries("Selection (int)");
        selection.add(quant1, Sort.Selectionx(palavras_processadas250,5));
        selection.add(quant2, Sort.Selectionx(palavras_processadas500,5));
        selection.add(quant3, Sort.Selectionx(palavras_processadas1000,5));

        XYSeries insertion = new XYSeries("Insertion (int)");
        insertion.add(quant1, Sort.Insertionx(palavras_processadas250,5));
        insertion.add(quant2, Sort.Insertionx(palavras_processadas500,5));
        insertion.add(quant3, Sort.Insertionx(palavras_processadas1000,5));


        XYSeries shell = new XYSeries("Shell (int)");
        shell.add(quant1, Sort.Shellx(palavras_processadas250,5));
        shell.add(quant2, Sort.Shellx(palavras_processadas500,5));
        shell.add(quant3, Sort.Shellx(palavras_processadas1000,5));

        XYSeries quick = new XYSeries("Quick (int)");
        quick.add(quant1, Sort.Quickx(palavras_processadas250,5));
        quick.add(quant2, Sort.Quickx(palavras_processadas500,5));
        quick.add(quant3, Sort.Quickx(palavras_processadas1000,5));

        XYSeries merge = new XYSeries("Merge (int)");
        merge.add(quant1, Sort.Mergex(palavras_processadas250,5));
        merge.add(quant2, Sort.Mergex(palavras_processadas500,5));
        merge.add(quant3, Sort.Mergex(palavras_processadas1000,5));

        XYSeries heap = new XYSeries("Heap (int)");
        heap.add(quant1, Sort.Heapx(palavras_processadas250,5));
        heap.add(quant2, Sort.Heapx(palavras_processadas500,5));
        heap.add(quant3, Sort.Heapx(palavras_processadas1000,5));

        //Cria o gráfico dos algoritmos O(NlogN)
        XYSeriesCollection datasetNlogN = new XYSeriesCollection();

        //Adiciona as linhas no dataset
        datasetNlogN.addSeries(shell);
        datasetNlogN.addSeries(quick);
        datasetNlogN.addSeries(merge);
        datasetNlogN.addSeries(heap);

        //Adiciona o título, descrição dos eixos e legendas
        JFreeChart chartNlogN = ChartFactory.createXYLineChart(
                "Benchmark de Algoritmos de Ordenação O(nLogn)",
                "Palavras",
                "Tempo (s)",
                datasetNlogN,
                PlotOrientation.VERTICAL,
                true, true, false
        );

        //Representa os resultados em números reais
        chartNlogN.getXYPlot().setDomainAxis(new NumberAxis("Palavras"));
        chartNlogN.getXYPlot().setRangeAxis(new NumberAxis("Tempo (s)"));

        //Salva o gráfico em png
        try {
            ChartUtils.saveChartAsPNG(new File("Algoritmos_O(NlogN).png"), chartNlogN, 900, 600);
        } catch (IOException e) {
            System.out.println("Deu erro aqui, ó");
        }
        System.out.println("Gráfico salvo em: Algoritmos_O(NlogN).png");

        //Cria o gráfico dos algoritmos O(n²)
        XYSeriesCollection dataset_n2 = new XYSeriesCollection();
        dataset_n2.addSeries(bubble);
        dataset_n2.addSeries(selection);
        dataset_n2.addSeries(insertion);

        JFreeChart chart_n2 = ChartFactory.createXYLineChart(
                "Benchmark de Algoritmos de Ordenação O(n²)",
                "Palavras",
                "Tempo (s)",
                dataset_n2,
                PlotOrientation.VERTICAL,
                true, true, false
        );

        chart_n2.getXYPlot().setDomainAxis(new NumberAxis("Palavras"));
        chart_n2.getXYPlot().setRangeAxis(new NumberAxis("Tempo (s)"));

        try {
            ChartUtils.saveChartAsPNG(new File("Algoritmos_O(n2).png"), chart_n2, 900, 600);
        } catch (IOException e) {
            System.out.println("Deu erro aqui, ó");
        }
        System.out.println("Gráfico salvo em: Algoritmos O(n2).png");



    }
}
