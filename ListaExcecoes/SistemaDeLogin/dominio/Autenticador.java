package ListaExcecoes.SistemaDeLogin.dominio;

public class Autenticador {

    public void autenticar(String usuario, String senha) throws LoginInvalidoException {
        if (usuario == null || usuario.trim().isEmpty()) {
            throw new LoginInvalidoException("O nome de usuário não pode ser vazio.");
        }
        if (senha == null || senha.trim().isEmpty()) {
            throw new LoginInvalidoException("A senha não pode ser vazia.");
        }

        System.out.println("Usuário '" + usuario + "' autenticado com sucesso! (Simulado)");
    }
}