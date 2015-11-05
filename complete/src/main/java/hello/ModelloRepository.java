package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ModelloRepository extends MongoRepository<Modello, String> {

    public Modello findByFirstName(String firstName);
    public List<Modello> findByLastName(String lastName);

}
