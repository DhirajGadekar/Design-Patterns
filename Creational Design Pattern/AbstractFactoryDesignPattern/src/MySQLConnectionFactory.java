public class MySQLConnectionFactory extends AbstractConnectionFactory {

    @Override
    Connection createConnection() {

        return new MySQLConnection();
    }
    
}
