package ifce.edu.br.semestre20231.listaencadeada;

public class TesteListaEncadeada {

	public static void main(String[] args) {

		ListaEncadeada lista = new ListaEncadeada();
		//System.out.println(lista);

		NoEncadeado encadeado = new NoEncadeado("No Start");
		lista.addNoInicio(encadeado);
		//System.out.println(lista);

		lista.addNoInicio(new NoEncadeado("No 1"));
		lista.addNoInicio(new NoEncadeado("No 2"));
		lista.addNoInicio(new NoEncadeado("No 3"));
		lista.addNoInicio(new NoEncadeado("No 4"));
		//System.out.println(lista);

		lista.addNoFinal(new NoEncadeado("No 6"));
		//System.out.println(lista);

		lista.addIndex(new NoEncadeado("No 7"), 3);
		//System.out.println(lista);

		lista.removeIndex(3);
		//System.out.println(lista);

		lista.remove(encadeado);
		//System.out.println(lista);

		System.out.println(lista.buscarNo(2));
		
		lista.imprimir(3, encadeado);
	}
}


