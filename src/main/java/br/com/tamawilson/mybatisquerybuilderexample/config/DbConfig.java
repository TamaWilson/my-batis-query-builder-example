package br.com.tamawilson.mybatisquerybuilderexample.config;

import com.opentable.db.postgres.embedded.EmbeddedPostgres;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@ComponentScan
public class DbConfig {

    @Bean
    @Primary
    public DataSource inMemoryDS() throws IOException {
        return EmbeddedPostgres.builder().setPort(5432)
                .start().getPostgresDatabase();
    }
}
