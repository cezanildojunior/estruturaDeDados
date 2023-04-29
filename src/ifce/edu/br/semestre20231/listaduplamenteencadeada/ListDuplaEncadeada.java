package ifce.edu.br.semestre20231.listaduplamenteencadeada;

public class ListDuplaEncadeada {

	private Integer size = 0;
	private No inicio;

	/**
	 * Mecanismos de operação da lista
	 */
	public void addNoInicio(No novoNo) {
		if (inicio != null) {
			No noAntigoDoInicio = inicio;
			inicio = novoNo;
			novoNo.setProximo(noAntigoDoInicio);
			noAntigoDoInicio.setAnterior(novoNo);
		} else {
			inicio = novoNo;
		}
		this.size++;
	}

	public void add(No noNovo) {
		add(noNovo, this.inicio);
	}

	private void add(No noNovo, No noAux) {
		if (noAux == null) {
			this.inicio = noNovo;
			this.size++;
		} else {
			if (noAux.getProximo() != null) {
				add(noNovo, noAux.getProximo());
			} else {
				noAux.setProximo(noNovo);
				noNovo.setAnterior(noAux);
				this.size++;
			}
		}
	}

	public void addIndex(No noNovo, Integer size) {
		addIndex(noNovo, size - 1, inicio);
	}
	private void addIndex(No noNovo, Integer size, No target) {
		if (size == 0) {
			if (target.getProximo() != null) {
				No noAux = target.getProximo();
				target.setProximo(noNovo);
				noNovo.setProximo(noAux);
				this.size++;
			}
		} else {
			addIndex(noNovo, size - 1, target.getProximo());
			
		}
	}
	
	public void removeIndex(Integer size) {
		removeIndex(size - 1, this.inicio);
	}

	private void removeIndex(Integer size, No target) {
		if (size == 0) {
			if (target.getProximo() != null && target.getProximo().getProximo() != null) {
				target.setProximo(target.getProximo().getProximo());
			} else {
				target.setProximo(null);
			}
			this.size--;
		} else {
			removeIndex(size - 1, target.getProximo());
		}
	}
	
	//sem uso toString
	public void imprimir() {
			No deImpressao = inicio;
			while (deImpressao != null) {
				System.out.print("    " + deImpressao.getDescricao());
				deImpressao = deImpressao.getProximo();
			}
			System.out.println();
	}
	
	public int buscarIndice(String descricao) {
		int indice = -1;
		No noAtual = inicio;
		
		while(noAtual != null) {
			indice++;
			if(noAtual.getDescricao().equals(descricao)) {
				return indice;
			}
			noAtual = noAtual.getProximo();
		}
		
		return -1; //retorna -1 caso o no nao seja encontrado na lista
	}
	
	public void bubbleSort() {
		if(inicio == null) {
			return;
		}
		boolean trocou = true;
		while(trocou) {
			trocou = false;
			No atual = inicio;
			while(atual.getProximo() !=null) {
				if(buscarIndice(atual.getDescricao())> buscarIndice(atual.getProximo().getDescricao())) {
					//troca os nos
					No temp = atual.getProximo();
					atual.setProximo(temp.getProximo());
					temp.setProximo(atual);
					if(atual == inicio) {
						inicio = temp;
					}else {
						atual.getAnterior().setProximo(temp);
					}
					temp.setAnterior(atual.getAnterior());
					atual.setAnterior(temp);
					trocou = true;
				}else {
					atual = atual.getProximo();
				}
			}
		}
	}
}












