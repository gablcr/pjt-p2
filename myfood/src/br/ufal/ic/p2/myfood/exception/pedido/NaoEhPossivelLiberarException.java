package br.ufal.ic.p2.myfood.exception.pedido;

public class NaoEhPossivelLiberarException extends Exception {
	public NaoEhPossivelLiberarException() {
		super("Nao e possivel liberar um produto que nao esta sendo preparado");
	}
}

