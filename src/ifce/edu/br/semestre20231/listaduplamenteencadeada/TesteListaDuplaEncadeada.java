package ifce.edu.br.semestre20231.listaduplamenteencadeada;

public class TesteListaDuplaEncadeada {

	public static void main(String[] args) {
		ListDuplaEncadeada listaDuplaEncadeada = new ListDuplaEncadeada();

		listaDuplaEncadeada.addNoInicio(new No("No Inicio 1"));
		listaDuplaEncadeada.add(new No("No 2"));
		listaDuplaEncadeada.add(new No("No 3"));
		listaDuplaEncadeada.imprimir();
		listaDuplaEncadeada.addIndex( new No("No 4"),2);
		listaDuplaEncadeada.imprimir();
		listaDuplaEncadeada.removeIndex(1);		
		listaDuplaEncadeada.imprimir();
		listaDuplaEncadeada.add(new No("No 2"));
		listaDuplaEncadeada.imprimir();
		System.out.println("    na posicao: "+listaDuplaEncadeada.buscarIndice("No 2"));
		
		
		listaDuplaEncadeada.bubbleSort();
		listaDuplaEncadeada.imprimir();
		
		listaDuplaEncadeada.addIndex(new No("No 8"), 2);
		listaDuplaEncadeada.imprimir();
		/*
		 * listaDuplaEncadeada.addIndex(new No("No 4 Index 1"), 1);
		 * System.out.println(listaDuplaEncadeada);
		 * 
		 * listaDuplaEncadeada.removeIndex(1); System.out.println(listaDuplaEncadeada);
		 */
	}
}

