import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {

    public static Connection conectar() throws Exception {

        String url = "jdbc:mysql://localhost:3306/escola_notas";
        String user = "root";
        String password = "Vinicius2006@@";

        return DriverManager.getConnection(url, user, password);
    }
}
