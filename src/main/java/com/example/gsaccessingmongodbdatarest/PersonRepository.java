package com.example.gsaccessingmongodbdatarest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PersonRepository extends MongoRepository<Person,String> {
    List<Person> findPersonByLastName(@Param("name") String name);
}
