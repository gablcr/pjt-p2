package br.ufal.ic.p2.myfood.exception.usuario;

public class UsuarioNaoCadastradoException extends Exception {
    public UsuarioNaoCadastradoException() {
        super("Usuario nao cadastrado.");
    }
}
