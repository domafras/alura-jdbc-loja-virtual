import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSouce = new ComboPooledDataSource();
		comboPooledDataSouce.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSouce.setUser("root");
		comboPooledDataSouce.setPassword("root");
		
		comboPooledDataSouce.setMaxPoolSize(15);
		
		this.dataSource = comboPooledDataSouce;
	}
	
	public Connection recuperarConexao() throws SQLException {
		return this.dataSource.getConnection();
	}
}
