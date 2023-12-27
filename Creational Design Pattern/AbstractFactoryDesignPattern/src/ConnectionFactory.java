public class ConnectionFactory {
    
    public static Connection getConnection(AbstractConnectionFactory factory) {

        return factory.createConnection();
    }
}
