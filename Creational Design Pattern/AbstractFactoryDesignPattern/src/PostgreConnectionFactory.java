public class PostgreConnectionFactory extends AbstractConnectionFactory {

    @Override
    Connection createConnection() {
        
        return new PostgreSQLConnection();
    }
    
}
