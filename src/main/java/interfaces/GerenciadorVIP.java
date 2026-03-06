package interfaces;

public interface GerenciadorVIP {

    void cadastrarCliente(String nome, String email);

    String buscarClientePorEmail(String email);

    void enviarNotificacao(String email, String mensagem);

    void aplicarDescontoVIP(String email, double percentual);


}
