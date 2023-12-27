public class MySQLConnection implements Connection {

    @Override
    public void connect() {
        
        System.out.println("Connected to MySQL Database");
    }
}
