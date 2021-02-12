package sid.org.clientservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sid.org.clientservice.entities.Client;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {
}
