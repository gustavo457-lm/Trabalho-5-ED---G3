import OrdenarPalavras;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import java.util.ArrayList;

public class Main {
    
    public static List preProcessamento(List nomes, List nomesProcessados) {
		for (int i=0; i< nomes.size(); i++) {
			String nome = ((String) nomes.get(i)).toLowerCase();
	        nome = nome.replaceAll("[^\\p{L} ]", "");
	        nomesProcessados.add(nome);
		}
		return nomesProcessados;
	}
    
    public static void main(String[] args) {

        OrdenarPalavras Sort = new OrdenarPalavras();

        Path nomes250k = Path.of("C:\\Users\\gustv\\eclipse-workspace\\algoritmosDeOrdenação\\src\\algoritmosDeOrdenação\\nomes250k.txt");
		Path nomes500k = Path.of("C:\\Users\\gustv\\eclipse-workspace\\algoritmosDeOrdenação\\src\\algoritmosDeOrdenação\\nomes500.txt");
		Path nomes1m = Path.of("C:\\Users\\gustv\\eclipse-workspace\\algoritmosDeOrdenação\\src\\algoritmosDeOrdenação\\nomes1m.txt");
		
		List<String> listanomes250 = Files.readAllLines(nomes250k);
		List<String> listanomes500 = Files.readAllLines(nomes500k);
		List<String> listanomes1m = Files.readAllLines(nomes1m);
		
		int quantPalavrasListanomes250SemPP = listanomes250.size();
		int quantPalavrasListanomes500SemPP = listanomes500.size();
		int quantPalavrasListanomes1mSemPP = listanomes1m.size();
		
		List<String> listanomes250PreProcessados = new ArrayList<>();
		List<String> listanomes500PreProcessados = new ArrayList<>();
		List<String> listanomes1mPreProcessados = new ArrayList<>();
		
		listanomes250PreProcessados = preProcessamento(listanomes250, listanomes250PreProcessados);
		listanomes500PreProcessados = preProcessamento(listanomes500, listanomes500PreProcessados);
		listanomes1mPreProcessados = preProcessamento(listanomes1m, listanomes1mPreProcessados);
		
		int quantPalavrasListanomes250ComPP = listanomes250PreProcessados.size();
		int quantPalavrasListanomes500ComPP = listanomes500PreProcessados.size();
		int quantPalavrasListanomes1mComPP = listanomes1mPreProcessados.size();
        
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
