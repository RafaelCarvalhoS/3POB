package ListaExcecoes.SistemaDeLogin.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String message) {
        super(message);
    }
}