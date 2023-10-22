public class Main {
    public static void main(String[] args) {
        // Obtenha a instância da configuração
        Config config = Config.getInstance();

        // Configure as propriedades
        config.setAppName("Meu Aplicativo Incrível");
        config.setMaxConnections(20);

        // Obtenha novamente a instância da configuração
        Config anotherConfig = Config.getInstance();

        // Verifique se as instâncias são as mesmas
        if (config == anotherConfig) {
            System.out.println("As instâncias são as mesmas.");
        } else {
            System.out.println("As instâncias são diferentes.");
        }

        // Verifique as configurações
        System.out.println("Nome do Aplicativo: " + config.getAppName());
        System.out.println("Máximo de Conexões: " + config.getMaxConnections());
    }
}
