package ifce.edu.br.semestre20231.listaencadeada;

import java.util.Objects;

public class NoEncadeado {

	private String valor;
	private NoEncadeado proximo;

	public NoEncadeado(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public NoEncadeado getProximo() {
		return proximo;
	}

	public void setProximo(NoEncadeado proximo) {
		this.proximo = proximo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		NoEncadeado encadeado = (NoEncadeado) o;
		return Objects.equals(valor, encadeado.valor) && Objects.equals(proximo, encadeado.proximo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(valor, proximo);
	}

	@Override
	public String toString() {
		return "NoEncadeado{" + "valor='" + valor + '\'' + ", proximo=" + proximo + '}';
	}
}


