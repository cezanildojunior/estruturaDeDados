package ifce.edu.br.semestre20231.listaencadeada;

public class ListaEncadeada {

	private NoEncadeado inicio;
	private Integer size = 0;

	/**
	 * Mecanismos de operação da lista
	 */
	public void addNoInicio(NoEncadeado noEncadeado) {
		if (inicio != null) {
			NoEncadeado noEncadeadoTemp = inicio;
			inicio = noEncadeado;
			noEncadeado.setProximo(noEncadeadoTemp);
		} else {
			inicio = noEncadeado;
		}
		this.size++;
	}

	public void addNoFinal(NoEncadeado noEncadeado) {
		addNoFinal(noEncadeado, this.inicio);
	}

	private void addNoFinal(NoEncadeado noEncadeado, NoEncadeado noAux) {
		if (noAux == null) {
			this.inicio = noEncadeado;
			this.size++;
		} else {
			if (noAux.getProximo() != null) {
				addNoFinal(noEncadeado, noAux.getProximo());
			} else {
				noAux.setProximo(noEncadeado);
				this.size++;
			}
		}
	}

	public void addIndex(NoEncadeado noEncadeado, Integer index) {
		addIndex(noEncadeado, index - 1, inicio);
	}

	private void addIndex(NoEncadeado noEncadeado, Integer index, NoEncadeado target) {
		if (index == 0) {
			if (target.getProximo() != null) {
				NoEncadeado noAux = target.getProximo();
				target.setProximo(noEncadeado);
				noEncadeado.setProximo(noAux);
				this.size++;
			}
		} else {
			addIndex(noEncadeado, index - 1, target.getProximo());
		}
	}

	public void removeIndex(Integer index) {
		removeIndex(index - 1, this.inicio);
	}

	private void removeIndex(Integer index, NoEncadeado target) {
		if (index == 0) {
			if (target.getProximo() != null && target.getProximo().getProximo() != null) {
				target.setProximo(target.getProximo().getProximo());
			} else {
				target.setProximo(null);
			}
			this.size--;
		} else {
			removeIndex(index - 1, target.getProximo());
		}
	}

	public void remove(NoEncadeado target) {
		remove(target, this.inicio);
	}

	public void remove(NoEncadeado target, NoEncadeado controle) {
		if (target.equals(controle.getProximo())) {
			controle.setProximo(target.getProximo());
			this.size--;
		} else {
			remove(target, controle.getProximo());
		}
	}

	public NoEncadeado buscarNo(Integer index) {
		return buscarNo(index, this.inicio);
	}

	private NoEncadeado buscarNo(Integer index, NoEncadeado no) {
		if (index == 0) {
			return no;
		}
		return buscarNo(index - 1, no.getProximo());
	}
	public NoEncadeado imprimir (Integer index,NoEncadeado no) {
		if (index == 0) {
			return null;
		}
		System.out.println("imprimir : "+no);
		index--;
		System.out.println("imprimirEncadeado : "+no);
		System.out.println("");
		return imprimir ( index, no);
	}
}