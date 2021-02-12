package sid.org.clientservicefinalexam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import sid.org.clientservicefinalexam.entities.Client;
import sid.org.clientservicefinalexam.dao.ClientRepository;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository c, RepositoryRestConfiguration configuration
    ){
        return args -> {
            configuration.exposeIdsFor(Client.class);
            Client cl=new Client(null,"client-1","anas riani","anas.devriani@gmail.com");
            Client c2=new Client(null,"client-2","yassine riani","yassine.riani@gmail.com");
            Client c3=new Client(null,"client-3","khalid riani","khalid.riani@gmail.com");
            c.save(cl);
            c.save(c2);
            c.save(c3);
        };
    }
}
