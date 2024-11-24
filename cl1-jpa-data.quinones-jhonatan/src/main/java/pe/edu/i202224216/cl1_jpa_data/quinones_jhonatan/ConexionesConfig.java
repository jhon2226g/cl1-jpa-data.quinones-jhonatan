package pe.edu.i202224216.cl1_jpa_data.quinones_jhonatan;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;



@Configuration
public class ConexionesConfig {
	
	 @Value("${DB_WORLD_URL}")
	    private String dbWorldUrl;
	    @Value("${DB_WORLD_USER}")
	    private String dbWorldUser;
	    @Value("${DB_WORLD_PASS}")
	    private String dbWorldPass;
	    @Value("${DB_WORLD_DRIVER}")
	    private String dbWorldDriver;


	@Bean
    public HikariDataSource hikariDataSource() {

		HikariConfig config = new HikariConfig();

        config.setJdbcUrl(dbWorldUrl);
        config.setUsername(dbWorldUser);
        config.setPassword(dbWorldPass);
        config.setDriverClassName(dbWorldDriver);

      
        config.setMaximumPoolSize(30);
        config.setMinimumIdle(4);
        config.setIdleTimeout(240000);
        config.setConnectionTimeout(45000);

        System.out.println("###### HikariCP initialized ######");
        return new HikariDataSource(config);

    }
	
}
