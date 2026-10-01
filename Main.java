import OrdenarPalavras;

public class Main {

    public static void main(String[] args) {

        OrdenarPalavras Sort = new OrdenarPalavras();

        //LER ARQUIVOS E FAZER PRÉ PROCESSAMENTO

        String[] palavras250 = new String[250000];
        String[] palavras500 = new String[500000];
        String[] palavras1000 = new String[1000000];
        


        tempo_bubble250 = Sort.bubble5x();
        tempo_bubble500 = Sort.bubble5x();
        tempo_bubble1000 = Sort.bubble5x();

        tempo_selection250 = Sort.selection5x();
        tempo_selection500 = Sort.selection5x();
        tempo_selection1000 = Sort.selection5x();
        
        tempo_insertion250 = Sort.insertion5x();
        tempo_insertion500 = Sort.insertion5x();
        tempo_insertion1000 = Sort.insertion5x();

        
        tempo_shell250 = Sort.shell5x();
        tempo_shell500 = Sort.shell5x();
        tempo_shell1000 = Sort.shell5x();

        
        tempo_merge250 = Sort.merge5x();
        tempo_merge500 = Sort.merge5x();
        tempo_merge1000 = Sort.merge5x();

        
        tempo_quick250 = Sort.quick5x();
        tempo_quick500 = Sort.quick5x();
        tempo_quick1000 = Sort.quick5x();

        
        tempo_heap250 = Sort.heap5x();
        tempo_heap500 = Sort.heap5x();
        tempo_heap1000 = Sort.heap5x();


        //GRÁFICOS

    }
}