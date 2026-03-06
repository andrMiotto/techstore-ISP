import service.ClienteComumService;
import service.ClienteVipService;
import interfaces.CadastroCliente;
import interfaces.Notificador;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- TESTANDO CLIENTE COMUM ---");
        CadastroCliente serviceComum = new ClienteComumService();
        serviceComum.cadastrarCliente("João Silva", "joao@email.com");
        System.out.println(serviceComum.buscarClientePorEmail("joao@email.com"));


        System.out.println("\n--- TESTANDO CLIENTE VIP ---");
        ClienteVipService serviceVip = new ClienteVipService();

        serviceVip.cadastrarCliente("Maria VIP", "maria@vip.com");
        serviceVip.enviarNotificacao("maria@vip.com", "Bem-vinda ao clube!");
        serviceVip.aplicarDescontoVIP("maria@vip.com", 15.0);

        System.out.println("\n--- USO POLIMÓRFICO SEGURO ---");

        enviarAvisoGeral(serviceVip, "O sistema entrará em manutenção.");



    }


    public static void enviarAvisoGeral(Notificador notificador, String msg) {
        notificador.enviarNotificacao("sistema@techstore.com", msg);
    }
}