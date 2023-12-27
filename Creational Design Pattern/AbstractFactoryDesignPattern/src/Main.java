public class Main {
    public static void main(String[] args) {
        
        Connection c1 = ConnectionFactory.getConnection(new MySQLConnectionFactory());
        c1.connect();

        Connection c2 = ConnectionFactory.getConnection(new PostgreConnectionFactory());
        c2.connect();
    }
}
