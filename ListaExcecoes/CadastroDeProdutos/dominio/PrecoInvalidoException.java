package ListaExcecoes.CadastroDeProdutos.dominio;

public class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException(String message) {
        super(message);
    }

    public PrecoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }
}