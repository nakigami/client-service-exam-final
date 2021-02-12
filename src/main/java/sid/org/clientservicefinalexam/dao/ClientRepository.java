package sid.org.clientservicefinalexam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sid.org.clientservicefinalexam.entities.Client;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {
}
