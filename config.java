public class Config {
    private static Config instance;
    private String appName;
    private int maxConnections;

    private Config() {
        // Construtor privado para impedir instância direta
        appName = "Meu Aplicativo";
        maxConnections = 10;
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }
}
