import OrdenarPalavras;

public class Main {

    public static void main(String[] args) {
        int n = 250000;
        OrdenarPalavras Sort = new OrdenarPalavras();
        String[] arr = new String[n];
        
        String[] palavras250 = new String[250000];
        String[] palavras500 = new String[500000];
        String[] palavras1000 = new String[1000000];
        
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(n-i);
        }

        System.out.println(Sort.merge1000(arr));


    }
}