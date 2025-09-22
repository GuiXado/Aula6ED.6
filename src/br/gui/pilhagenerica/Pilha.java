package br.gui.pilhagenerica;

public class Pilha<T> {
	No<T> topo;

	public Pilha() {
		topo = null;
	}

	// Teste de pilha vazia
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}

	public void push(T e) {
		No<T> elemento = new No<>();
		elemento.dado = e;
		if (isEmpty() /* == true */) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}

	public T pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos para desempilhar.");
		}
		T valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

	public T top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos para desempilhar.");
		}
		T valor = topo.dado;
		return valor;
	}

	public int size() {
		int cont = 0;
		if (!isEmpty() /* == false */) {
			No<T> auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}
}
